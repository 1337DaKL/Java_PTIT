/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.Java_PTIT.baitapPTITI;

/**
 *
 * @author daklp
 */
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class QuanLyTinhCong extends JFrame {
    private static final String FILE_CN = "CN.TXT";
    private static final String FILE_SP = "SP.TXT";
    private static final String FILE_TINHCONG = "TINHCONG.TXT";

    private JTable tableCongNhan, tableSanPham, tableTinhCong;
    private DefaultTableModel modelCongNhan, modelSanPham, modelTinhCong;

    private List<CongNhan> dsCongNhan = new ArrayList<>();
    private List<SanPham> dsSanPham = new ArrayList<>();
    private List<BangTinhCong> dsTinhCong = new ArrayList<>();

    public QuanLyTinhCong() {
        setTitle("Quản Lý Tính Công Theo Sản Phẩm");
        setSize(900, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JTabbedPane tabbedPane = new JTabbedPane();

        // Tab Quản lý Công nhân
        JPanel panelCongNhan = new JPanel(new BorderLayout());
        modelCongNhan = new DefaultTableModel(new String[]{"Mã CN", "Họ Tên", "Địa Chỉ", "Ca Sản Xuất"}, 0);
        tableCongNhan = new JTable(modelCongNhan);
        panelCongNhan.add(new JScrollPane(tableCongNhan), BorderLayout.CENTER);

        JPanel formCongNhan = new JPanel(new GridLayout(2, 4, 10, 10));
        JTextField txtHoTenCN = new JTextField();
        JTextField txtDiaChiCN = new JTextField();
        JComboBox<String> cbCaSanXuat = new JComboBox<>(new String[]{"Ca sáng", "Ca chiều", "Ca đêm"});
        JButton btnThemCN = new JButton("Thêm Công Nhân");

        formCongNhan.add(new JLabel("Họ Tên:"));
        formCongNhan.add(txtHoTenCN);
        formCongNhan.add(new JLabel("Địa Chỉ:"));
        formCongNhan.add(txtDiaChiCN);
        formCongNhan.add(new JLabel("Ca Sản Xuất:"));
        formCongNhan.add(cbCaSanXuat);
        formCongNhan.add(new JLabel());
        formCongNhan.add(btnThemCN);

        panelCongNhan.add(formCongNhan, BorderLayout.SOUTH);
        tabbedPane.addTab("Quản lý Công Nhân", panelCongNhan);

        btnThemCN.addActionListener(e -> {
            try {
                String hoTen = txtHoTenCN.getText().trim();
                String diaChi = txtDiaChiCN.getText().trim();
                String caSanXuat = (String) cbCaSanXuat.getSelectedItem();
                if (hoTen.isEmpty() || diaChi.isEmpty()) throw new IllegalArgumentException("Không được để trống!");
                CongNhan cn = new CongNhan(hoTen, diaChi, caSanXuat);
                dsCongNhan.add(cn);
                modelCongNhan.addRow(new Object[]{cn.getMaCN(), cn.getHoTen(), cn.getDiaChi(), cn.getCaSanXuat()});
                saveToFile(FILE_CN, dsCongNhan);
                JOptionPane.showMessageDialog(this, "Thêm công nhân thành công!");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Lỗi: " + ex.getMessage());
            }
        });

        // Tab Quản lý Sản phẩm
        JPanel panelSanPham = new JPanel(new BorderLayout());
        modelSanPham = new DefaultTableModel(new String[]{"Mã SP", "Tên SP", "Đơn Giá"}, 0);
        tableSanPham = new JTable(modelSanPham);
        panelSanPham.add(new JScrollPane(tableSanPham), BorderLayout.CENTER);

        JPanel formSanPham = new JPanel(new GridLayout(2, 3, 10, 10));
        JTextField txtTenSP = new JTextField();
        JTextField txtDonGiaSP = new JTextField();
        JButton btnThemSP = new JButton("Thêm Sản Phẩm");

        formSanPham.add(new JLabel("Tên SP:"));
        formSanPham.add(txtTenSP);
        formSanPham.add(new JLabel("Đơn Giá:"));
        formSanPham.add(txtDonGiaSP);
        formSanPham.add(new JLabel());
        formSanPham.add(btnThemSP);

        panelSanPham.add(formSanPham, BorderLayout.SOUTH);
        tabbedPane.addTab("Quản lý Sản Phẩm", panelSanPham);

        btnThemSP.addActionListener(e -> {
            try {
                String tenSP = txtTenSP.getText().trim();
                double donGia = Double.parseDouble(txtDonGiaSP.getText().trim());
                if (tenSP.isEmpty() || donGia <= 0) throw new IllegalArgumentException("Dữ liệu không hợp lệ!");
                SanPham sp = new SanPham(tenSP, donGia);
                dsSanPham.add(sp);
                modelSanPham.addRow(new Object[]{sp.getMaSP(), sp.getTenSP(), sp.getDonGia()});
                saveToFile(FILE_SP, dsSanPham);
                JOptionPane.showMessageDialog(this, "Thêm sản phẩm thành công!");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Lỗi: " + ex.getMessage());
            }
        });

        // Tab Bảng tính công
        JPanel panelTinhCong = new JPanel(new BorderLayout());
        modelTinhCong = new DefaultTableModel(new String[]{"Công Nhân", "Sản Phẩm", "Số Lượng"}, 0);
        tableTinhCong = new JTable(modelTinhCong);
        panelTinhCong.add(new JScrollPane(tableTinhCong), BorderLayout.CENTER);
        tabbedPane.addTab("Bảng Tính Công", panelTinhCong);

        add(tabbedPane);
        loadFromFile();
    }

    private void saveToFile(String fileName, List<?> list) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(list);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void loadFromFile() {
        dsCongNhan = (List<CongNhan>) loadFromFile(FILE_CN);
        dsCongNhan.forEach(cn -> modelCongNhan.addRow(new Object[]{cn.getMaCN(), cn.getHoTen(), cn.getDiaChi(), cn.getCaSanXuat()}));

        dsSanPham = (List<SanPham>) loadFromFile(FILE_SP);
        dsSanPham.forEach(sp -> modelSanPham.addRow(new Object[]{sp.getMaSP(), sp.getTenSP(), sp.getDonGia()}));
    }

    private Object loadFromFile(String fileName) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            return ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            return new ArrayList<>();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new QuanLyTinhCong().setVisible(true));
    }
}

class CongNhan implements Serializable {
    private static int idCounter = 10000;
    private final int maCN;
    private final String hoTen, diaChi, caSanXuat;

    public CongNhan(String hoTen, String diaChi, String caSanXuat) {
        this.maCN = idCounter++;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.caSanXuat = caSanXuat;
    }

    public int getMaCN() {
        return maCN;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getCaSanXuat() {
        return caSanXuat;
    }
}

class SanPham implements Serializable {
    private static int idCounter = 10000;
    private final int maSP;
    private final String tenSP;
    private final double donGia;

    public SanPham(String tenSP, double donGia) {
        this.maSP = idCounter++;
        this.tenSP = tenSP;
        this.donGia = donGia;
    }

    public int getMaSP() {
        return maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public double getDonGia() {
        return donGia;
    }
}

class BangTinhCong implements Serializable {
    private final CongNhan congNhan;
    private final SanPham sanPham;
    private final int soLuong;

    public BangTinhCong(CongNhan congNhan, SanPham sanPham, int soLuong) {
        this.congNhan = congNhan;
        this.sanPham = sanPham;
        this.soLuong = soLuong;
    }
}

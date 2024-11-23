package javaapplication1.Java_PTIT.baitapPTITI.GUI;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;

public class QuanLyTinhCong extends JFrame {
    private static final String FILE_CN = "CN.TXT";
    private static final String FILE_SP = "SP.TXT";

    private JTable tableCongNhan, tableSanPham;
    private DefaultTableModel modelCongNhan, modelSanPham;

    private List<CongNhan> dsCongNhan = new ArrayList<>();
    private List<SanPham> dsSanPham = new ArrayList<>();

    public QuanLyTinhCong() {
        setTitle("Quản Lý Tính Công Theo Sản Phẩm");
        setSize(900, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JTabbedPane tabbedPane = new JTabbedPane();

        // Tab Quản lý Công nhân
        JPanel panelCongNhan = createCongNhanTab();
        tabbedPane.addTab("Quản lý Công Nhân", panelCongNhan);

        // Tab Quản lý Sản phẩm
        JPanel panelSanPham = createSanPhamTab();
        tabbedPane.addTab("Quản lý Sản Phẩm", panelSanPham);

        add(tabbedPane);
        loadFromFile();
    }

    private JPanel createCongNhanTab() {
        JPanel panel = new JPanel(new BorderLayout());
        modelCongNhan = new DefaultTableModel(new String[]{"Mã CN", "Họ Tên", "Địa Chỉ", "Ca Sản Xuất"}, 0);
        tableCongNhan = new JTable(modelCongNhan);
        panel.add(new JScrollPane(tableCongNhan), BorderLayout.CENTER);

        JPanel form = new JPanel(new GridLayout(3, 4, 10, 10));
        JTextField txtHoTen = new JTextField();
        JTextField txtDiaChi = new JTextField();
        JComboBox<String> cbCaSanXuat = new JComboBox<>(new String[]{"Ca sáng", "Ca chiều", "Ca đêm"});
        JButton btnThem = new JButton("Thêm");
        JButton btnXoa = new JButton("Xóa");
        JButton btnCapNhat = new JButton("Cập Nhật");

        form.add(new JLabel("Họ Tên:"));
        form.add(txtHoTen);
        form.add(new JLabel("Địa Chỉ:"));
        form.add(txtDiaChi);
        form.add(new JLabel("Ca Sản Xuất:"));
        form.add(cbCaSanXuat);
        form.add(btnThem);
        form.add(btnXoa);
        form.add(btnCapNhat);

        panel.add(form, BorderLayout.SOUTH);

        // Sự kiện Thêm
        btnThem.addActionListener(e -> {
            try {
                String hoTen = txtHoTen.getText().trim();
                String diaChi = txtDiaChi.getText().trim();
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

        // Sự kiện Xóa
        btnXoa.addActionListener(e -> {
            int selectedRow = tableCongNhan.getSelectedRow();
            if (selectedRow != -1) {
                dsCongNhan.remove(selectedRow);
                modelCongNhan.removeRow(selectedRow);
                saveToFile(FILE_CN, dsCongNhan);
                JOptionPane.showMessageDialog(this, "Xóa công nhân thành công!");
            } else {
                JOptionPane.showMessageDialog(this, "Chọn công nhân để xóa!");
            }
        });

        // Sự kiện Cập nhật
        btnCapNhat.addActionListener(e -> {
            int selectedRow = tableCongNhan.getSelectedRow();
            if (selectedRow != -1) {
                try {
                    String hoTen = txtHoTen.getText().trim();
                    String diaChi = txtDiaChi.getText().trim();
                    String caSanXuat = (String) cbCaSanXuat.getSelectedItem();
                    if (hoTen.isEmpty() || diaChi.isEmpty()) throw new IllegalArgumentException("Không được để trống!");
                    CongNhan cn = dsCongNhan.get(selectedRow);
                    cn.setHoTen(hoTen);
                    cn.setDiaChi(diaChi);
                    cn.setCaSanXuat(caSanXuat);
                    modelCongNhan.setValueAt(hoTen, selectedRow, 1);
                    modelCongNhan.setValueAt(diaChi, selectedRow, 2);
                    modelCongNhan.setValueAt(caSanXuat, selectedRow, 3);
                    saveToFile(FILE_CN, dsCongNhan);
                    JOptionPane.showMessageDialog(this, "Cập nhật công nhân thành công!");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, "Lỗi: " + ex.getMessage());
                }
            } else {
                JOptionPane.showMessageDialog(this, "Chọn công nhân để cập nhật!");
            }
        });

        return panel;
    }

    private JPanel createSanPhamTab() {
        JPanel panel = new JPanel(new BorderLayout());
        modelSanPham = new DefaultTableModel(new String[]{"Mã SP", "Tên SP", "Đơn Giá"}, 0);
        tableSanPham = new JTable(modelSanPham);
        panel.add(new JScrollPane(tableSanPham), BorderLayout.CENTER);

        JPanel form = new JPanel(new GridLayout(3, 4, 10, 10));
        JTextField txtTenSP = new JTextField();
        JTextField txtDonGia = new JTextField();
        JButton btnThem = new JButton("Thêm");
        JButton btnXoa = new JButton("Xóa");
        JButton btnCapNhat = new JButton("Cập Nhật");

        form.add(new JLabel("Tên SP:"));
        form.add(txtTenSP);
        form.add(new JLabel("Đơn Giá:"));
        form.add(txtDonGia);
        form.add(btnThem);
        form.add(btnXoa);
        form.add(btnCapNhat);

        panel.add(form, BorderLayout.SOUTH);

        // Sự kiện Thêm
        btnThem.addActionListener(e -> {
            try {
                String tenSP = txtTenSP.getText().trim();
                double donGia = Double.parseDouble(txtDonGia.getText().trim());
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

        // Sự kiện Xóa
        btnXoa.addActionListener(e -> {
            int selectedRow = tableSanPham.getSelectedRow();
            if (selectedRow != -1) {
                dsSanPham.remove(selectedRow);
                modelSanPham.removeRow(selectedRow);
                saveToFile(FILE_SP, dsSanPham);
                JOptionPane.showMessageDialog(this, "Xóa sản phẩm thành công!");
            } else {
                JOptionPane.showMessageDialog(this, "Chọn sản phẩm để xóa!");
            }
        });

        // Sự kiện Cập nhật
        btnCapNhat.addActionListener(e -> {
            int selectedRow = tableSanPham.getSelectedRow();
            if (selectedRow != -1) {
                try {
                    String tenSP = txtTenSP.getText().trim();
                    double donGia = Double.parseDouble(txtDonGia.getText().trim());
                    if (tenSP.isEmpty() || donGia <= 0) throw new IllegalArgumentException("Dữ liệu không hợp lệ!");
                    SanPham sp = dsSanPham.get(selectedRow);
                    sp.setTenSP(tenSP);
                    sp.setDonGia(donGia);
                    modelSanPham.setValueAt(tenSP, selectedRow, 1);
                    modelSanPham.setValueAt(donGia, selectedRow, 2);
                    saveToFile(FILE_SP, dsSanPham);
                    JOptionPane.showMessageDialog(this, "Cập nhật sản phẩm thành công!");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, "Lỗi: " + ex.getMessage());
                }
            } else {
                JOptionPane.showMessageDialog(this, "Chọn sản phẩm để cập nhật!");
            }
        });

        return panel;
    }

    private void saveToFile(String fileName, List<?> list) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(list);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Lỗi lưu dữ liệu: " + e.getMessage());
        }
    }

    private void loadFromFile() {
        dsCongNhan = loadFromFile(FILE_CN);
        dsSanPham = loadFromFile(FILE_SP);
        dsCongNhan.forEach(cn -> modelCongNhan.addRow(new Object[]{cn.getMaCN(), cn.getHoTen(), cn.getDiaChi(), cn.getCaSanXuat()}));
        dsSanPham.forEach(sp -> modelSanPham.addRow(new Object[]{sp.getMaSP(), sp.getTenSP(), sp.getDonGia()}));
    }

    @SuppressWarnings("unchecked")
    private <T> List<T> loadFromFile(String fileName) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            return (List<T>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            return new ArrayList<>();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new QuanLyTinhCong().setVisible(true));
    }
}

package baitapPTITI;

import java.util.*;

class Point {
    private double x;
    private double y;

    protected Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    protected double khoangCach(Point b) {
        return Math.sqrt(Math.pow(this.x - b.x, 2) + Math.pow(this.y - b.y, 2));
    }
}

public class J04009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine();  // Bỏ qua dòng trắng sau khi nhập số test
        while (test-- > 0) {
            Point a = new Point(sc.nextDouble(), sc.nextDouble());
            Point b = new Point(sc.nextDouble(), sc.nextDouble());
            Point c = new Point(sc.nextDouble(), sc.nextDouble());

            double ab = a.khoangCach(b);
            double ac = a.khoangCach(c);
            double bc = b.khoangCach(c);

            // Kiểm tra tam giác có hợp lệ hay không
            if (ab + ac <= bc || ab + bc <= ac || ac + bc <= ab) {
                System.out.println("INVALID");
            } else {
                // Tính nửa chu vi tam giác
                double p = (ab + ac + bc) / 2;

                // Tính diện tích tam giác theo công thức Heron
                double s = Math.sqrt(p * (p - ab) * (p - ac) * (p - bc));

                // In ra kết quả với 2 chữ số sau dấu phẩy
                System.out.println(String.format("%.02f", s));
            }
        }
        sc.close(); // Đóng scanner
    }
}

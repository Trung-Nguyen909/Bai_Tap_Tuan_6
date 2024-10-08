import java.util.Scanner;

public class HinhChuNhat {
    private double chieuDai;
    private double chieuRong;

    public HinhChuNhat(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }
    public double tinhDienTich() {
        return chieuDai * chieuRong;
    }
    public double tinhChuVi() {
        return 2 * (chieuDai + chieuRong);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap chieu dai: ");
        double chieuDai = sc.nextDouble();s

        System.out.print("Nhap chieu rong: ");
        double chieuRong = sc.nextDouble();
        HinhChuNhat hinhChuNhat = new HinhChuNhat(chieuDai, chieuRong);

        // In kết quả ra màn hình
        System.out.println("Dien tich hinh chu nhat: " + hinhChuNhat.tinhDienTich());
        System.out.println("Chu vi hinh chu nhat: " + hinhChuNhat.tinhChuVi());
    }
}
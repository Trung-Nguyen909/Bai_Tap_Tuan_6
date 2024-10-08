package Bai2;

import java.util.Scanner;

public class Sinhvien {
    String masv;
    String ten;
    String ngaysinh;
    double dtb;
    void nhapthongtin()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ma sv:");
        masv =sc.nextLine();
        System.out.println("nhap ten: ");
        ten =sc.nextLine();
        System.out.println("nhap ngay sinh: ");
        ngaysinh = sc.nextLine();
        System.out.println("nhap diem trung binh: ");
        dtb = sc.nextDouble();
    }
    void inthongtin()
    {
        System.out.println("ma sv: "+masv);
        System.out.println("ten: "+ ten);
        System.out.println("ngay sinh: "+ngaysinh);
        System.out.println("diem trung binh: "+dtb);
    }
    public double getDtb() {
        return dtb;
    }
}

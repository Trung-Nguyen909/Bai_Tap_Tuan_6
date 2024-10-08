package Bai1;
import java.util.Scanner;

class hihchunhat
{
    double chieudai, chieurong;
    double dientich(double a, double b)
    {
        return a*b;
    }
    double chuvi(double a, double b)
    {
        return (a+b)*2;
    }
}
public class HCN {
    public static void main(String[] args) {
        hihchunhat h1 = new hihchunhat();
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap lan luot chieu dai va chieu rong: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println("dien tich hinh chu nhat la: " + h1.dientich(a, b));
        System.out.println("chu vi hinh chu nhat la: " + h1.chuvi(a, b));
    }
}

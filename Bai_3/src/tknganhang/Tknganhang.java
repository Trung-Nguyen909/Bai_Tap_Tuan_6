/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tknganhang;
import java.util.ArrayList;
import java.util.Scanner;
public class Tknganhang {
 public static Scanner sc=new Scanner(System.in);
    protected String stk, chutk;
    protected double sodu;

    @Override
    public String toString() {
        return "Tknganhang{" + "stk=" + stk + ", chutk=" + chutk + ", sodu=" + sodu + '}';
    }
    public static void nhap(){
        System.out.println("nhập số tài khoản: ");
        String stk = sc.nextLine();
        System.out.println("nhập tên tài khoản");
        String chutk = sc.nextLine();
    }
    public Tknganhang(String stk, String chutk, double sodu) {
        this.stk = stk;
        this.chutk = chutk;
        this.sodu = sodu;
    }
    public double Guitien(double tiengui){
        return sodu+=tiengui;
    }
     public double ruttien(double tienrut){
         if (tienrut>sodu)
             System.out.println("Số tiền rút vượt quá số dư");
         else
            sodu-=tienrut;
     return 0;
    }
    public static void main(String[] args) {
      Tknganhang tk = new Tknganhang("", "", 0);
        tk.nhap();
          boolean ktr= true;
          while (ktr==true){
           System.out.println("1. Gửi tiền");
           System.out.println("2. Rút tiền");
           System.out.println("3. Xem số dư");
           System.out.println("4. Thoat");
           System.out.println("Nhap lua chon: ");
           int lc = sc.nextInt();
           switch (lc) {
                case 1:
                    System.out.print("Nhập số tiền muốn gửi: ");
                    double tiengui= sc.nextDouble();
                    tk.Guitien(tiengui);
                    break;
                case 2:
                    System.out.print("Nhập số tiền muốn rút: ");
                    double tienrut= sc.nextDouble();
                    tk.ruttien(tienrut);
                    break;
                case 3:
                    System.out.println("Số dư: "+ tk.sodu);
                    break;
                case 4:
                    ktr=false;
                    break;
                default:
                    break;
          }
        
    }
    }
}

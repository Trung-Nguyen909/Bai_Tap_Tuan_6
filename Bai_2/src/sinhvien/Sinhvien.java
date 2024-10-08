/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sinhvien;
import java.util.*;
public class Sinhvien {
    public static Scanner sc=new Scanner(System.in);
    public static ArrayList<Sinhvien> arr;
    protected String masv, tensv, ngsinh;
    protected double dtb;
    public Sinhvien(String masv, String tensv, String ngsinh, double dtb) {
        this.masv = masv;
        this.tensv = tensv;
        this.ngsinh = ngsinh;
        this.dtb = dtb;
    }
    

    @Override
    public String toString() {
        return "Sinhvien{" + "masv=" + masv + ", tensv=" + tensv + ", ngsinh=" + ngsinh + ", dtb=" + dtb + '}';
    }
    
    public static void nhap(){
        System.out.println("nhập mã sinh viên");
        String masv = sc.nextLine();
        sc.nextLine();
        System.out.println("nhập tên sinh viên");
        String tensv = sc.nextLine();
        System.out.println("nhập ngày sinh");
        String ngsinh = sc.nextLine();
        System.out.println("nhập điểm trung bình");
        double dtb= sc.nextDouble();
        Sinhvien sv= new Sinhvien(masv, tensv, ngsinh, dtb);
        arr.add(sv);   
    }
    public static void In(){
        for(Sinhvien x:arr)
            System.out.println(x);
    }
     public static void Sapxep(){
        Collections.sort(arr, new Comparator<Sinhvien>(){
            public int compare(Sinhvien o1, Sinhvien o2){
                if(o1.dtb<o2.dtb)
                    return -1;
                else
                    return 1;
            }
        });
    }
    public static void main(String[] args) {
          arr = new ArrayList<>();
          boolean ktr= true;
          while (ktr==true){
           System.out.println("1. Them sinh vien");
           System.out.println("2. Sap xep sinh vien theo diem tb giam dan");
           System.out.println("3. in danh sach sinh vien");
           System.out.println("4. Thoat");
           System.out.println("Nhap lua chon: ");
           int lc = sc.nextInt();
           switch (lc) {
                case 1:
                    nhap();
                    break;
                case 2:
                    Sapxep();
                    break;
                case 3:
                    In();
                    break;
                case 4:
                    ktr=false;
                    break;
                default:
                    break;
          }
    }
    
    }}

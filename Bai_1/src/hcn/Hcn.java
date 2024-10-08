/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hcn;

import java.util.Scanner;
public class Hcn {
    protected  double dai;
    protected  double rong;
    public Hcn() {
        this.dai = 0;
        this.rong = 0;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chiều dài");
        this.dai = sc.nextDouble();
        System.out.println("Nhập chiều rộng");
        this.rong = sc.nextDouble();
    }
    public double tinhdt() {
        return dai * rong;
    }
    public double tinhcv() {
        return 2 * (dai + rong);
    }
    public void in() {
        System.out.println("Chiều dài: " + this.dai);
        System.out.println("Chiều rộng: " + this.rong);
        System.out.println("Diện tích: " + this.tinhdt());
        System.out.println("Chu vi: " + this.tinhcv());
    }
    public static void main(String[] args) {
        Hcn hcn = new Hcn();
        hcn.nhap();
        hcn.in();

    }
}


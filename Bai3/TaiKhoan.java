package Bai3;

import java.util.Scanner;

public class TaiKhoan {
    String soTk;
    String chuTk;
    double dodu=0;

    public TaiKhoan() {
    }
    void guitien(Scanner sc)
    {
        System.out.println("so tien co du trong vi: "+ dodu);
        System.out.println("ban muon nap bao nhieu: ");
        double nap = sc.nextDouble();
        dodu += nap;
        System.out.println("so du hien tai: "+dodu);
    }
    void kiemtra()
    {
        System.out.println("so du hien tai la: "+dodu);
    }
    void ruttien(Scanner sc)
    {
        double rut;
        System.out.println("so du trong vi hien tai la: "+dodu);
        System.out.println("ban muon rut bao nhieu: ");
        rut = sc.nextDouble();
        while (rut>dodu)
        {
            System.out.println("so tien ban rut lon hon so du con trong vi, vui long nhap lai");
            rut = sc.nextDouble();
        }
        System.out.println("ban vua moi rut: "+rut);
        dodu -=rut;
        System.out.println("so tien con lai trong vi la: "+dodu);
    }
    void nhap(Scanner sc)
    {
        int chon;
        do {
            System.out.println("----------------\nvui long chon: ");
            System.out.println("1.gui tien\n2.rut tien\n3.kiem tra so du\n4.thoat");
            chon = sc.nextInt();
            switch (chon)
            {
                case 1: guitien(sc); break;
                case 2: ruttien(sc); break;
                case 3: kiemtra();break;
                case 4: break;
            }
        }while (chon!=4);
    }
}

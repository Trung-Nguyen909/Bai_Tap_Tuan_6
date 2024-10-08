package Bai2;

import java.util.*;

public class qlsinhvien {
    List<Sinhvien> qlsinhvien;

    public qlsinhvien() {
        this.qlsinhvien = new ArrayList<>();
    }
    void themsinhvien(Sinhvien sv)
    {
        qlsinhvien.add(sv);
    }
    void nhap()
    {
        Sinhvien sv;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so luong sinh vien: ");
        int n = sc.nextInt();
        int chon=1;
        for (int i = 0; i < n; i++) {
            sv = new Sinhvien();
            sv.nhapthongtin();
            themsinhvien(sv);
        }
        while (chon!=0)
        {
            System.out.println("1. thoat\n2. in thong tin\n3.sap xep theo dtb");
            chon = sc.nextInt();
            switch (chon)
            {
                case 1:
                {
                    break;
                }
                case 2:
                {
                    for (Sinhvien hs : qlsinhvien)
                    {
                        hs.inthongtin();
                    }

                    break;
                }
                case 3:
                {
                    sapxep();
                    break;
                }
            }
        }
    }
    void sapxep()
    {
        Collections.sort(qlsinhvien, new Comparator<Sinhvien>() {
            public int compare(Sinhvien o1, Sinhvien o2) {
                return (int) (o2.getDtb() - o1.getDtb());
            }
        });
        for (Sinhvien hs : qlsinhvien)
        {
            hs.inthongtin();
        }
    }
}

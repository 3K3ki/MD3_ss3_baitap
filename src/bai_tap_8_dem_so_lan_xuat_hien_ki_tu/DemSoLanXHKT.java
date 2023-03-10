package bai_tap_8_dem_so_lan_xuat_hien_ki_tu;

import java.util.Scanner;

public class DemSoLanXHKT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] name = {"dem","lan","xuat","ki","dem","dem"};

//        System.out.println("Nhap 1 ki tu bat ki: ");
        String name1 = "dem";
        int count = 0;
        for (int i = 0; i < name.length; i++) {
            if(name1 == name[i]) {
                count++;
            }
        }
        System.out.println("lan xuat hien: " + count);
    }
}

package bai_tap_1_xoa_phan_tu_khoi_mang;

import java.util.Arrays;
import java.util.Scanner;


public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Bước 1: Khai báo và khởi tạo mảng số nguyên gồm N phần tử cho trước.
        int[] array = {1, 2, 3, 4, 5};

        // Bước 2: Nhập X là phần tử cần xoá
        System.out.print("Nhập phần tử cần xoá: ");
        int x = sc.nextInt();

        // Bước 3: Tìm X xem có xuất hiện trong mảng không.
        int index_del = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                index_del = i;
                System.out.println("Phan tu ở vi tri: "+index_del);
                break;
            }
        }
        for (int j = x; j < array.length - 1; j++) {
            array[j] = array[j + 1];
        }
       int[] array1 = Arrays.copyOf(array, array.length - 1);
        System.out.println("Mang sau khi xóa vi tri " + x + " : " + Arrays.toString(array1));
    }
}

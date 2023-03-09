package bai_tap_2_them_phan_tu_vao_mang;

import java.util.Arrays;
import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bước 1: Khai báo và khởi tạo mảng số nguyên gồm N phần tử cho trước.
        int[] array = {1, 2, 3, 4, 5};
        // Bước 2: Nhập X là phần tử cần xoá
        System.out.print("Nhập phần tử thêm: ");
        int x = scanner.nextInt();
        for (int i = x; i < array.length + 1; i++) {
            array[i] = array[i - 1];
        }
        int[] array1 = Arrays.copyOf(array, array.length + 1);
        System.out.println("Mang sau khi thêm vi tri " + x + " : " + Arrays.toString(array1));
    }
}

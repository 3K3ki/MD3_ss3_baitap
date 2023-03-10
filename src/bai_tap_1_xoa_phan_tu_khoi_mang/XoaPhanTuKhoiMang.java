package bai_tap_1_xoa_phan_tu_khoi_mang;

import java.util.Arrays;
import java.util.Scanner;


public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Bước 1: Khai báo và khởi tạo mảng số nguyên gồm N phần tử cho trước
        int[] array = { 3, 6, 9, 12, 15, 18 };
        int n = array.length;
        // Bước 2: Nhập X là phần tử cần xoá
        System.out.print("Nhập phần tử cần xoá: ");
        int x = scanner.nextInt();
        // Bước 3: Tìm X xem có xuất hiện trong mảng không. Nếu xuất hiện chỉ ra vị trí của X.
        int index_del = -1;
        for (int i = 0; i < n; i++) {
            if (array[i] == x) {
                index_del = i;
                break;
            }
        }
        if (index_del == -1) {
            System.out.println("Không tìm thấy phần tử cần xoá trong mảng.");
        } else {
            // Bước 4: Thực hiện xoá phần tử X khỏi mảng
            for (int i = index_del; i < n - 1; i++) {
                array[i] = array[i + 1];
            }

            n--;

            // Bước 5: In ra mảng sau khi xoá phần tử X
            System.out.print("Mảng sau khi xoá phần tử " + x + " là: ");
            for (int i = 0; i < n; i++) {
                if (i == n - 1) {
                    System.out.print(array[i]);
                } else {
                    System.out.print(array[i] + " ");
                }
            }
        }
        scanner.close();
    }
}

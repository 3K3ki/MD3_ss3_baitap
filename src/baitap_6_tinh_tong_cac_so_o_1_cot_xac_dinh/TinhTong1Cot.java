package baitap_6_tinh_tong_cac_so_o_1_cot_xac_dinh;

import java.util.Scanner;

public class TinhTong1Cot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = {
                {1,1,1},
                {2,2,2},
                {3,3,3}
        };
        System.out.println("ma trân là :" + matrix);
        int sum = 0;
        int col = 1;
        for (int i = 0; i < matrix.length; i++){
            sum += matrix[i][col];
            
        }
        System.out.println("Tổng của cột " + col + " là :" + sum);

    }
}

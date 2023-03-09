package bai_tap_4_tim_max_mang_2chieu;

public class TimMaxMang2Chieu {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int max = matrix[0][0];
        int row = 0, col = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    row = i;
                    col = j;
                }
            }
        }
        System.out.println("Giá trị lớn nhất trong ma trận là: " + max);
        System.out.println("Tọa độ của giá trị lớn nhất là: [" + row + "][" + col + "]");
    }
}

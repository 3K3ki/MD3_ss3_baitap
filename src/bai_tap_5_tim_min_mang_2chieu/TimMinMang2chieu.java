package bai_tap_5_tim_min_mang_2chieu;

public class TimMinMang2chieu {
    public static void main(String[] args) {
        int[][] matrix = {
                {4, 2, 3},
                {6, 4, 5},
                {3, 3, 3}
        };
        int min = matrix[0][0];
        int row = 0;
        int col = 1;

        for (int i = 0; i < matrix.length; i++){
            for (int j = 1; j < matrix[i].length; j++){
                if (matrix[i][j] < min){
                    min = matrix[i][j];
                    row = i;
                    col = j;
                }
            }
        }
        System.out.println("Giá trị nhỏ nhất trong ma trận là: " + min);
        System.out.println("Tọa độ của giá trị lớn nhất là: [" + row + "][" + col + "]");
    }
}

package bai_tap_7_tong_duong_cheo_chinh;

public class TinhTongDuongCheoChinh {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    sum += matrix[i][j];
                }
            }
        }

        System.out.println("Tong cac phan tu nam tren duong cheo chinh la: " + sum);
    }
}

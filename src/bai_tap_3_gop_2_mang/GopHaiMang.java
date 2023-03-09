package bai_tap_3_gop_2_mang;

import java.util.Arrays;
import java.util.Scanner;

public class GopHaiMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vị trí mang 1 :");
        int n1 = scanner.nextInt();
        System.out.println("Nhập giá trị cho mảng:");
        int[] array1 = new int[n1];
        for (int i = 0; i < n1; i++){
            array1[i] = scanner.nextInt();
        }
        System.out.println("Nhập vị trí mang 2 :");
        int n2 = scanner.nextInt();
        System.out.println("Nhập giá trị cho mảng:");
        int[] array2 = new int[n2];
        for (int i = 0; i < n2; i++){
            array2[i] = scanner.nextInt();
        }

        int[] array3 = new int[n1 + n2];
        for (int i = 0; i < array3.length; i++){
            for (int j = 0; j < array1.length; j++){
                array3[j] = array1[j];
            }
            for (int j = 0; j < array2.length; j++){
                array3[j+n1] = array2[j];
            }
        }
        System.out.println(Arrays.toString(array3));
        }
    }


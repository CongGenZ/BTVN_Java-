package com.tn;

import java.util.Scanner;

public class Btvn2 {
    public static void main(String[] args) {

//        Bài toán: Viết chương trình nhập vào một mảng gồm n số nguyên và thực hiện các công việc sau:
//
//        1. Xuất các giá trị của mảng ra
//        2. Tìm min, max
//        3. Tìm các số nguyên tố có trong mảng
//        4. Sắp xếp mảng theo thứ tự tăng dần
//        Deadline: 6 tiếng truoc buổi học tiếp theo
//        Gửi lên git rồi gửi link cho thầy

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu cua mang:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Nhap cac phan tu cua mang:");
        for (int i = 0; i < n; i++) {
            System.out.println("Phan tu thu " + (i + 1) + ":");
            arr[i] = sc.nextInt();

        }

        // 1.xuất mảng sau khi nhập
        System.out.println("Mang sau khi nhap:");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + "");

        }

        //2. tìm min, max



        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("\n Gia tri nho nhat :" + min);
        System.out.println("\n Gia tri lon nhat :" + max);


        //3. tìm số nguyên tố
        System.out.print("Cac so nguyen to trong mang la: ");
        for (int i = 0; i < n; i++) {
            if(arr[i] < 2) {
                continue;
            }
            if(arr[i] == 2){
                System.out.print(2 + " ; ");
            }else {
                boolean isPrime = true;
                for (int j = 2; j < arr[i] ; j++) {
                    if (arr[i] % j == 0) {
                        isPrime = false;
                    }
                }
                if(isPrime == true) {
                    System.out.print(arr[i] + " ");
                }
            }
        }



        // 4. sắp xếp mnagr theo thu tu tang dan
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(arr[i] > arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        System.out.println("\n In ra mang sau khi sap xep: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }



    }





}











package com.tn;

import java.util.Scanner;

public class Btvn3 {
//    btvn: Bài 1: Tính S(n) = 1 + 2 + 3 + … + n
//    Input: 1 số n
//    Ouput: Tổng (số nguyên)
//    Bài 2: Tính S(n) = 1^2 + 2^2 + … + n^2
//    Bài 3: Tính S(n) = 1 + ½ + 1/3 + … + 1/n

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap n:");
        int n = sc.nextInt();


        // gọi ham tinh tong=====(n);
        int sum = sum(n);
        System.out.println("tong S:" + "1 + 2 + 3 + ...+" + n + "= "  + sum);
           // goi ham tinh tong binh phương
        int sumOfSquares = sumOfSquares(n);
        System.out.println( "Tong S :" + "1^2 + 2^2 + 2^2 +...+" + n*2*2 + " = "  + sumOfSquares);

        //goi ham tính phan so
         double sumReciprocal = sumReciprocals(n);
        System.out.println("Tong S ("+n+") = " + sumReciprocal);



    }


    //Bài 1: Tính S(n) = 1 + 2 + 3 + … + n
    // ham tính tong

    public static  int sum(int n){
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum +=i;
        }
        return sum;
    }

    //Tính S(n) = 1^2 + 2^2 + … + n^2
    public  static  int sumOfSquares(int n){
        int sumOfSquare = 0;
        for (int i = 0; i <=n ; i++) {
            sumOfSquare += i*i;


        } return sumOfSquare;
    }

    //Tính S(n) = 1 + ½ + 1/3 + … + 1/n
    public static  double sumReciprocals(int n){
        double sumReciprocal = 0;
        for (int i = 1; i <=n ; i++) {
            sumReciprocal += 1.0 / i;

        }
        return sumReciprocal;
        }
    }



package com.tn;

import java.util.Locale;
import java.util.Scanner;

public class Btvn {
    public static void main(String[] args) {
//        BTVN
//        1. Nhập 1 choỗi từ bàn phím rồi in ra chữ viết hoa của choỗi vừa nhập
//        Ví dụ: chương trình => CHƯƠNG TRÌNH
//        2. Nhập 1 choỗi từ bàn phím rồi in ra chữ viết hoa của 1 ký tự đầu tiên của mỗi từ
//        Ví dụ: chương trình => Chương Trình
//        3. Nhập 1 choỗi từ bàn phím rồi thay thế ký tự n và g bằng ký tự a và in ra
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi:");
         String string = sc.nextLine();
         String upperCaseString = string.toUpperCase();
         System.out.println("chuoi viet hoa:" + upperCaseString);



          //bt2
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap chuoi: ");
        String inputString = scanner.nextLine();
           inputString = inputString .toLowerCase();
        String[] words = inputString.split("\\s+"); // Tách chuỗi thành mảng các từ

        System.out.print("Chu viet hoa cua ki tu dau tien: ");
        for (String word : words) {
            if (!word.isEmpty()) {
                char firstChar = Character.toUpperCase(word.charAt(0)); // Chuyển ký tự đầu tiên sang chữ viết hoa
                System.out.print(firstChar + word.substring(1) + " ");
            }
        }

        scanner.close();



      //bt3
        String replacedString = inputString.replace('n', 'a').replace('g', 'a');
        System.out.println(" \n Chuoi sau  khi thay the: " + replacedString);

        scanner.close();
    }
}


package com.study4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputDemo {
    public static void main(String[] args) {
        System.out.println("請輸入一個整數:");
        Scanner sc =new Scanner(System.in);
        try {
            
        int x = sc.nextInt();
            System.out.printf("您輸入是%d，平方等於%.2f",x,Math.pow(x, 2));
        } catch (InputMismatchException e) {
            System.out.println("輸入錯誤,錯誤原因"+e);
        }
        
    }
}

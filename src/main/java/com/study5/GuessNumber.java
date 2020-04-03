package com.study5;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        int ans=new Random().nextInt(99)+1;
        int min = 0;
        int max = 100;
        int count=5;
        do { 
            //1.請使用者輸入
            Scanner sc = new Scanner(System.in);
            System.out.printf("請輸入一個數字%d - %d:\n",min,max);
            int quess = sc.nextInt();
            //2.檢查是否在min和max之間
            if(quess <= min || quess >= max){//if(!(quess < min && quess > max))
                System.out.println("輸入錯誤請重新輸入");
                count--; 
                if(count==0){
            break;   }
                continue;
            }
            
            //3.判斷是否答對
            if(quess>ans){
            max=quess;
            continue;
            }else if(quess<ans){
            min=quess;
            continue;
            }else{
                System.out.println("恭喜答對了!");
              
            }
            
            
        } while (true);
    }
}

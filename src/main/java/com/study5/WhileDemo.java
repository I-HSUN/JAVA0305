package com.study5;

import java.util.Random;

public class WhileDemo {
    public static void main(String[] args) {
       while(true){
           
           int x = new Random().nextInt(100);
           
           if(x != 0 && x % 19 == 0){
               System.out.printf("遇到19的倍數 %d,所以迴圈停止\n",x);
           break;//迴圈停止
           }
           if(x%2==1){
           continue;
           }
           System.out.println(x);
       }
    }
        
}

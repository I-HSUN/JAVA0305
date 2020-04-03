package com.study5;
public class PrimeNumber {

    public static void main(String[] args) {
        int n=8;
        boolean check=true;
        for(int i=2;i<=n/2;i++){
        if(n%2==0){
        check=false;
        break;
        }
            System.out.printf("%d是質數?%b",n,check);
        }
    }
    
}

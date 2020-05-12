package com.javaex.practice;

public class Ex04 {
    public static void main(String[] args) {
        int[] exArray = {1,3,5,8,9,11,15,19,18,20,30,33,31};
        int length=0;
        int result=0;

        for(int i=0;i<exArray.length;i++) {
            if(exArray[i]%3 == 0) {
                length++;
                result += exArray[i];
            }
        }
        System.out.println("주어진 배열에서 3의 배수의 개수=>"+length);
        System.out.println("주어진 배열에서 3의 배수의 합=>"+result);
    }
}

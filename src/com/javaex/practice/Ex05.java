package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner addNumbers = new Scanner(System.in);
        int[] numbers = new int[5];
        int sum = 0;
        System.out.println("숫자를 다섯번 입력해주세요");
        //배열에 값 추가
        for(int i=0;i<numbers.length;i++) {
            int num = addNumbers.nextInt();
            numbers[i] = num;
        }

        //배열 값 모두 더하기
        for(int i=0;i<numbers.length;i++) {
            sum += numbers[i];
        }

        double result = (double)sum/5;
        System.out.println("평균은 "+result+" 입니다.");

        addNumbers.close();

    }
}

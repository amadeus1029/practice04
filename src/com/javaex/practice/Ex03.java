package com.javaex.practice;

public class Ex03 {
    public static void main(String[] args) {
        int[] intA = {3,6,9};
        int[] intB;
        intB = intA;
        intB[0] = 20;
        intB[2] = 10;

        //intA와 intB의 주소값이 같으므로 0번째와 두번째 배열의 값이 20과 10으로 바뀜
        for(int i=0;i<intA.length;i++) {
            System.out.println(intA[i]);
        }
    }
}

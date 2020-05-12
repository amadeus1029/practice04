package com.javaex.practice;

public class Ex01 {
    public static void main(String[] args) {
        int[] intArray = new int[5];
        intArray[0] = 3;
        intArray[1] = 7;
        intArray[2] = 12;

        int result = 0;

        //for(int i=0;i<=intArray.length;i++) { 부등호 실수때문에 배열을 초과하여 반복문이 실행되어 에러발생
        for(int i=0;i<intArray.length;i++) {
            result = result + intArray[i];
        }
        System.out.println(result);
    }
}

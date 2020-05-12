package com.javaex.practice;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner makeLotto = new Scanner(System.in);
        System.out.print("로또번호를 몇회 생성하시겠습니까? ");
        int doLotto = makeLotto.nextInt();
        for(int k=0;k<doLotto;k++) {
            System.out.print("추천조합"+(k+1)+": \t\t");
            //로또 만들기
            int lotto[] = new int[6]; // 값이 6개인 배열선언

            //난수값 생성하여 배열에 저장
            for(int i=0;i<6;) {
                boolean addNumber = true;
                int num = (int)(Math.random()*45)+1;
                for(int j=0;j<lotto.length;j++) { //중복인지 확인, 중복번호 있으면 false 넘겨줌
                    if(num==lotto[j]) {
                        addNumber = false;
                    }
                }
                if(addNumber) { // false를 넘겨받지 않았을떄만 번호 저장
                    lotto[i] = num;
                    i++;
                }
            }

            //저장된 배열을 확인하여 크기 순으로 정렬
            for (int i=0;i<lotto.length;i++) {
                for(int t=0;t<lotto.length-1;t++) { //배열 값이 총 6개이므로 5회만 비교
                    if (lotto[t]>lotto[t+1]) {
                        int comp = lotto[t];
                        lotto[t] = lotto[t+1];
                        lotto[t+1] = comp;
                    }
                }
            }

            //배열 출력
            for(int i=0;i<6;i++) {
                System.out.print(lotto[i]+"\t");
            }
            System.out.println("");
        }
        makeLotto.close();
    }
}

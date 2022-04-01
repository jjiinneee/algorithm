package com.algorithm.hanbit;

public class ChangeEx {
    //문제 : 당신은 음식점의 계산을 도와주는 점원이다.
    //카운터에는 거스름돈으로 사용할 500원, 100원, 50원, 10원짜리 동전이 무한히 존재한다고 가정한다
    //손님에게 서글러 줘야 할 돈이 N원 일대 거슬러 줘야할 동저의 최소 개수를 구하라.
    //단, 거슬러 줘야 할 돈 N은 항상 10의 배수이다.
    public static void main(String[] args) {

        int cnt = 0;
        int n = 1260;

        int[] coinType = {500, 100, 50, 10};
        for(int i=0; i<4; i++){
            int coin = coinType[i];
            cnt += n / coin;
        }
        System.out.println(cnt);
    }

}

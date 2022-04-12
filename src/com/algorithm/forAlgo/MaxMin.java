package com.algorithm.forAlgo;

public class MaxMin {
    public static void main(String[] args) {
        int a[] = {72,68,92,88,41,53,97,84,39,55};

        int max = a[0];   //선두의 요소를 임시로 최댓값,최소값으로 정한다.
        int min = a[0];

        for(int i =0; i< a.length; i++){
            if(a[i] > max){
                max = a[i];
            }
            if(a[i] >min){
                min = a[i];
            }
        }

        System.out.println(max);
        System.out.println(min);
    }

}

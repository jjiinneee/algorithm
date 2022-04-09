package com.algorithm.programers;

public class MissingNumber {

    public int solution(int[] numbers){
        int answer = 45;

        for (int i = 0; i < numbers.length; i++) {
            answer -= numbers[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7};
        MissingNumber aa = new MissingNumber();
        System.out.println(aa.solution(a));
    }
}

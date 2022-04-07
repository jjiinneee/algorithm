package com.algorithm.backjoon;

import java.util.Scanner;

public class Back1018 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int row =  Integer.parseInt(input[0]);
        int col = Integer.parseInt(input[1]);

        // 입력값 저장(board)
        char[][] board =  new char[row][col];
        for(int i=0 ;i<row; i++){
            String line = scanner.nextLine();
            for(int j=0; j<col; j++){
                board[i][j] = line.charAt(j);
            }

        }

        // 자를 수 있는 경우의 수 전부 시험
        char[][] chess = new char[8][8];
        int minCount = Integer.MAX_VALUE;
        for (int i = 0; i < row - 7; i++) {
            for (int j = 0; j < col - 7; j++) {

                // [i][j]꼭짓점 체스판
                for (int k = 0; k < 8; k++) {
                    for (int l = 0; l < 8; l++) {
                        chess[k][l] = board[i + k][j + l];
                    }
                }

                // 몇개 칠?
                int count1 = 0;
                int count2 = 0;
                for (int k = 0; k < 8; k++) {
                    for (int l = 0; l < 8; l++) {
                        if ((k + l) % 2 == 0) {
                            if (chess[k][l] != 'B') count1++;
                            else count2++;
                        } else {
                            if (chess[k][l] != 'W') count1++;
                            else count2++;
                        }
                    }
                }
                int tmpMin = Math.min(count1, count2);
                minCount = Math.min(minCount, tmpMin);

            }
        }

        System.out.println(minCount);

    }
}

package com.algorithm.programers;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class GetReport {
    public int[] solution(String[] users, String[] reports, int k) {
        Set<String> reportSet = new HashSet<>();
        //
        
        for (String report : reports) {
            reportSet.add(report);
        }
       
        String[] newReports = new String[reportSet.size()];
        System.out.println("newReports" +  reportSet.size());
        reportSet.toArray(newReports);
    
        
        int[] answer = new int[users.length];
        int[] reportCount = new int[users.length];
        for (int i = 0; i < users.length; i++) {
            for (int j = 0; j < newReports.length; j++) {
                if (newReports[j].split(" ")[1].equals(users[i])) {
                    reportCount[i]++;
                }
            }
        }

        for (int i = 0; i < newReports.length; i++) {
            String[] report = newReports[i].split(" ");
            for (int j = 0; j < reportCount.length; j++) {
                if (reportCount[j] >= k && report[1].equals(users[j])) {
                    for (int m = 0; m < users.length; m++) {
                        if (report[0].equals(users[m])) {
                            answer[m]++;
                        }
                    }
                }
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        GetReport getReport = new GetReport();

        String[] users = {"muzi", "frodo", "apeach", "neo"};
        String[] reports = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int k = 2;

        int[] result = getReport.solution(users, reports, k);
        System.out.println(Arrays.toString(result));
    }
    /*
    1. reports 를 읽고 k번 이상 신고당한 유저 특정
    2. reports를 읽으면서 1에서 특정한 유저를 신고한 유저에게 메일 보냄
    3. 각 유저가 메일 받은 횟수 저장해서 결과 반환
    users 같은 아이디 중복해서 들어가 있지 않음
    
    */




}

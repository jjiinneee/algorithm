package com.algorithm.udemy;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {
  
  public int[] merge(int[] arr1, int[] arr2){
    int i = 0;
    int j = 0;
  
    System.out.println(Arrays.toString(arr1));
    System.out.println(Arrays.toString(arr2));
    ArrayList<Integer> arrayList = new ArrayList<>();
    int[] result = new int[arrayList.size()];
    while( i < arr1.length && j < arr2.length){
      if(arr1[i] < arr2[j]){
        arrayList.add(arr1[i]);
        i++;
      }else{
        arrayList.add(arr2[j]);
        j++;
      }
    }
    
    
    while(i < arr1.length){
      arrayList.add(arr1[i]);
      i++;
    }
    while(j < arr2.length){
      arrayList.add(arr2[j]);
      j++;
    }
  
    for (int k = 0; k < arrayList.size(); k++) {
      System.out.println(arrayList.get(i));
    }
//    int size = 0;
//    for(int arr : arrayList){
//      result[size++]= arr;
//    }
    
    
    return result;
  }
  
  
  public int[] mergeSort(int[] arr){
    if(arr.length <= 1){
      return arr;
    }

    int mid = arr.length /2 ;
 
    int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
  
    int[] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));;

    return merge(left, right);
  }
  
  
  public static void main(String[] args) {
    MergeSort m = new MergeSort();
    int[] arr = {10,24,76,73};
    System.out.println(m.mergeSort(arr));
//    int mid = arr.length/2;
//    System.out.println(Arrays.copyOfRange(arr,0,mid).);
//    System.out.println(Arrays.toString(Arrays.copyOfRange(arr,0,mid)));
  }
}

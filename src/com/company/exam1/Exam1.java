package com.company.exam1;

import java.util.HashSet;
import java.util.Set;

public class Exam1 {
    public static void main(String[] args) {
      int [] array = new int[101];
      for (int i = 1; i < array.length ;i++){
          array[i] += i;
          System.out.println(array[i]);
      }
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < array.length;i++){
            if (array[i] % 2 ==0){
                set.add(array[i]);
            }


        }
        System.out.println(set);

    }


}

package com.LeetCode;

import java.util.HashMap;
import java.util.Map;

public class Majority_Element {
    public static void main(String[] args) {

        HashMap<Integer,Integer> map = new HashMap<>();

        int arr[] = new int[]{3, 4, 3, 2, 4, 4, 4, 4};

        for (int i = 0; i <= arr.length-1; i++) {

            if(!map.containsKey(arr[i])){
                map.put(arr[i],1);
            }
            else{
                int val = map.get(arr[i]);
                val++;
                map.put(arr[i],val);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            Integer k = entry.getKey();
            Integer v = entry.getValue();
            if (v > arr.length / 2) {
                System.out.println("majority element is " + k);
            }
        }

        int maj_index =0; int count=1;

        for (int i = 1; i <= arr.length-1; i++) {

            if(arr[maj_index]==arr[i]){
                count++;
            }
            else{
                count--;
            }
            if(count==0){
                maj_index=i;
                count=1;
            }

        }
        count=0;
        for(int i=0;i<=arr.length-1;i++){

            if(arr[maj_index]==arr[i]){
                count++;
            }
        }

        System.out.println( (count>arr.length/2)?arr[maj_index]:-1);
        System.out.println(maj_index);
    }
}

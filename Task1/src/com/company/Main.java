package com.company;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Main {
   // int nums[]=new int[] {1, 45, 34, 383, -23, 0, 34, 85, 12, 15, 22, 94};
   // int target=64;
    public static void main(String[] args) {
        int[] nums=new int[] {1, 45, 34, 383, -23, 0, 34, 85, 12, 15, 22, 94};
        int target=64;
        int i;
        int len=nums.length;
        System.out.print("Given nums = [");
        for (i=0; i<len-1; i++){
            System.out.print(nums[i] + ", ");
       //     if len[i]==

        }
        System.out.print(nums[len-1] +"], target = " +target);
        int last = nums[nums.length-1];
        System.out.println(" " +last);
        Arrays.sort(nums);
        int a=nums[0];
        int b=nums[len-1];
        System.out.println(a);
        for (i=0; i<len; i++){
            System.out.print(nums[i] + ", ");
	//System.out.println("G: " +len +' ');


    };
}

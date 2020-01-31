package com.company;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Main {
   // int nums[]=new int[] {1, 45, 34, 383, -23, 0, 34, 85, 12, 15, 22, 94};
   // int target=64;
    public static void main(String[] args) {
        int[] nums=new int[] {1, 45, 34, 3833, -23, 0, 34, 85, 12, 15, 22, 94};
        int target=64;
        int i;
        int len=nums.length;
        System.out.print("Given nums = [");
        for (i=0; i<len-1; i++){
            System.out.print(nums[i] + ", ");
       //     if len[i]==
        }
       // System.out.println("len= " +len);
        System.out.print(nums[len-1] +"], target = " +target);
        int last = nums[nums.length-1];
        System.out.println(" last= " +last);
        Arrays.sort(nums);
        int last1 = nums[nums.length-1];
        int left=0;
        int right=last1;
        System.out.println(" last1= " +last1);
        for (i=0; i<len; i++){
            System.out.print(nums[i] + " ");}

        while (nums[left]+nums[right] != target){
            if (nums[left]+nums[right]>target){
                right--;
            }
            if (nums[left]+nums[right]<target){
                left++;
            }
            if (nums[left]+nums[right]==target){
                break;
        }
            String resault = right +" " +left;
            System.out.println("resault= " +resault);

      //      if ((a+b)<target)
        //        a=nums[i+1];
          //  else if (a+b>target)
            //    b=

        }
    }
}

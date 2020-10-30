package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] nums = {1,5,4,5};
        int max=0;
        int product=1;
        for (int i = 0; i <nums.length-1 ; i++) {
            for (int j = i+1; j <nums.length ; j++) {
                product=(nums[i]-1)*(nums[j]-1);
                if(product>max)
                    max=product;
            }
        }

        int max1 = nums[1];
        int max2 = nums[0];

        if (nums[0] > nums[1]) {
            max1 = nums[0];
            max2 = nums[1];
        }

        System.out.println(max1+":"+max2);
        for (int i = 2; i <nums.length ; i++) {
            if (nums[i] >= max1) {
                max2=max1;
                max1 = nums[i];
            } else if (nums[i]>max2) {
                max2 = nums[i];
            }      System.out.println(max1+":"+max2);
        }

        max= ((max1 - 1) * (max2 - 1));



        System.out.println(max);
    }
}

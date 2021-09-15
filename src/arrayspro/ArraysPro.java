/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayspro;

import java.util.Arrays;

/**
 *
 * @author pupil
 */
public class ArraysPro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Исследование массивов в Java");
        System.out.println("Одномерный массив.");
        int[] nums;
        nums = new int[5];
        nums[0] = 5;
        nums[1] = 4;
        nums[2] = 3;
        nums[3] = 2;
        nums[4] = 1;
        System.out.println("nums = " + Arrays.toString(nums));
//        int[] newNums = new int[7];
        int[] newNums = Arrays.copyOf(nums, 10);
        Arrays.fill(newNums, 5, 10, 10);
        Arrays.sort(newNums);
//        System.arraycopy(nums, 0, newNums, 0, nums.length);
//        for(int i=0;i<nums.length;i++){
//            newNums[i] = nums[i];
//            
//        }
        nums = newNums;
        int[] nums2;
        nums2 = nums;
        //nums2[2] = 2;
        nums2 = new int[6];
        nums2[2] = 3;
        System.out.println("nums = " + Arrays.toString(nums));
        System.out.println("nums2 = " + Arrays.toString(nums2));
        
    }
    
}

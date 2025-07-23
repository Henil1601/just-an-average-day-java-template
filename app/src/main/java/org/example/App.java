package org.example;

import java.util.Arrays;

public class App {
    public static int maximumUsingForLoop(int[] nums) {
        int max = nums[0];
        for (int num : nums) {
            if (num > max) max = num;
        }
        return max;
    }

    public static int minimumUsingForLoop(int[] nums) {
        int min = nums[0];
        for (int num : nums) {
            if (num < min) min = num;
        }
        return min;
    }

    public static int sumUsingForLoop(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }

    public static int averageUsingForLoop(int[] nums) {
        return sumUsingForLoop(nums) / nums.length;
    }

    public static int maximumUsingStream(int[] nums) {
        return Arrays.stream(nums).max().getAsInt();
    }

    public static int minimumUsingStream(int[] nums) {
        return Arrays.stream(nums).min().getAsInt();
    }

    public static int sumUsingStream(int[] nums) {
        return Arrays.stream(nums).sum();
    }

    public static int averageUsingStream(int[] nums) {
        return (int) Arrays.stream(nums).average().getAsDouble();
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}

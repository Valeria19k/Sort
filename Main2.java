package com.company;

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void swap(int[] array, int k1, int k2) {
        int t = array[k1];
        array[k1] = array[k2];
        array[k2] = t;
    }

    public static void main(String[] args) {
        int[] arr;
        int n;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter array size: ");
        n = in.nextInt();
        arr = new int[n];
        int a;
        int b;
        System.out.print("Enter bottom line: ");
        a = in.nextInt();
        System.out.print("Enter high line: ");
        b = in.nextInt();
        System.out.print("Random array elements:");
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(b - a + 1) + a;
            System.out.print(" " + arr[i]);
        }
        boolean sort = false;
        while (!sort) {
            sort = true;
            for (int j = 1; j < arr.length; j++) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                    sort = false;
                }
            }
        }
        System.out.print("\n" + "Array elements:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
        // write your code here
    }
}

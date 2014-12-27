/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.chapter2;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author kasem
 */
public class test5 {

    public static void main(String[] args) {
        int n, d, swap = 0;
        Scanner in = new Scanner(System.in);

        System.out.print("ใส่จำนวนของจำนวนเต็มเพื่อทำ bubble sort =>");
        n = in.nextInt();
        System.out.println("");
        int array[] = new int[n];

        for (int c = 0; c < n; c++) {
            System.out.print("จำนวนเต็มที่ " + (c + 1) + " =>");
            array[c] = in.nextInt();
        }
        
        for (int c = 0; c < (n - 1); c++) {
            for (d = 0; d < n - c - 1; d++) {
                if (array[d] > array[d + 1]) {
                    swap = array[d];
                    array[d] = array[d + 1];
                    array[d + 1] = swap;
                }
            }
        }
        System.out.print("หลังจากทำการจัดเรียงแบบ bubble sort ค่าที่ได้ =>");
        for (int c = 0; c < n; c++) {
            System.out.print("\t" + array[c]);
        }
        System.out.println("\nค่าสูงสุดที่ได้ =>" + array[array.length - 1]);
    }
}

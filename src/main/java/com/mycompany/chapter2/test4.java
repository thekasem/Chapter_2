/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.chapter2;

import java.util.Scanner;

/**
 *
 * @author kasem
 */
public class test4 {

   public static void main(String[] args) {
        int sum = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("ใส่จำนวนตัวเลข : ");
        int n = scan.nextInt();
        for (int i = 1; i <= n; i++) {
            if ((i % 2) == 0) {
                System.out.println("\t" + i);
            }
        }
        sum = n / 3;
        System.out.println("\nจำนวนที่หาร 3 ลงตัวมี " + sum + " ตัว");
    }
}

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
public class test2 {

    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner scan = new Scanner(System.in);
        System.out.println("กรุณาป้อนจำนวนเต็ม 3 ค่า เพื่อหาค่ามากสุด ");
        System.out.print("number 1 : ");
        num1 = scan.nextInt();
        System.out.print("\nnumber 2 : ");
        num2 = scan.nextInt();
        System.out.print("\nnumber 3 : ");
        num3 = scan.nextInt();

        if ((num1 >= num2) && (num1 >= num3)) {
            System.out.println("ค่าที่สุงสุดคือ " + num1);
        } else if ((num2 >= num1) && (num2 >= num3)) {
            System.out.println("ค่าที่สุงสุดคือ " + num2);
        } else if ((num3 >= num1) && (num3 >= num2)) {
            System.out.println("ค่าที่สุงสุดคือ " + num3);
        }
    }
}

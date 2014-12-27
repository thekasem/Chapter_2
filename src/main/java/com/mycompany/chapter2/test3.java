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
public class test3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("กรุณาใส่คะแนนเพื่อเช็คเกรด => ");
        int grad = scan.nextInt();
        String a = "";
        switch ((grad + "").indexOf("-")) {
            case -1:
                switch (grad / 10) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                        a = "F";
                        break;
                    case 5:
                        a = "D";
                        break;
                    case 6:
                        a = "C";
                        break;
                    case 7:
                        a = "B";
                        break;
                    case 8:
                    case 9:
                        a = "A";
                        break;
                    case 10:
                        switch (grad % 10) {
                            case 0:
                                a = "A";
                                break;
                            default:
                                a = "!!!!!จำนวนที่คุณใส่เกิน 100";
                        }
                        break;
                    default:
                        a = "!!!!!จำนวนที่คุณใส่เกิน 100";
                }
                break;
            default:
                a = "!!!!!จำนวนที่คุณใส่เกิน 100";
        }
        System.out.println("คำตอบที่ได้คือเกรด : " + a);

    }
}

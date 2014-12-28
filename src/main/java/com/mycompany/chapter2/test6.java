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
public class test6 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String concath = "",number = "";
        String input;        
        System.out.print("ใส่ตัวอักษร : ");
        input = scan.nextLine();
        
       for(int i=0;i<input.length();i++){
            char c = input.charAt(i);
            if(Character.isDigit(c)){
                number = number+c;
            }
            else{
                concath = concath+c;
            }
        }
        System.out.println("ตัวอักษร = "+concath);
        System.out.println("ตัวเลข = "+number);
    }
    
}

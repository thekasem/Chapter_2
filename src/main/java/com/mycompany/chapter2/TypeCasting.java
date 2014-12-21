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
public class TypeCasting {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      float input = sc.nextFloat();
      if(input -(int)input == 0){
      System.out.println("number : " +(int)input);
      }else{
          System.out.println("number : " + input);
          
      }
    }    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication37;
import java.util.*;

/**
 *
 * @author PAVITHRA T
 */
//how to get input from the user
public class program3 {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter value1");
        int v1=scanner.nextInt();
        scanner.nextLine();
        System.out.println("value1 "+v1);
        //getting string value as the user input
        System.out.println("enter email");
        String email=scanner.nextLine();
        System.out.println("email "+email);
        
        
    }
    
}

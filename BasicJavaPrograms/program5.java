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
public class program5 {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        /*System.out.println("enter the first no");
        int v1=scanner.nextInt();
        System.out.println("enter the second no");
        int v2=scanner.nextInt();
        int n1,n2,n3,n4,n5;
        n1=v1+v2;
        n2=v1-v2;
        n3=v1*v2;
        n4=v1/v2;
        n5=v1%v2;
        
        System.out.println(n1+"\n"+n2+"\n"+n3+"\n"+n4+"\n"+n5);
        */
        //COMPOUND ASSIGNMENT
        /*System.out.println("enter value1");
        int a1=scanner.nextInt();
        a1+=100;
        System.out.println(a1);
        */
        int a=3,b=4,c;
        c=a+b+a++ +b++ + ++a + ++b;
        System.out.println(c);
        
        
    }
    
}

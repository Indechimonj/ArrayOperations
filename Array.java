/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array;
import java.util.Scanner;
/**
 *
 * @author Samuel Imonje
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int []num=new int [5];
        
        Scanner Scanner=new Scanner(System.in);
        
        System.out.println("Enter an integer:");
       
        
        for(int i=0;i<5;i++){
            num[i]=Scanner.nextInt();
        }
        System.out.println("The entered integers are");
        for(int i=0;i<5;i++){
            System.out.println ("Element at index "+i+ "=" +num[i]);
        }
       
        
    }
    
}

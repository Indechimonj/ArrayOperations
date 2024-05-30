/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task.pkg2.array;

/**
 *
 * @author Samuel Imonje
 */
public class Task2Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[]ten={10,20,30,40,50,60,70,80,90,100};
        int sum=0;
        
        for(int i=0;i<10;i++){
            System.out.println("Element "+ten [i]);
            sum+=ten[i];
         
        }
        System.out.println("sum: " +sum);
        
    
        // TODO code application logic here
    }
    
}

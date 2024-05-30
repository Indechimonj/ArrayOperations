/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package forlooparraylist;
import java.util.Arrays;

/**
 *
 * @author Samuel Imonje
 */
public class ForloopArraylist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[]cars={"volvo","bMW","Ford","Mazda"};
        Arrays.sort(cars);
        
        System.out.println("Sorted array: ");
        for (String i:cars){
            System.out.println(i+"");
       //for each loop
       // for(String i:cars){
       //for loop for accessing arrays    
       // for(int i=0;i<cars.length;i++){
          // System.out.println(i);
        }
        // TODO code application logic here
    }
    
}

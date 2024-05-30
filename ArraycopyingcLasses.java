/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraycopyingclasses;

/**
 *
 * @author Samuel Imonje
 */
public class ArraycopyingcLasses {

    /**
     * @param args the command line arguments
     */
    //implement array copy from
    public static void main(String[] args) {
        String[]copyFrom={
            "Afagato","Americano","Capaccino","Coretto","Cortado","Doppio","Espresso","Frappucino","Freddo",
            "Lungo","Machiato","Maruchino","Risterro"};
        
        
        
        String[]copyTo=new String [7];
        System.arraycopy(copyFrom, 2,copyTo,0 , 7);
        for (String coffee:copyTo){
            System.out.println(coffee + "");
        }
        // TODO code application logic here
    }
    
}

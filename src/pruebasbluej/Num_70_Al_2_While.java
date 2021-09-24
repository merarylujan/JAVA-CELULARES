/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebasbluej;

import javax.swing.JOptionPane;

/**
 *
 * @author MERARY A. LUJAN
 */
public class Num_70_Al_2_While {
    public static void main(String args[]) 
   {
       String salida="";
       JOptionPane.showMessageDialog(null,"NUMEROS DEL 70 AL 2: ");
       int i=70;
       
       while(i>=1)
       {             
           salida+=i+" ";               
           i-=2;
       }
       JOptionPane.showMessageDialog(null,salida);
   }
    
}

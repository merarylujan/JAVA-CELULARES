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
public class Metodos2 {
    public static void main(String arg[])
    {
        int num1=25, num2=30, num3=5,num4=6,resul1, resul2;
        
        resul1=suma(num1,num2);
        mensaje("El resultado de la suma es: "+resul1);
                
        resul2=multi(num3,num4);
        mensaje("El resultado de la multiplicacion es: "+resul2);
        
        resta(num2,num4);        
        
    }
    
    public static int suma(int num1, int num2)
    {
        int resultado=num1+num2;
        return resultado;
    }
    
    public static void resta(int num1, int num2)
    {
        int resultado=num1-num2;
        mensaje("El resultado de la resta es: "+resultado);
    }
    
    public static int multi(int num1, int num2)
    {
        int resultado=num1*num2;
        return resultado;
    }
    
    public static void mensaje(String msg)
    {
        JOptionPane.showMessageDialog(null,msg);
    }
    
}

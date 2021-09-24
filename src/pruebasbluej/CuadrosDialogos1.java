
package pruebasbluej;

import javax.swing.JOptionPane;

/**
 *
 * @author MERARY A. LUJAN
 */
public class CuadrosDialogos1 {
    public static void main(String args[])
    {
        String leer;
        
        //TIPOS DE ICONOS QUE PODEMOS AGREGAR A LOS CUADROS DE DIALOGO
        JOptionPane.showMessageDialog(null,"Datos ingresados correctamente!","ATENCION",JOptionPane.PLAIN_MESSAGE);
        
        JOptionPane.showMessageDialog(null,"Datos ingresados correctamente!","ATENCION",JOptionPane.INFORMATION_MESSAGE);
        
        JOptionPane.showMessageDialog(null,"Ingrese un dato numérico","ATENCION",JOptionPane.WARNING_MESSAGE);
        
        // PUEDE COLOCAR EN 2 LINEAS EL CODIGO PARA QUE SE APRECIE MEJOR
        JOptionPane.showMessageDialog(null,"¿Esta seguro de eliminar el archivo?",
                                            "ATENCION",JOptionPane.QUESTION_MESSAGE);
        
        JOptionPane.showMessageDialog(null,"La fecha es incorrecta","ATENCION",JOptionPane.ERROR_MESSAGE);
        
        leer=JOptionPane.showInputDialog("Ingrese un color (Rojo,Blanco,Azul)","INGRESE UN SOLO COLOR");
        
        leer=JOptionPane.showInputDialog(null,"Ingrese un color (Rojo,Blanco,Azul)","INGRESE UN SOLO COLOR",JOptionPane.WARNING_MESSAGE);
        
       
        //TIPOS DE ICONOS QUE PODEMOS AGREGAR A LOS CUADROS DE DIALOGO USANDO NUMEROS  
        
        JOptionPane.showMessageDialog(null,"La fecha es incorrecta","ATENCION",0);//ERROR   
        
        JOptionPane.showMessageDialog(null,"Datos ingresados correctamente!","ATENCION",1);//INFORMATION
        
        JOptionPane.showMessageDialog(null,"Ingrese un dato numérico","ATENCION",2);//WARNING
        
        JOptionPane.showMessageDialog(null,"¿Esta seguro de eliminar el archivo?","ATENCION",3);//QUESTION        
              
    }    
}

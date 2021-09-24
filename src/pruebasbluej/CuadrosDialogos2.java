/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebasbluej;

import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
/**
 *
 * @author MERARY A. LUJAN
 */
public class CuadrosDialogos2 {
    public static void main(String args[])
    {
        /** DECLARAMOS LAS IMAGENES CON SU RUTA */
        ImageIcon imagen1 = new ImageIcon("src/Imagenes/bienvenidos.gif");
        ImageIcon imagen2 = new ImageIcon("src/Imagenes/baile.gif");
        ImageIcon imagen3 = new ImageIcon("src/Imagenes/buho.png");
        ImageIcon imagen4 = new ImageIcon("src/Imagenes/bienvenidos2.gif");
        
        String resp,nombreJugador;
        int pregunta, seleccion;
        
        /**DECLARAMOS LOS ARREGLOS DE LISTA Y DE BOTONES */
        String carreras []={"Ingenieria en Computacion","Ingenieria en Produccion Industrial","Licenciatura en Gerencia de Negocios"};
        Object botones [] ={"SI","PUEDE SER","NO","NI EN TUS SUEÑOS!"};
        
        /** LLAMAMOS LA PRIMERA IMAGEN, PERO USAMOS PLAIN_MESSAGE PARA QUITARLE TODOS LOS ICONOS AL CUADRO DE DIALOGO */
        JOptionPane.showMessageDialog(null,"EL GATO ES EL ANIMAL MAS TRAICIONERO ","ATENCION",JOptionPane.PLAIN_MESSAGE,imagen1);
        
        /** PEDIMOS AL USUARIO SELECCIONAR LA CARRERA, AGREGAMOS LA IMAGEN**/
        resp=JOptionPane.showInputDialog(null,"Seleccione una carrera","CARRERAS",
                                                 JOptionPane.DEFAULT_OPTION,imagen3,carreras,carreras[0])+"";
        if(resp.equals("Ingenieria en Computacion"))
        {
            JOptionPane.showMessageDialog(null,"EL GATO ES EL ANIMAL MAS TRAICIONERO ","ATENCION",JOptionPane.PLAIN_MESSAGE,imagen1);
        
        }
                                                 
        
        /** HACEMOS UNA PREGUNTA Y AGREGAMOS LA IMAGEN Y LOS BOTONES CON LAS POSIBLES RESPUESTAS */        
        seleccion= JOptionPane.showOptionDialog(null, "¿Quieres salir a Bailar esta Noche?","Cita",
                                                JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,imagen2,botones,botones[0]);
        
        /** COMPARAMOS LA SELECCION DEL USUARIO */
        if(seleccion==0)
        {
            JOptionPane.showMessageDialog(null,"SU RESPUESTA ES SI!!");
        }
        else if(seleccion==1)
        {
            JOptionPane.showMessageDialog(null,"SU RESPUESTA ES PUEDE SER");
        }
        else if(seleccion==2)
        {
            JOptionPane.showMessageDialog(null,"SU RESPUESTA ES NO! :(");
        }        
        else if(seleccion==3)
        {
            JOptionPane.showMessageDialog(null,"SU RESPUESTA ES NI EN TUS SUEÑOS! :(");
        }
        
        /** switch(seleccion)
        {
            case 0:
                JOptionPane.showMessageDialog(null,"SU RESPUESTA ES SI!!");
            break;
            case 1:
                JOptionPane.showMessageDialog(null,"SU RESPUESTA ES PUEDE SER!");
            break;
            case 2:
                JOptionPane.showMessageDialog(null,"SU RESPUESTA ES NO!");
            break;
            case 3:
                JOptionPane.showMessageDialog(null,"SU RESPUESTA ES NI EN TUS SUEÑOS!");
            break;                
        }*/
        
        pregunta=JOptionPane.showConfirmDialog(null,"¿Desea seguir ingresando notas?","NOTAS",JOptionPane.YES_NO_CANCEL_OPTION,1);
        
        if(pregunta==0)
        {
            JOptionPane.showMessageDialog(null,"AQUI VAMOS DE NUEVO!","NOTAS!",1);
        }
        
        if(pregunta==1)
        {
            JOptionPane.showMessageDialog(null,"DIJO QUE NO!","NOTAS!",1);
        } 
        
        if(pregunta==2)
        {
            System.exit(0);
        }  
                
        nombreJugador=(String)JOptionPane.showInputDialog(null,"Ingresa tu nombre o un alias","ADIVINA LA PALABRA",2,imagen4,null,null);
               
    }
    
}

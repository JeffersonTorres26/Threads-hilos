/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;

/**
 *
 * @author User
 */
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;

public class Reloj implements Runnable {

//    JLabel label;
//
//    public Reloj(JLabel label1) {
//        this.label = label1;
//    }
//
//    public void setLabel(JLabel label) {
//        this.label = label;
//    }

    
    
    public String Tiempo1() {
        Date date = new Date();
        
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        
        DateFormat hourdateFormat = new SimpleDateFormat("HH:mm:ss");
      
        return (hourdateFormat.format(date));
    }

    @Override
    public void run() {
        int i = 1;
        try {
            do {
//                return Tiempo1();
               System.out.println("" + Tiempo1() + " ");
            } while (i == 1);
        } catch (Exception e) {

        }
//        return null;
    }

}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.vista;

import ec.edu.intsuperior.modelo.MyThread;
import ec.edu.intsuperior.modelo.Reloj;

/**
 *
 * @author Santiago
 */
public class Aplicacion {
    public static void main(String[] args) {
//        System.out.println("hilos");
//        System.out.println("ejecucion");
        
//         MyThread hilo = new MyThread();
//         hilo.run();
//         hilo.start();

        Reloj r = new Reloj();
        r.run();
    }
   
}

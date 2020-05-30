/*
En este proceso se hara la versatilidad de el messenger
 */
package paquete;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LPG LojaPonce
 */
public class Proceso extends Thread {
    public Proceso(String msg){
    super(msg);
    }
    public void run(){
        while(true){
            System.out.println(this.getName()+"   "+"Soy del Hilo 1");
            try {
                sleep(20000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Proceso.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}

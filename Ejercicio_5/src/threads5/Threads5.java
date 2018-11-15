package threads5;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Threads5 extends Thread{
    
    public Threads5(String nombre){
        super(nombre);
    }
    
    Thread thread;
    static int count=1;
    
    @Override
    public void run(){
        try {

            while(count <=2){
                count++;
                
                thread = new Threads5("Thread" + count);
                
                thread.start();
                thread.join();
                
                for (int i=0; i<1; i++){
                    System.out.println("Soy el thread " + getName());
                }
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(Threads5.class.getName()).log(Level.SEVERE, null, ex);
        }

       
        
    }
    
    
    
    
    
    public static void main(String[] args) {
        new Threads5("Hilo" + count).start();
        
    }
    
}

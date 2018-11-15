package threads3;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Threads3 extends Thread{
    public Threads3 (String nombre){
        super (nombre);
    }
    Thread thread;
    static int count = 1;

    @Override
    public void run(){
        try{
            System.out.println("El "+getName() +" ha comenzado");
            
            while(count <= 5){
                count ++;
                
                thread = new Threads3("Thread "+count);
                thread.start();
                
                for(int i=0;i<10;i++){
                    System.out.println(getName()+ " en proceso");
                    sleep((long) ((Math.random() * (600 - 100)) + 100));
                }
                thread.join();
                System.out.println("El "+ getName()+" ha terminado");
            }
       
        
    }   catch (InterruptedException ex) {
            Logger.getLogger(Threads3.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void main(String[] args) {
        new Threads3("Thread " + count).start();
        
    }
    
}

package threads2;

public class Threads2 extends Thread {
public Threads2 (String nombre){
    super(nombre);
}

@Override
public void run(){
    for(int i=0; i<5; i++){
        System.out.println(i+" "+getName());
        try{
            Thread.sleep(1000);
        }catch(InterruptedException ex){
            System.out.println("Error: "+ex);
        }
    }
    System.out.println(5+" "+getName());
    System.out.println("Termina thread "+getName());
}
    public static void main(String[] args) {
        new Threads2("Pepe").start();
        new Threads2("Tomas").start();
        new Threads2("Andre").start();
        new Threads2("Diego").start();
    }
    
}

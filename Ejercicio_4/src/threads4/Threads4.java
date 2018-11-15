package threads4;

public class Threads4 extends Thread{
    
    public Threads4(String nombre){
        super(nombre);
    }
    Thread thread;
    @Override
    public void run(){
        int suma = 0;
        
        thread = new Threads4("SeriePares");
        System.out.println(getName() + " ha comenzado");
        for(int i=0; i<=1000; i+=2){
            suma = suma + i;
        }

        System.out.println("Serie Par: "+ suma);
        
        thread = new Threads4("SerieImpares");
        System.out.println(getName() + " ha comenzado");
            for(int i=1; i<=1000; i+=2){
                suma = suma + i;
                
            }
            System.out.println("Serie Impar: "+suma);
            
        
        thread = new Threads4("Serie2-3");
        System.out.println(getName() +" ha comenzado");
            for(int i=0; i==100; i++){
               int digito = i % 10;
               if(digito == 2 || digito == 3){
                   suma = suma +i;
               }
            }
            System.out.println("Serie 2-3: " + suma );
            
    }
    
    public static void main(String[] args) {

        new Threads4("HiloPadre").start();
    }
    
}

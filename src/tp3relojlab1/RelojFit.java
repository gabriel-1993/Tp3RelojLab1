package tp3relojlab1;


import static java.lang.Math.random;
import static java.lang.StrictMath.random;
import java.time.LocalTime;
import java.util.Random;

public class RelojFit extends Reloj {
    
    private int x;
    private int y;
    
    

    public RelojFit(String modelo, long numSerie,int x,int y){
        super( modelo, numSerie);
        this.x=x;
        this.y=y;
    }
    
    public void cuentaPasos(int x,int y){
       int r=x+y;
        System.out.println("Pasos realizados:"+ r);
       
       
    }
    
    public void frecuenciaAleatoria(){
    Random random = new Random();
    int latidos= random.nextInt(140 - 60 + 1) + 60; 
        System.out.println("Frecuencia por minuto:"+latidos);
    
    }
}

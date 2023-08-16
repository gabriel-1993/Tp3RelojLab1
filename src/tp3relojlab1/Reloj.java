package tp3relojlab1;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Reloj {

protected LocalDate dia= LocalDate.now();

protected LocalTime hora= LocalTime.now();

protected String modelo;

protected long numSerie;

public Reloj(String modelo, long numSerie){
  this.modelo=modelo;
  this.numSerie= numSerie;
  this.hora= hora;
  this.dia=dia;
}

    public int getDia() {
        return dia.getDayOfMonth();
    }

    public String getHora() {
        
        return hora.getHour()+":"+hora.getMinute();
    }

    public void incrementarDia(int n){
        dia.plusDays(n);
        System.out.println("incrementando dia: "+getDia()+"/"+dia.getMonth() );   
    }
    
     public void restarDia(int n){
        dia.minusDays(n);
        System.out.println("restando dia: "+getDia()+"/"+dia.getMonth() );   
    }
    
    
    public void incrementarHora(int n){
        hora.plusHours(n);
        System.out.println("incrementando hora: "+n+" hs, hora actual:"+getHora());
        ; 
    }
      public void restarHora(int n){
        hora.minusHours(n);
        System.out.println("restando hora: "+n+" hs, hora actual:"+getHora());
        ; 
    }
    
    public void limpiarPantalla(){
        System.out.println("?????????????");
    }
}

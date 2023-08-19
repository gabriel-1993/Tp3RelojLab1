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
        LocalDate sumar =dia.plusDays(n);
        dia=sumar;
        System.out.println("incrementando dia: "+getDia()+"/"+dia.getMonth() );   
    }
    
     public void restarDia(int n){
         LocalDate resta = dia.minusDays(n);
         dia=resta;
        System.out.println("restando dia: "+getDia()+"/"+dia.getMonth() );
    }
     public void incrementarMes(int n){
        LocalDate sumar =dia.plusMonths(n);
        dia=sumar;
        System.out.println("incrementando dia: "+getDia()+"/"+dia.getMonth() );   
    }
      public void restarMes(int n){
         LocalDate resta = dia.minusMonths(n);
         dia=resta;
        System.out.println("restando dia: "+getDia()+"/"+dia.getMonth() );
    }
       public void restarAnio(int n){
         LocalDate resta = dia.minusYears(n);
         dia=resta;
        System.out.println("restando dia: "+getDia()+"/"+dia.getMonth()+"/"+dia.getYear() );
    }
       public void incrementarAnio(int n){
         LocalDate resta = dia.plusYears(n);
         dia=resta;
        System.out.println("restando dia: "+getDia()+"/"+dia.getMonth()+"/"+dia.getYear() );
    }
    
    public void incrementarHora(int n){
        LocalTime suma= hora.plusHours(n);
        hora=suma;
        System.out.println("incrementando hora: "+n+" hs, hora actual:"+getHora());
        ; 
    }
      public void restarHora(int n){
          LocalTime restar= hora.minusHours(n);
          hora= restar;
        System.out.println("restando hora: "+n+" hs, hora actual:"+getHora());
        ; 
    }
       public void incrementarMinutos(int n){
        LocalTime suma= hora.plusMinutes(n);
        hora=suma;
        System.out.println("incrementando hora: "+n+" minutos, hora actual:"+getHora());
        ; 
    }
        public void restarMinutos(int n){
        LocalTime suma= hora.minusMinutes(n);
        hora=suma;
        System.out.println("incrementando hora: "+n+" minutos, hora actual:"+getHora());
        ; 
    }
         public void incrementarSegundos(int n){
        LocalTime suma= hora.plusSeconds(n);
        hora=suma;
        System.out.println("incrementando hora: "+n+" minutos, hora actual:"+getHora());
        ; 
    }
           public void restarSegundos(int n){
        LocalTime suma= hora.minusSeconds(n);
        hora=suma;
        System.out.println("incrementando hora: "+n+" minutos, hora actual:"+getHora());
        ; 
    }
    
    public void limpiarPantalla(){
System.out.print("\033[H\033[2J");

        }
}

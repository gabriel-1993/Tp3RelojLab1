package tp3relojlab1;

public class Tp3RelojLab1 {

    public static void main(String[] args) {
        RelojFit r1 = new RelojFit("Casio",122333);
        Reloj r2 = new Reloj("asfafs",23253);
        Persona pepe = new Persona("Pepe", "Lopez",34,1.70);
        pepe.hablar();
        pepe.comer();
        System.out.println("Hora Reloj ");
        pepe.decirHora(r1);
        System.out.println("Hora RelojFit");
        pepe.decirHora(r2);
        System.out.println("Usar reloj fit");
        pepe.usarReloj(r1);
      
     
    }
    
}

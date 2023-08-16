package tp3relojlab1;

public class Tp3RelojLab1 {

    public static void main(String[] args) {
        RelojFit r1 = new RelojFit("Casio",122333,10,20);
        Reloj r2 = new Reloj("asfafs",23253);
        Persona pepe = new Persona("Pepe", "Lopez",34,1.70);
        pepe.hablar();
        pepe.comer();
        //paso reloj a un metodo de persona cumple la dependencia
        pepe.decirHora(r1);
        pepe.decirHora(r2);
        pepe.usarReloj(r1);
      
     
    }
    
}

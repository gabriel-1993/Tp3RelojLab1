package tp3relojlab1;

import java.util.Scanner;

import java.util.Scanner;

public class Persona {

    private String nombre;

    private String apellido;

    private int edad;

    private double altura;

    public Persona(String nombre, String apellido, int edad, double altura) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.altura = altura;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void comer() {
        System.out.println("no puede hablar parece que esta bueno el sanguche ");
    }

    public void hablar() {
        System.out.println("Hola ! buenas buenas...");
    }

    public void decirHora(Reloj r1) {
        System.out.println("La hora es: " + r1.getHora());
    }

    public void usarReloj(RelojFit r1) {

        int resp = 0;

        do {
            Scanner leer = new Scanner(System.in);
            System.out.println("Elija una opcion");
            System.out.println("1 salir");
            System.out.println("2 Mostrar Hora");
            System.out.println("3 Incrementar Hora");
            System.out.println("4 Restar Hora");
            System.out.println("5 Incrementar Minutos");
            System.out.println("6 Restar Minutos ");
            System.out.println("7 Incrementar Segundos");
            System.out.println("8 Restar Segundos");
            System.out.println("9 Incrementar Anio");
            System.out.println("10 Restar Anio");
            System.out.println("11 Incrementar Mes");
            System.out.println("12 Restar Mes");
            System.out.println("13 Incrementar Dia");
            System.out.println("14 Restar Dia");
           
            if (r1 instanceof RelojFit && resp != 1) {
                System.out.println("15 cuenta pasos");
                System.out.println("16 frecuencia");
            }
            resp = leer.nextInt();

            switch (resp) {
                case 1:
                    System.out.println("Hasta luego =) ");
                    break;
                case 2:
                    this.decirHora(r1);
                    break;

                case 3:
                    System.out.println("Ingrese la cantidad de hs a incrementar");
                    r1.incrementarHora(leer.nextInt());
                    this.decirHora(r1);
                    break;
                case 4:
                    System.out.println("Ingrese la cantidad de hs a restar");
                    r1.restarHora(leer.nextInt());
                    this.decirHora(r1);
                    break;
                case 5:
                    System.out.println("Ingrese la cantidad de minutos a incrementar");
                    r1.incrementarMinutos(leer.nextInt());
                    this.decirHora(r1);
                    break;
                case 6:
                    System.out.println("Ingrese la cantidad de minutos a restar");
                    r1.restarMinutos(leer.nextInt());
                    this.decirHora(r1);
                    break;
                case 7:
                    System.out.println("Ingrese la cantidad de segundos a incrementar");
                    r1.incrementarSegundos(leer.nextInt());
                    this.decirHora(r1);
                    break;
                case 8:
                    System.out.println("Ingrese la cantidad de segundos a restas");
                    r1.restarSegundos(leer.nextInt());
                    this.decirHora(r1);
                    break;
                case 9:
                    System.out.println("ingrese la cantidad a incrementar en anio");
                    r1.incrementarAnio(leer.nextInt());
                    System.out.println("Fecha actualizada : " + r1.getDia());
                    break;
                case 10:
                    System.out.println("ingrese la cantidad a restar en anio");
                    r1.restarAnio(leer.nextInt());
                    System.out.println("Fecha actualizada : " + r1.getDia());
                    break;
                 case 11:
                    System.out.println("ingrese la cantidad a incrementar en mes");
                    r1.incrementarMes(leer.nextInt());
                    System.out.println("Fecha actualizada : " + r1.getDia());
                    break;  
                case 12:
                    System.out.println("ingrese la cantidad a restar en mes");
                    r1.restarMes(leer.nextInt());
                    System.out.println("Fecha actualizada : " + r1.getDia());
                    break;      
                case 13:
                    System.out.println("ingrese la cantidad a incrementar en dia");
                    r1.incrementarDia(leer.nextInt());
                    System.out.println("Fecha actualizada : " + r1.getDia());
                    break;    
                case 14:
                    System.out.println("ingrese la cantidad a restar en dia");
                    r1.restarDia(leer.nextInt());
                    System.out.println("Fecha actualizada : " + r1.getDia());
                    break;       
                default:
                    break;
            }
        } while (resp != 1);
    }

}

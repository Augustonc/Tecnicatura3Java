package test;

import enumeraciones.Dias;

public class TestEnumeraciones {
    public static void main(String[] args) {
        
        //Las enumeraciones se tratan como cadenas
        //No se deben colocar comillas, se accede a los elementos a través del operador de punto
        System.out.println("Día 1: "+Dias.LUNES);
        indicarDiaSemana(Dias.LUNES); 
        System.out.println("Día 2: "+Dias.MARTES);
        indicarDiaSemana(Dias.MARTES);
        System.out.println("Día 3: "+Dias.MIERCOLES);
        indicarDiaSemana(Dias.MIERCOLES);
        System.out.println("Día 4: "+Dias.JUEVES);
        indicarDiaSemana(Dias.JUEVES);
        System.out.println("Día 5: "+Dias.VIERNES);
        indicarDiaSemana(Dias.VIERNES);
        System.out.println("Día 6: "+Dias.SABADO);
        indicarDiaSemana(Dias.SABADO);
        System.out.println("Día 7: "+Dias.DOMINGO);
        indicarDiaSemana(Dias.DOMINGO);
      
    }
    private static void indicarDiaSemana(Dias dias){
        switch(dias){
            case LUNES:
                System.out.println("Primer día de la semana");
                break;
            case MARTES:
                System.out.println("Segundo día de la semana");
                break;
                
                //TAREA! Colocar el resto de los días de la semana
                // Colocar default
                
            case MIERCOLES:
                System.out.println("Tercer día de la semana");
                break;
            case JUEVES:
                System.out.println("Cuarto día de la semana");
                break;
            case VIERNES:
                System.out.println("Quinto día de la semana");
                break;
            case SABADO:
                System.out.println("Sexto día de la semana");
                break;
            case DOMINGO:
                System.out.println("Séptimo día de la semana");
                break;
            default:
                System.out.println("No existe ese día");
        }
    }
}

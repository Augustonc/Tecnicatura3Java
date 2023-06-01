
package mundopc;

import ar.com.system2023.mundopc.*;

public class mundoPC {
    public static void main(String[] args){
        
        //Computadora HP
        Monitor monitorHP = new Monitor("HP", 13); //Importar la clase
        Teclado tecladoHP = new Teclado("Bluetooth", "HP");
        Raton ratonHP = new Raton("Bluetooth", "HP");
        Computadora computadoraHP = new Computadora("Computadora HP", monitorHP, tecladoHP, ratonHP);
        
         //Computadora Gamer
        //Creamos otros objetos
        Monitor monitorGamer = new Monitor("Gamer", 32);
        Teclado tecladoGamer = new Teclado("Bluetooth", "Gamer");
        Raton ratonGamer = new Raton("Bluetooth", "Gamer");
        Computadora computadoraGamer = new Computadora("Computadora Gamer", monitorGamer, tecladoGamer, ratonGamer);
        
        //Computadora Dell
        Monitor monitorDell = new Monitor("Dell", 15);
        Teclado tecladoDell = new Teclado("Bluetooth", "Dell");
        Raton ratonDell = new Raton("Bluetooth", "Dell");
        Computadora computadoraDell = new Computadora("Computadora Dell", monitorDell, tecladoDell, ratonDell);
        
        //Computadora Lenovo
        Monitor monitorLenovo = new Monitor("Lenovo", 17);
        Teclado tecladoLenovo = new Teclado("Bluetooth", "Lenovo");
        Raton ratonLenovo = new Raton("Bluetooth", "Lenovo");
        Computadora computadoraLenovo = new Computadora("Computadora Lenovo", monitorLenovo, tecladoLenovo, ratonLenovo);
        
        //Computadora Apple
        Monitor monitorApple = new Monitor("Apple", 12);
        Teclado tecladoApple = new Teclado("Bluetooth", "Apple");
        Raton ratonApple = new Raton("Bluetooth", "Apple");
        Computadora computadoraApple = new Computadora("Computadora Apple", monitorApple, tecladoApple, ratonApple);
        
        //Computadora Asus
        Monitor monitorAsus = new Monitor("Asus", 22);
        Teclado tecladoAsus = new Teclado("Bluetooth", "Asus");
        Raton ratonAsus = new Raton("Bluetooth", "Asus");
        Computadora computadoraAsus = new Computadora("Computadora Asus", monitorAsus, tecladoAsus, ratonAsus);
        
        //Computadora Acer
        Monitor monitorAcer = new Monitor("Acer", 28);
        Teclado tecladoAcer = new Teclado("Bluetooth", "Acer");
        Raton ratonAcer = new Raton("Bluetooth", "Acer");
        Computadora computadoraAcer = new Computadora("Computadora Acer", monitorAcer, tecladoAcer, ratonAcer);
        
        //Computadora Toshiba
        Monitor monitorToshiba = new Monitor("Toshiba", 19);
        Teclado tecladoToshiba = new Teclado("Bluetooth", "Toshiba");
        Raton ratonToshiba = new Raton("Bluetooth", "Toshiba");
        Computadora computadoraToshiba = new Computadora("Computadora Toshiba", monitorToshiba, tecladoToshiba, ratonToshiba);
        
        //Computadora MSI
        Monitor monitorMSI = new Monitor("MSI", 14);
        Teclado tecladoMSI = new Teclado("Bluetooth", "MSI");
        Raton ratonMSI = new Raton("Bluetooth", "MSI");
        Computadora computadoraMSI = new Computadora("Computadora MSI", monitorMSI, tecladoMSI, ratonMSI);

        //Computadora Sony
        Monitor monitorSony = new Monitor("Sony", 23);
        Teclado tecladoSony = new Teclado("Bluetooth", "Sony");
        Raton ratonSony = new Raton("Bluetooth", "Sony");
        Computadora computadoraSony = new Computadora("Computadora Sony", monitorSony, tecladoSony, ratonSony);

        //Computadora Samsung (Esta es la computadora N° 11)
        Monitor monitorSamsung = new Monitor("Samsung", 22);
        Teclado tecladoSamsung = new Teclado("Bluetooth", "Samsung");
        Raton ratonSamsung = new Raton("Bluetooth", "Samsung");
        Computadora computadoraSamsung = new Computadora("Computadora Samsung", monitorSamsung, tecladoSamsung, ratonSamsung);

        
        Orden orden1 = new Orden();//Inicializamos el arreglo
        Orden orden2 = new Orden();//Una nueva lista para el objeto orden2
        
        orden1.agregarComputadora(computadoraHP);
        orden1.agregarComputadora(computadoraGamer);        
        orden1.agregarComputadora(computadoraDell);
        orden1.agregarComputadora(computadoraLenovo);
        orden1.agregarComputadora(computadoraApple);
        orden1.agregarComputadora(computadoraAsus);
        orden1.agregarComputadora(computadoraAcer);
        orden1.agregarComputadora(computadoraToshiba);
        orden1.agregarComputadora(computadoraMSI);
        orden1.agregarComputadora(computadoraSony);
        orden1.agregarComputadora(computadoraSamsung);
        
        Computadora ComputadorasVarias = new Computadora("Computadora de diferentes marcas: ", monitorHP, tecladoGamer, ratonHP);
        orden2.agregarComputadora(ComputadorasVarias);
        
        orden1.mostrarOrden();
        orden2.mostrarOrden();
        
        //TAREA!!
        //Crear más objetos de tipo computadora con todos sus elementos
        //Completar una lista en el objeto orden1 que llegue a los 10 elementos
        //Probar de esta manera los métodos al máximo rendimiento
    }
}

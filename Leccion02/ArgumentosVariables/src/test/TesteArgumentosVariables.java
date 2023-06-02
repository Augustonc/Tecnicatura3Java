package test;

public class TesteArgumentosVariables {
    public static void main(String[] args) {
        imprimirNumeros(3,4,5);
        imprimirNumeros(1, 2);
        variosParametros("Juan", "Perez", 7, 8, 9);
        
    }
    private static void variosParametros(String nombre, String apellido, int ...numeros){
        System.out.println("Nombre: "+nombre+" - Apellido: "+apellido);
        //System.out.println("Apellido: "+apellido);
        imprimirNumeros(numeros);
    }
    //Los 3 puntitos indican un arreglo con un número indefinido de elementos
    /*Diferencia entre arreglo y argumento variable:
    en los argumentos variables
    no necesitamos saber cuantos argumentos vamos a pasar y en el arreglo si*/
    private static void imprimirNumeros(int ...numeros){
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elementos: "+numeros[i]);
        }
    }
}

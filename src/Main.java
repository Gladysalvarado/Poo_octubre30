import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        char letra = 'j';
        boolean bandera = true;
        long numero = 8_000_000L;
        Float numeroConDecimales = 9.5F;

        int [] numeros = new int[5];
        for (int i = 0; i<numeros.length; i++) {
            numeros[i]= (i+1)*5;

        }

        for (int elemento : numeros) {
            System.out.println(elemento);


        }



    //leer por la consola una palabra
//guardar cada letra en una posicion de un array de char
//Recomendacion se puede usar el metodo charart
                //definir variable

         String palabra;
         char [] letras;
         Scanner teclado = new Scanner(System.in);
         //Estructura....leer la palabra
System.out.println("Escriba la palabra");
palabra = teclado.nextLine();
letras = new char[palabra.length()];

//bucle
for (int i = 0; i <letras.length;i ++){
    letras[i] =palabra.charAt(i);
    System.out.println(letras[i]);

        }
for (char elemento : letras){
System.out.println(elemento);
     }                           


          }
  }

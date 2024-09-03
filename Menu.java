import java.util.Scanner;

public class Menu {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int tope = 0;
        int contador = 0;

        Lista listaEnteros = new Lista();


        System.out.println("Ingrese la cantidad de numeros a almacenar: ");
        tope = leer.nextInt();
        while(contador<tope){

            System.out.println("Ingrese el dato a almacenar: ");
            int dato = leer.nextInt();
            listaEnteros.agregarAlInicio(dato);                      
            contador++;
        }

        listaEnteros.imprimirLista();
        
    }
    
}

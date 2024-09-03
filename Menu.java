import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        boolean flag = true;
        
        Lista listaEnteros = new Lista();

        while(flag){
            
            System.out.println("\nMENU LISTA SIMPLE.\n1. Insertar al inicio.\n2. Mostrar la lista.\n3. Buscar un dato.\n4. Eliminar un dato.\n5. Salir\n");
            int opc = leer.nextInt();
            switch (opc) {
                case 1:
                    int tope = 0;
                    System.out.println("Ingrese la cantidad de numeros a almacenar: ");
                    tope = leer.nextInt();                    
                    int contador = 0;
                    
                    while (contador < tope) {
    
                        System.out.println("Ingrese el dato a almacenar: ");
                        int dato = leer.nextInt();
                        listaEnteros.agregarAlInicio(dato);
                        contador++;
                    }
                    break;
    
                case 2:
                    listaEnteros.imprimirLista();
                    break;
                
                case 3:
                    System.out.println("Ingrese el dato a buscar: ");
                    int datoBuscar = leer.nextInt();
                    listaEnteros.buscarDato(datoBuscar);
                    break;
                case 4:
                    System.out.println("Que dato desea elimnar? ");
                    int eliminar = leer.nextInt();
                    listaEnteros.eliminarNodo(eliminar);
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    flag = false;
    
                default:
                    break;
            }
        }  
    }
}

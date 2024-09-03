class Lista{
    Nodo cabeza;

    public Lista() {
        this.cabeza = null;
    }

    
    public void agregarAlInicio(int dato) {//almacenamos dato al inicio de la lista
        Nodo nuevoNodo = new Nodo(dato, cabeza);
        nuevoNodo.siguiente = cabeza;
        cabeza = nuevoNodo;
    }

    
    public void imprimirLista() {//Imprimir la lista
        Nodo actual = cabeza;
        while (actual != null) {
            
            System.out.print("["+actual.dato + "]"+ "["+actual.siguiente+"]---");//concatenamos la direccion de memoria del nodo siguiente
            actual = actual.siguiente;
        }
        
    }
}

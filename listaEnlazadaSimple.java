class Lista{
    Nodo cabeza;

    public Lista() {
        this.cabeza = null;
    }

    
    public void agregarAlInicio(int dato) {//almacenamos dato al inicio de la lista
        Nodo nuevoNodo = new Nodo(dato);
        nuevoNodo.siguiente = cabeza;
        cabeza = nuevoNodo;
    }

    
    public void imprimirLista() {//Imprimir la lista
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.print(actual.dato + " ");
            actual = actual.siguiente;
        }
        System.out.println();
    }
}

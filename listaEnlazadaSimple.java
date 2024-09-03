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

    public void buscarDato(int dato){//buscando un dato
        Nodo actual = cabeza;
        while(actual != null){
            if(actual.dato == dato){
                System.out.println("Elemento encontrado: "+actual.dato);   
                break;             
            }
            actual = actual.siguiente;
        }
        System.out.println("Elemento no encontrado. ");
        
    }

    public void eliminarNodo(int dato) {
        if (cabeza == null) {//validamos si la lista esta vacia
            System.out.println("La lista está vacía.");
            return;
        }

        
        if (cabeza.dato == dato) {// Si el nodo a eliminar es la cabeza
            cabeza = cabeza.siguiente;//asignamos el otro nodo de la lista
            return;
        }

        Nodo actual = cabeza;
        while (actual.siguiente != null && actual.siguiente.dato != dato) {
            actual = actual.siguiente;
        }

        if (actual.siguiente == null) {
            System.out.println("El dato no se encontró en la lista.");
        } else {
            actual.siguiente = actual.siguiente.siguiente;
        }
    }


}

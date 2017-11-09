import com.sun.glass.ui.Size;

/**
 * Created by luciano on 08/nov/2017.
 */
public class pilas {
    public int size = 0;
    private  nodo top;

    public pilas(){
        top = null;
    }

    public boolean vacia(){
        return  (top == null);
    }

    //Método para insertar datos ala pila
    public void push(int valor){ //insertar
        nodo nuevoNodo;
        if (vacia())
            top = new nodo(valor);
        else{
            nuevoNodo = new nodo(valor);
            nuevoNodo.setProx(top);
            top = nuevoNodo;
        }
        size ++;
    }

    //Método para mostrar datos de la pila
    public  void peek(){ //mostrar
        nodo temp = top;
        if (temp != null){
            System.out.println("La pila es: ");
            while (temp!= null){
                System.out.println(temp.getValor());
                temp = temp.getProx();
            }
        }
        else
            System.out.println("PILA VACÍA.");
    }

    //Método para buscar datos en la pila
    public void cima(){ //buscar
        if (!vacia())
            System.out.println("Cima: " + top.getValor());
        else
            System.out.println("La pila esta vacía");
    }

    //Método para borrar datos de la pila
    public void pop(){ //extraer
        if (!vacia()){
            System.out.println("Dato extraido: " + top.getValor());
            top = top.getProx();
        }
        else
            System.out.println("La pila esta vacía");
        size --;
    }

    public void getSize(){
         System.out.println("El tamaño: " + size);
    }

}

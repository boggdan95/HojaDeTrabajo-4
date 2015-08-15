import java.util.ArrayList;


/**
 * @author Boggdan Barrientos, Diego De Leon, Jasmin Valdez
 *
 * @param <E>
 */
public class StackArrayList<E> extends AbstractStack implements ADTStack<E>{
    
    protected ArrayList<E> pila;
    
    public StackArrayList(){
        pila = new ArrayList<E>();
    }
    
    public void push(E item){
        pila.add(item);
    }
    
    public E pop(){

        return pila.remove(size()-1);
    	
    }
    
    public E peek(){
        return pila.get(size() - 1);
    }
    
    public boolean isEmpty(){
        return size() == 0;
    }
    
    public int size(){
        return pila.size();
    }
    /**
    *Borra todos los elementos de la pila
    *
    */
    public void empty(){
        pila.clear();
    }
}
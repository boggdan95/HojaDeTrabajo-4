import java.util.ArrayList;


/**
 * @author Boggdan Barrientos, Diego De Leon, Jasmin Valdez
 *
 * @param <E>
 */
public class StackArrayList<E> extends AbstractStack implements ADTStack<E>{
    
    protected ArrayList<E> pila;
    
    /**
     * Instantiates a new stack array list.
     */
    public StackArrayList(){
        pila = new ArrayList<E>();
    }
    
    /* (non-Javadoc)
     * @see ADTStack#push(java.lang.Object)
     */
    public void push(E item){
        pila.add(item);
    }
    
    /* (non-Javadoc)
     * @see ADTStack#pop()
     */
    public E pop(){

        return pila.remove(size()-1);
    	
    }
    
    /* (non-Javadoc)
     * @see ADTStack#peek()
     */
    public E peek(){
        return pila.get(size() - 1);
    }
    
    /* (non-Javadoc)
     * @see ADTStack#isEmpty()
     */
    public boolean isEmpty(){
        return size() == 0;
    }
    
    /* (non-Javadoc)
     * @see AbstractStack#size()
     */
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

public class StackSE<E> extends AbstractStack implements ADTStack<E>{

	protected SimplementeEnlazada<E> pila = new SimplementeEnlazada<E>();
	
	public StackSE() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void empty() {
		// TODO Auto-generated method stub
		pila.clear();
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if(pila.size() == 0)	return true;
		else return false;
		
	}

	@Override
	public void push(E x) {
		// TODO Auto-generated method stub
		pila.addFirst(x);
	}

	@Override
	public E pop() throws Exception {
		// TODO Auto-generated method stub
		return pila.removeFirst();
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return pila.size();
	}

	@Override
	public E peek() throws Exception {
		// TODO Auto-generated method stub
		return pila.getFirst();
	}

}

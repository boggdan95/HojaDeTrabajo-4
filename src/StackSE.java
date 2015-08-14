
public class StackSE<E> implements ADTStack<E>{

	protected SimplementeEnlazada<E> pila;
	
	@Override
	public void empty() {
		// TODO Auto-generated method stub
		int tamaño = pila.size();
		for (int i = 0; i <= tamaño; i++){
			pila.removeFirst();
		}
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


public class StackDE<E> implements ADTStack<E> {
	
	protected DoblementeEnlazada<E> pila;
	
	@Override
	public void empty() {
		// TODO Auto-generated method stub
		int size = pila.size();
		for (int i = 0; i <= size; i++){
			pila.removeFirst();	}
	}

	@Override
	public boolean isEmpty() {
		//yas TODO Auto-generated method stub
		if(pila.size() == 0)	return true;
		else return false;
	}

	@Override
	public void push(E dat) {
		// TODO Auto-generated method stub
		pila.addFirst(dat);
		
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

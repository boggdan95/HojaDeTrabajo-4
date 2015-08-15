
public class StackC<E> extends AbstractStack implements ADTStack<E> {
	
	protected Circular<E> pila = new Circular<E>();

	/**
	 * Instantiates a new stack c.
	 */
	public StackC() {
		super();
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see ADTStack#empty()
	 */
	@Override
	public void empty() {
		// TODO Auto-generated method stub
		pila.clear();
	}

	/* (non-Javadoc)
	 * @see ADTStack#isEmpty()
	 */
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if(pila.count == 0)	return true;
		else return false;
	}

	/* (non-Javadoc)
	 * @see ADTStack#push(java.lang.Object)
	 */
	@Override
	public void push(E x) {
		// TODO Auto-generated method stub
		pila.addFirst(x);
	}

	/* (non-Javadoc)
	 * @see ADTStack#pop()
	 */
	@Override
	public E pop() throws Exception {
		// TODO Auto-generated method stub
		return pila.removeFirst();
	}

	/* (non-Javadoc)
	 * @see AbstractStack#size()
	 */
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return pila.size();
	}

	/* (non-Javadoc)
	 * @see ADTStack#peek()
	 */
	@Override
	public E peek() throws Exception {
		// TODO Auto-generated method stub
		return pila.getFirst();
	}

}

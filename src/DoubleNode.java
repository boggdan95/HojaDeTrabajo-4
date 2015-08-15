/**
 * @author Boggdan Barrientos, Diego De Leon, Jasmin Valdez
 *
 */

public class DoubleNode<E>{
	
	protected E data;
	protected DoubleNode<E> nextElement;
	protected DoubleNode<E> previousElement;
	
	
	/**
	 * Instantiates a new double node.
	 *
	 * @param v the v
	 * @param next the next
	 * @param previous the previous
	 */
	public DoubleNode(E v, 
			DoubleNode<E> next,
			DoubleNode<E> previous) {
		data = v;
		nextElement = next;
		if(nextElement != null){
			nextElement.previousElement = this;
		}
		previousElement = previous;
		if (previousElement != null){
			previousElement.nextElement = this;
		}
	}
	
	/**
	 * Instantiates a new double node.
	 *
	 * @param v the v
	 */
	public DoubleNode(E v){
		this(v,null,null);
	}
	
	
	
	/**
	 * Next.
	 *
	 * @return the double node
	 */
	public DoubleNode<E> next() {
		// post: returns reference to next value in list  
			return nextElement; 
		}
		
		/**
		 * Sets the next.
		 *
		 * @param next the new next
		 */
		public void setNext(DoubleNode<E> next) {
		// post: sets reference to new next value  
			nextElement = next; 
		}

		/**
		 * Value.
		 *
		 * @return the e
		 */
		public E value() {
		// post: returns value associated with this element  
			return data; 
		}
		
		/**
		 * Sets the value.
		 *
		 * @param value the new value
		 */
		public void setValue(E value) {
		// post: sets value associated with this element  
			data = value; 
		}

		/**
		 * Previous.
		 *
		 * @return the double node
		 */
		public DoubleNode<E> previous() {
			// TODO Auto-generated method stub
			return null;
		}
		
}
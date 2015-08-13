public class DoubleNode<E>{
	
	protected E data;
	protected DoubleNode<E> nextElement;
	protected DoubleNode<E> previousElement;
	
	
	public DoubleNode(E v, DoubleNode<E> next, DoubleNode<E> previous) {
		data = v;
		nextElement = next;
		if(nextElement == null){
			nextElement.previousElement = this;
		previousElement = previous;
		if (previousElement != null){
			previousElement.nextElement = this;
		}
		}
	}
	
	public DoubleNode(E v){
		this(v,null,null);
	}
	
	
	
	public DoubleNode<E> next() {
		// post: returns reference to next value in list  
			return nextElement; 
		}
		
		public void setNext(DoubleNode<E> next) {
		// post: sets reference to new next value  
			nextElement = next; 
		}

		public E value() {
		// post: returns value associated with this element  
			return data; 
		}
		
		public void setValue(E value) {
		// post: sets value associated with this element  
			data = value; 
		}

		public DoubleNode<E> previous() {
			// TODO Auto-generated method stub
			return null;
		}
		
}
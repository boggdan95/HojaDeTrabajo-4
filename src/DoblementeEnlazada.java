public class DoblementeEnlazada<E> extends AbstractList implements ADTLista<E> {
	
	protected int count;
	protected DoubleNode<E> head;
	protected DoubleNode<E> tail;

	public DoblementeEnlazada(E value, DoblementeEnlazada<E> head, DoblementeEnlazada<E> tail) {
		// TODO Auto-generated constructor stub
		head = head;
		tail = tail;
		count = 0;
		
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return count;
	}

	@Override
	public void addFirst(E value) {
		// TODO Auto-generated method stub
		head = new DoubleNode<E>(value,head,null);	
		
		if (tail == null){
			tail = head;
			count ++;
		}
		
	}

	@Override
	public E removeFirst() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E removeLast() {
		// TODO Auto-generated method stub
		DoubleNode<E> temp = tail;
		tail = tail.previous();
		if(tail == null){
			head = null;
		}
		else{
			tail.setNext(null);
		}
		count--;
		return temp.value();
	}

	@Override
	public void addLast(E value) {
		// TODO Auto-generated method stub
		tail = new DoubleNode<E>(value,null,null);
		if(head == null){
			head = tail;
		}
		count++;
		
	}

	@Override
	public E getFirst() {
		// TODO Auto-generated method stub
		return head.value();
	}

	@Override
	public E getLast() {
		// TODO Auto-generated method stub
		return tail.value();
	}

	@Override
	public boolean contains(E value) {
		// TODO Auto-generated method stub
		DoubleNode<E> finger = head;
		while(finger != null && !finger.value().equals(value)){
			finger.next();
		}
		return finger != null;
	}

}
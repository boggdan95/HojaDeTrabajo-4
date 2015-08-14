
public class Circular<E> implements ADTLista<E> {
	
	protected Node<E> tail;
	protected int count;

	public Circular() {
		// TODO Auto-generated constructor stub
		tail = null;
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
		Node<E> temp = new Node<E>(value);
		if(tail == null){
			tail = temp;
			tail.setNext(tail);
		}
		else{
			temp.setNext(tail.next());
			tail.setNext(temp);
		}
		count++;
	}

	@Override
	public E removeFirst() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E removeLast() {
		// TODO Auto-generated method stub
		Node<E> finger = tail;
		while(finger.next() != tail){
			finger = finger.next();
		}
		Node<E> temp = tail;
		if (finger == tail){
			tail = null;
		}
		else{
			finger.setNext(tail.next());
			tail = finger;
		}
		count--;
		return temp.value();
	}

	@Override
	public void addLast(E value) {
		// TODO Auto-generated method stub
		addFirst(value);
		tail = tail.next();
	}

	@Override
	public E getFirst() {
		// TODO Auto-generated method stub
		return tail.next().value();
	}

	@Override
	public E getLast() {
		// TODO Auto-generated method stub
		return tail.value();
	}

	@Override
	public boolean contains(E value) {
		// TODO Auto-generated method stub
		Node<E> finger = tail;
		while(finger != null && !finger.value().equals(value)){
			finger.next();
		}
		return finger != null;
	}
	
	

}
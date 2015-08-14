/**
 * @author Boggdan Barrientos, Diego De Leon, Jasmin Valdez
 *
 */

public class SimplementeEnlazada<E> extends AbstractList implements ADTLista<E> {
	
	protected int count;
	protected Node<E> head; 

	public SimplementeEnlazada() {
		// TODO Auto-generated constructor stub
		head = null;
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
		Node<E> temp = new Node<E>(value,null); 
		count++;	
	}

	@Override
	public E removeFirst() {
		// TODO Auto-generated method stub
		Node<E> temp = head;
		head = head.next();
		count--;
		return temp.value();
	}

	@Override
	public E removeLast() {
		// TODO Auto-generated method stub
		Node<E> finger = head;
		Node<E> previous = null;
		while(finger.next() != null){
			previous = finger;
			finger = finger.next();
			}
		if(previous == null){
			head = null;
		}
		else{
			previous.setNext(null);
		}
		count--;
		return finger.value();
	}

	@Override
	public void addLast(E value) {
		// TODO Auto-generated method stub
		Node<E> temp = new Node<E>(value,null);
		if (head != null){
			Node<E> finger = head;
			while(finger.next() != null){
				finger = finger.next();
			}
			finger.setNext(temp);
		}
		else{
			head = temp;
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
		Node <E> finger = head;
		while(finger.next() != null){
			finger = finger.next();
		}
		return finger.value();
	}

	@Override
	public boolean contains(E value) {
		// TODO Auto-generated method stub
		Node<E> finger = head;
		while(finger != null && !finger.value().equals(value)){
			finger.next();
		}
		return finger != null;
	}

}

/**
 * @author Boggdan Barrientos, Diego De Leon, Jasmin Valdez
 *
 */

public interface ADTLista<E> {
	
	/**
	 * Size.
	 *
	 * @return the int
	 */
	public int size();
	
	/**
	 * Adds the first.
	 *
	 * @param value the value
	 */
	public void addFirst(E value);
	
	/**
	 * Removes the first.
	 *
	 * @return the e
	 */
	public E removeFirst();
	
	/**
	 * Removes the last.
	 *
	 * @return the e
	 */
	public E removeLast();
	
	/**
	 * Adds the last.
	 *
	 * @param value the value
	 */
	public void addLast(E value);
	
	/**
	 * Gets the first.
	 *
	 * @return the first
	 */
	public E getFirst();
	
	/**
	 * Gets the last.
	 *
	 * @return the last
	 */
	public E getLast();
	
	/**
	 * Contains.
	 *
	 * @param value the value
	 * @return true, if successful
	 */
	public boolean contains (E value);	

}

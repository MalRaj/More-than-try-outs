/**
 * 
 */
package stack;

/**
 * @author malavika_parvathy
 *
 */
public interface Stack<E> {
	public int size();
	public boolean isEmpty();
	public E top() throws StackException;
	public void push(E element);
	public E pop();

}

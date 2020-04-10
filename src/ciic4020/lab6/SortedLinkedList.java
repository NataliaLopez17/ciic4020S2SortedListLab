package ciic4020.lab6;

/**
 * @author YOUR NAME HERE
 *
 */
public class SortedLinkedList<E extends Comparable<? super E>> extends AbstractSortedList<E> {
	
	@SuppressWarnings("unused")
	private static class Node<E> {

		private E value;
		private Node<E> next;
		
		public Node(E value, Node<E> next) {
			this.value = value;
			this.next = next;
		}
		
		public Node(E value) {
			this(value, null); // Delegate to other constructor
		}
		
		public Node() {
			this(null, null); // Delegate to other constructor
		}

		public E getValue() {
			return value;
		}

		public void setValue(E value) {
			this.value = value;
		}

		public Node<E> getNext() {
			return next;
		}

		public void setNext(Node<E> next) {
			this.next = next;
		}
			
		public void clear() {
			value = null;
			next = null;
		}				
	} // End of Node class

	private Node<E> head; // First DATA node (This is NOT a dummy header node)

	public SortedLinkedList() {
		head = null;
		currentSize = 0;
	}

	@Override
	public void add(E e) {
		/* TODO ADD CODE HERE */
		/* Special case: Be careful when the new value is the smallest */
	}

	@Override
	public boolean remove(E e) {
		/* TODO ADD CODE HERE */
		/* Special case: Be careful when the value is found at the head node */
		return false;
	}

	@Override
	public E removeIndex(int index) {
		/* TODO ADD CODE HERE */
		/* Special case: Be careful when index = 0 */
		return null;
	}

	@Override
	public int firstIndex(E e) {
		/* TODO ADD CODE HERE */
		return -1;
	}

	@Override
	public E get(int index) {
		/* TODO ADD CODE HERE */
		return null;
	}

	@Override
	public E[] toArray() {
		/* TODO ADD CODE HERE */
		// E[] theArray = (E[]) new Comparable[size()]; // Cannot use Object here
		return null;
	}
}
package linkedlist;

public class SinglyLinkedList {

	protected SinglyLinkedElement head;
	protected SinglyLinkedElement tail;

	// protected long size;

	/**
	 * constuctor
	 */
	public SinglyLinkedList() {
		head = null;
		tail = null;
		// size = 0;
	}

	/**
	 * Traversal Method to obtain the sum
	 * 
	 * @param newHead
	 * @return
	 */
	public String traversalSum() {
		String sum = "";
		SinglyLinkedElement current = head;
		while (current != null) {
			sum = sum + current.element;
			current = current.nextPointedElement;
		}
		return sum;
	}

	/**
	 * Traversal Method to obtain a particular position from head
	 * 
	 * @param newHead
	 * @return
	 */
	public String getPositionedElementValueFromHead(int i) {
		SinglyLinkedElement current = head;
		for (int j = 0; j < i; j++) {
			current = current.nextPointedElement;
		}
		return current.element;
	}

	/**
	 * Traversal Method to obtain a particular position from head
	 * 
	 * @param newHead
	 * @return
	 */
	public SinglyLinkedElement getPositionedElementFromHead(int i) {
		SinglyLinkedElement current = head;
		for (int j = 0; j < i; j++) {
			current = current.nextPointedElement;
		}
		return current;
	}

	/**
	 * Traversal Method to obtain a particular position from tail ??
	 * 
	 * @param newHead
	 * @return
	 */
	public String getPositionedElementFromTail(int i) {
		SinglyLinkedElement current = tail;
		for (int j = 0; j < i; j++) {
			current = current.nextPointedElement;
		}
		return current.element;
	}

	public SinglyLinkedElement addElementAtStart(String value) {
		SinglyLinkedElement newHead = new SinglyLinkedElement(value, head);
		// newHead.setElement(value);
		// newHead.setNext(head);//current head will become the second elemnt
		// after the new head
		head = newHead;
		// size = size+1;
		return newHead;
	}

	public SinglyLinkedElement addElement(String value, int position) {
		if (position == 0) {
			return addElementAtStart(value);
		} else {
			SinglyLinkedElement positionElement = getPositionedElementFromHead(position);
			if (positionElement.nextPointedElement == null) {
				return addElementAtLast(positionElement);
			}
			SinglyLinkedElement newHead = new SinglyLinkedElement(value,
					positionElement.nextPointedElement);
			positionElement.nextPointedElement = newHead;
			return newHead;
		}

	}

	public SinglyLinkedElement addElementAtLast(SinglyLinkedElement newTail) {
		newTail.setNext(null);
		tail = newTail;
		// size =size+1;
		return newTail;
	}

}

class SinglyLinkedElement {

	public String element;
	public SinglyLinkedElement nextPointedElement;

	public SinglyLinkedElement(String s, SinglyLinkedElement n) {
		element = s;
		nextPointedElement = n;
	}

	public String getElement() {
		return element;
	}

	public void setElement(String element) {
		this.element = element;
	}

	public SinglyLinkedElement getNext() {
		return nextPointedElement;
	}

	public void setNext(SinglyLinkedElement next) {
		this.nextPointedElement = next;
	}

	// Methods

}
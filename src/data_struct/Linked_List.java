package data_struct;

public class Linked_List {

	@SuppressWarnings("hiding")
	static class Node<Integer> {
		 int data;
		 Node<Integer> link;
	}

	private Node<Integer> head;
	private Node<Integer> tail;

	public Linked_List() {
		this.head =  new Node<Integer>();
		this.tail =  new Node<Integer>();
		head.link = tail;
	}

	public void addFirst(int data) {
		Node<Integer> node = new Node<Integer>(); // e and next are null
		head.data = data;
		head.link = node;
		head = node;
	}

	public void addLast(int data) {
		Node<Integer> node = new Node<Integer>(); // e and next are null
		tail.data = data;
		tail.link = node;
		tail = node;
	}

	public Integer deleteFirst() {
		Node<Integer> first = head.link;//we take first element and then assign to new node
		head.link = first.link;//head now becomes the first element and the element pointed by it becomes first
		return first.data;
	}

	public Integer deleteLast() {
		// cannot do without iteration of the list! :-(
		throw new UnsupportedOperationException();
	}

	
	public Node<Integer> findFirst(Integer data) {//find first occurence of an element
		Node<Integer> curr = head.link;
        while(curr != null) {
            if(curr.data == data) 
            	return curr;
            curr = curr.link;
        }
        return null;
    }

    public void print() {
    	Node<Integer> curr = head.link;
        while(curr.link != null) {
            System.out.println(curr.data);
            curr = curr.link;
        }
    }

    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Linked_List ll = new Linked_List();
		ll.addLast(1);
		ll.addLast(3);
		ll.addLast(5);
		ll.addLast(2);
		ll.addLast(10);
		ll.addFirst(6);
		ll.print();
		
		ll.deleteFirst();
		
		ll.print();
		
		ll.findFirst(2);
		

	}

}

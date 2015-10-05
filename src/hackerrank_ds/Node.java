package hackerrank_ds;
class Node {
    int data;
    Node next;
    
    
    public void print(Node head) {
    	Node curr = head.next;
        while(curr.next != null) {
            System.out.printf("\n"+curr.data);
            curr = curr.next;
        }
    }

 }


public class Queue<V> {
	private Node<V> front = null;
	private Node<V> back = null;
	
	public Queue() {
		front = null;
		back = null;
	}
	
	public boolean isEmpty() {
		if(front != null) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void enqueue(Node<V> node) {
		if(!isEmpty()) {
			front = new Node<V>();
			front.setNode(node.getNodeData());
			front.setNext(back);
			front.setLast(back);
			back = front;
		}
		else {
			Node<V> oldBack = back;
			back = new Node<V>();
			back.setNode(node.getNodeData());
			back.setNext(null);
			back.setLast(oldBack);
			oldBack.setNext(back);
		}
	}
	
	public Node<V> dequeue() {
		if(!isEmpty()) {
			return null;
		}
		else {
			Node<V> returnNode = back;
			back = back.getPrev();
			return returnNode;
		}
	}
	
	public Node<V> getFront() {
		if(!isEmpty()) {
			return null;
		}
		return front;
	}
}

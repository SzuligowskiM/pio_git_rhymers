package edu.kis.vh.nursery.list;

public class IntLinkedList {

	private static final int ERROR_EMPTY_LIST = -1;
	Node last;
	int number;

	private void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.setNext(new Node(i));
			last.getNext().setPrev(last);
			last = last.getNext();
		}
	}

	private boolean isEmpty() {
		return last == null;
	}

	private boolean isFull() {
		return false;
	}

	private int top() {
		if (isEmpty())
			return ERROR_EMPTY_LIST;
		return last.getValue();
	}

	private int pop() {
		if (isEmpty())
			return ERROR_EMPTY_LIST;
		int ret = last.getValue();
		last = last.getPrev();
		return ret;
	}

}

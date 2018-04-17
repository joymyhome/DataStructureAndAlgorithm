	// return the second_to_last node 
	public E secondLast() {
		if (isEmpty() || size == 1)
			return null;
		Node<E> pass = head;	
		for (int i = 1; i < size-1; i ++) {
			pass = pass.getNext();
		}
		return pass.getElement();
			
	}
package linkedlist;

public  class Linkedlist {

	Node head;
	int size;

	
	public int size(){
		
		return this.size;
	}
	// insert node at end
	
	public void insert(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;

		if (head == null) {
			head = node;
			this.size++;
		} else {
			Node temp = head; // a temporary node to traverse the list

			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = node;
			this.size++;
		}
	}

	public void insertAtfirst(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		node.next = head;
		head = node;
		this.size++;

	}

	public void insertAt(int index, int data) {
		Node node = new Node();
		node.data = data;
		if (index == 0)
			insertAtfirst(data);

		else {

			Node temp = head;
			for (int i = 0; i < index - 1; i++) {
				temp = temp.next;
			}
			node.next = temp.next; // we need to link the remaining linked list
									// so that we don't loose the list
			temp.next = node; // now link the temporary node to the new node
			this.size++;
		}
	}

	public void deleteAt(int index) {
	
		if (index == 0) {
			head = head.next;
		} else {
			Node temp = head;
			Node temp2 = null;

			for (int i = 0; i < index - 1; i++) {
				temp = temp.next;
			}
			temp2=temp.next;
			temp.next=temp2.next;
			temp2=null;
			this.size--;
		
			
		}
	}
	public Node getNode(int index){
		
		Node temp=head;
		for(int i=0;i<index;i++){
			temp=temp.next;
		}
		return temp;
	}

	public void show() {
		Node temp = head;
		while (temp.next != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.print(temp.data + " ");
		System.out.println();
	}

}

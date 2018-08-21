package linkedlist;

public class ReverseLinkedList {

	public static void main(String[] args) {
		Linkedlist l1=new Linkedlist();
		l1.insert(10);
		l1.insert(20);
		l1.insert(30);
		l1.insert(40);
		l1.show();
		System.out.println(l1.size);
		solution(l1);

	}
	public static void solution(Linkedlist l1){
		Node nn= new Node();
		int n=l1.size()-1;
		for(int i=n;i>=0;i--){
			nn=l1.getNode(i);
			System.out.println(nn.data);
		}
		
	}

}

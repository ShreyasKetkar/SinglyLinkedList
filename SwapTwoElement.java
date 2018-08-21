package linkedlist;

import java.util.Scanner;

public class SwapTwoElement {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
	Linkedlist ll=new Linkedlist();
	ll.insert(1);
	ll.insert(2);
	ll.insert(3);
	ll.insert(4);
	ll.insert(5);
	ll.show();
	//System.out.println("enter number you want to swap");
	int num1=sc.nextInt();
	//System.out.println("enter 2nd number you want to swap");
	int num2=sc.nextInt();
	
	 solution (ll,num1,num2);
	}
	public static void solution(Linkedlist ll,int num1,int num2){
		Node temp=ll.head;
		int counter=0;
		
		
		while(temp.data!=num1){
			temp=temp.next;
			counter++;
			
		}
		int x1=temp.data;
		temp=ll.getNode(counter);
		temp.data=num2;
		counter=0;
		temp=ll.head;
		while(temp.data!=num2){
			temp=temp.next;
			counter++;
		}
		int x2=temp.data;
		temp=ll.getNode(counter);
		temp.data=num1;
		ll.show();
		
		
	
	}

}

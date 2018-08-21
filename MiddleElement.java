package linkedlist;

import java.util.Scanner;

public class MiddleElement {

	public static void main(String[] args) {

		Linkedlist ll = new Linkedlist();
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		for (int i = 0; i < n; i++) {
			ll.insertAt(i, scn.nextInt());
		}
//		int res = solution(ll);
//		System.out.println(res);5
		solution2(ll);
	}

	// method 1 using getnode method
	public static int solution(Linkedlist ll) {
		int right = ll.size() - 1;
		int left = 0;
		if (ll.size % 2 == 0) {
			int val = (left + right / 2) + 1;
			Node temp = ll.getNode(val);
			return temp.data;
		} else {
			int val = left + right / 2;
			Node temp = ll.getNode(val);
			return temp.data;
		}
	}

	// method 2
	public static void solution2(Linkedlist ll) {
		Node slow = ll.head.next;
		Node fast = ll.head.next.next;
		while (fast.next != null && fast.next.next!=null) {
			
			if (ll.size % 2 == 0) {
				
				slow=slow.next;
				fast=fast.next.next;
				
			}
			 
			
			else {
				slow=slow.next;
				fast=fast.next.next;
			}
		}
		if(ll.size%2==0){
			System.out.println(slow.next.data);
		}else
			System.out.println(slow.data);
	}

}

//Node Class
public class Node{
	int info;
	Node next;
}
class SingleLinkedList{
	Node head = null, tail = null;

	//Adding item in list from tail
	void addToTail(int info){
		if(head==null){
			Node n = new Node();
			n.info=info;
			n.next=null;
			head=null;
			tail=null;
		}else{
			Node n = new Node();
			n.info=info;
			n.next=null;
			tail.next=n;
			tail=n;
		}
	}
	//Adding item in list from head
	void addToHead(int info){
		if(head==null){
			Node n = new Node();
			n.info=info;
			n.next=null;
			head=n;
			tail=n;
		}else{
			Node n = new Node();
			n.info=info;
			n.next=head;
			head=n;
		}
	}
	//Displaying data from the list
	void displayListData(){
		if(head==null){
			system.out.println("List is empty");
			return;
		}else{
			Node temp = head;
			while(temp!=null){
				system.out.println(temp.info);
				temp = temp.next;
			}
		}
	}
	//Search Data from list
	int searchData(int info){
		if(head==null){
			system.out.println("List is empty");
			return;
		}else{
			Node temp = head;
			while(temp!=null){
				if(info==temp.info){
					return temp.info;
				}
			}
			system.out.println("Search Failed");
			return null;
		}
	}
	//Delete Data from the list
	void deleteData(int info){
		if(head==null){
			system.out.println("List is empty");
			return;
		}else{
			Node temp = head, temp2 = head;
			while(temp!=null){
				while(temp2.next!=temp){}
				temp2.next = temp.next;
				system.out.println("Deleted Node::"+info);
				temp=null;
			}
		}
	}
	
	public static void main(String[] args){
		SingleLinkedList l = new SingleLinkedList();
		l.addToHead(10);
		l.addToTail(15);
		l.displayListData();
		l.addToHead(11);
		l.addToTail(16);
		int s = l.searchData(10);
		l.deleteData(11);
		l.displayListData();
	}
}

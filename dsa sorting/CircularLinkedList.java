public class NodeS {

    public int num;
    public NodeS next;

    public NodeS(int n){
        this.num = n;
    }
}


public class SinglyCircularList {

    private static NodeS head = null;
    private static NodeS tail = null;
    private static int size = 0;

    public static int getSize() {
        return size;
    }

    public static void insert(int n)
	{
		NodeS node = new NodeS(n);

		if (head == null) {
			node.next = node;
		} else {
			node.next = head.next;
			head.next = node;
		}
		head = node;
		size++;
	}

    public static int delete()
	{
		if (isEmpty()) {
			System.out.println("List Empty !!");
			return -1;
		}

		NodeS deq = head.next;
		head.next = (--size == 0) ? null : deq.next;
		return deq.num;
	}

    public static boolean isEmpty() {
        return size == 0;
    }

    public void printList() {
        NodeS temp = tail;
        for (int i = 0; i <= size; i++) {
            if (temp != null) {
                System.out.print(temp.num);
                temp = temp.next;
            }
        }
        System.out.println();
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        SinglyCircularList scl = new SinglyCircularList();
        scl.insert(1);
        scl.insert(2);
        scl.insert(3);
        scl.insert(4);
        scl.insert(5);
        scl.insert(6);
        scl.insert(7);
        scl.printList();
        System.out.println("Del->" + scl.delete());
        scl.insert(8);
        scl.printList();
        System.out.println("Del->" + scl.delete());
        System.out.println("Del->" + scl.delete());
        System.out.println("Del->" + scl.delete());
        System.out.println("Del->" + scl.delete());
        System.out.println("Del->" + scl.delete());
        System.out.println("Del->" + scl.delete());
        System.out.println("Del->" + scl.delete());
        System.out.println("Del->" + scl.delete());
        scl.printList();
        scl.insert(9);
        scl.insert(10);
        scl.printList();

    }

}
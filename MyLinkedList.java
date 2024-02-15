package datas_lab3;

public class MyLinkedList<E> {

    private Nodes head, tail;
    private int size = 0;

    public MyLinkedList() {
    }

    public void addFirst(E e) {//works
        Nodes newNode = new Nodes(e);
        newNode.next = head;
        head = newNode;
        size++;
        if (tail == null) {
            tail = head;
        }
    }

    public void delFirst() {//works
        if (head != null) {
            head = head.next;
            tail = null;
            size--;
        }
    }

    public String isEmpty() {//works
        Nodes current = head;
        while (current == null) {
            if (current == tail) {
                return "List is empty";
            }
            current = head.next;

        }
        return "List is Not Empty";
    }

  public Object getLargest() {// works
        Nodes current = head;
        Nodes largest = head;
        while (current.next != null) {
            if ((current.element instanceof Integer && largest.element instanceof Integer)) {
                if ((Integer) current.next.element > (Integer) largest.element) {
                    largest = current.next;
                }
            }
            current = current.next;
        }
        return largest.element; 
    }

    public int countNegative() {//works
        Nodes current = head;
        int count = 0;
        while (current.next != null) {
            if (current.element instanceof Double && (Double) current.element < 0) {
                count++;
            }
            current = current.next;
        }
        return count;
    }

    public Object Search(Object value) {//Works
        Nodes current = head;
        while (current != null) {
            if ((current.element).equals(value)) {

                return "The value " + current.element + " is in the list";
            }
            System.out.println(head.element);
            current = current.next;
        }
        return "The value is not in the list";
    }

     public void insert(int index,Object value){
        Nodes newNode = new Nodes(value);
        Nodes current = head;
        int count =0;
        for (int i = 0; i < index-1 ; i++) {
            current = current.next;
            count++;
        }
        if (index == 0) {
            newNode.next = head;
            head = newNode;
            if (tail == null) {
                tail = newNode;
            }
            size++;
            return;
        }
        newNode.next = current.next;
        current.next = newNode;
        if (newNode.next == null) {
            tail = newNode;
        }
        size++;

    }
    public void sort() {
        Nodes current = head;
        Nodes current2 = head;
        Object temp;
        int count = 0;
        while (current2.next != null) {
            count++;
            current2 = current2.next;
        }
        for (int i = 0; i < count; i++) {
            current = head;
            for (int j = 0; j < count; j++) {
                if ((current.element instanceof Integer && current.next.element instanceof Integer)) {
                    if ((Integer) current.element > (Integer) current.next.element) {
                        temp = current.element;
                        current.element = current.next.element;
                        current.next.element = temp;

                    }

                    current = current.next;
                }

            }
        }
    }

    public String toString() {//works
        StringBuilder result = new StringBuilder(" ");
        
        Nodes current = head;
        for (int i = 0; i < size; i++) {
            result.append(current.element);
            current = current.next;
            if (current != null) {
                result.append(" , ");
            } else {
                result.append(" ");
            }
        }
        return result.toString();
    }

}

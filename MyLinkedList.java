package datas_lab3;

public class MyLinkedList<E> {

    private Nodes head, tail; //Defining the head and tail for the linked list. 
    private int size = 0; //Setting the size of the Linked list to be initally 0.

    public MyLinkedList() {
    }

    public void addFirst(E e) {//This adds an element to the start of the linked list. 
        Nodes newNode = new Nodes(e);  //Making a new node for the new element. 
        newNode.next = head;
        head = newNode;  //Make this the new head.
        size++; //Increasing the size of the linkedlist.
        if (tail == null) {
            tail = head;
        }
    }

    public void delFirst() {//Deletes the first element of the array.
        if (head != null) { //Runs when the head has a value.
            head = head.next; //Move the head to the next element.
            tail = null; 
            size--; //Decrease the size of the linked list. 
        }
    }

    public String isEmpty() {//Checks if the linked list is empty. 
        Nodes current = head; //make the current equal to the head. 
        while (current == null) { //if the whole linked list is null the method will return the linked list is empty.
            if (current == tail) {
                return "List is empty";
            }
            current = head.next; 

        }
        return "List is Not Empty"; //Runs when there is an element that is not null. 
    }

  public Object getLargest() {//Finds the largest integer in the linked list. 
        Nodes current = head; //make current equal to the head. 
        Nodes largest = head; //make largest eqaul to the haed. 
        while (current.next != null) { 
            if ((current.element instanceof Integer && largest.element instanceof Integer)) { //Checks if both the largest and current elements are integers. 
                if ((Integer) current.next.element > (Integer) largest.element) { //Makes the next element the largest element when the next element is greater than the current largest element. 
                    largest = current.next;
                }
            }
            current = current.next; //moves to the next element to check.
        }
        return largest.element; //returns the largest element. 
    }

    public int countNegative() {//Counts how many negative numbers there are. 
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

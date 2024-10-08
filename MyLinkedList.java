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
        Nodes current = head; //make the current equal to the head. 
        int count = 0;
        while (current.next != null) {
            if (current.element instanceof Double && (Double) current.element < 0) { //when the element value is less than 0 then the count will increment. 
                count++;
            }
            current = current.next;
        }
        return count; //returns how many negative elements were counted. 
    }

    public Object Search(Object value) {//Searchs the linked list for an element. 
        Nodes current = head; //Makes the current equal to the head. 
        while (current != null) {
            if ((current.element).equals(value)) { //Runs when the current element is equal to the value that is being searched for. 

                return "The value " + current.element + " is in the list";
            }
            current = current.next; //makes the pointer to the next element to be checked. 
        }
        return "The value is not in the list"; //runs when the value is not any of the nodes. 
    }

     public void insert(int index,Object value){ //This inserts a node into the linked list. 
        Nodes newNode = new Nodes(value); //Makes a new node. 
        Nodes current = head; //Makes the current start at the head. 
        int count =0;
        for (int i = 0; i < index-1 ; i++) { //This for loop is used to find the index. 
            current = current.next; 
            count++;
        }
        if (index == 0) { //When the insert is at the start then the new node will be made at the start of the linked list. 
            newNode.next = head;
            head = newNode;
            if (tail == null) {
                tail = newNode;
            }
            size++;
            return;
        }
        newNode.next = current.next; //Updating position of the new node. 
        current.next = newNode;
        if (newNode.next == null) {
            tail = newNode;
        }
        size++;
        System.out.println(Search(value)+ " this is confirmation that your input is in the list");

    }
    public void sort() { //Sorts the linked list is ascending order. This is based on Bubble Sort. 
        Nodes current = head; //This current is used to go through the linked list. 
        Object temp;
        for (int i = 0; i < size; i++) { //This for loop through the whole linked list. 
            current = head; 
            for (int j = 0; j < size - 1; j++) { //This for loop is used to swap the elements next to each other. 
                if ((current.element instanceof Integer && current.next.element instanceof Integer)) { //Checks if the current and next element are integers. 
                    if ((Integer) current.element > (Integer) current.next.element) { //Swaps the two elements when the current element is greater than the next element. 
                        temp = current.element;
                        current.element = current.next.element;
                        current.next.element = temp;
                    }
                    current = current.next; //Goes to the next element. 
                }
            }
        }
    }

    public String toString() {//This is used to to prinnt out the linked list. 
        StringBuilder result = new StringBuilder(" "); //used to add strings together. 
        
        Nodes current = head;
        for (int i = 0; i < size; i++) { //This for loop is used to go through the linked list. 
            result.append(current.element); 
            current = current.next;
            if (current != null) { //Puts a comma next to the element. 
                result.append(" , ");
            } else {
                result.append(" "); //Puts a space between the elements. 
            }
        }
        return result.toString(); //Prints the whole linked list. 
    }

}

package datas_lab3;

public class Nodes {
   
    Object element;
    Nodes next;
    
    public Nodes(Object o){
        element = o;
        next=null;
    }

    public Object getElement() {
        return element;
    }

    public void setElement(Object element) {
        this.element = element;
    }

    public Nodes getNext() {
        return next;
    }

    public void setNext(Nodes next) {
        this.next = next;
    }
}

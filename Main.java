package datas_lab3;
/*
Group members
Alessio Barranca and Dylan Kokilepersaud
*/
public class DataS_Lab3 {

    public static void main(String[] args) {
        MyLinkedList<Object> list = new MyLinkedList<>();
        list.addFirst(2);
        list.addFirst(4);
        list.delFirst();
        list.addFirst(3);
        list.delFirst();
        list.addFirst(10);
        list.addFirst(11);
        list.addFirst(9);
        list.addFirst(-4);
        list.addFirst(-5);
        list.addFirst(20);
        list.sort();
       
        
        System.out.println(list.Search(-5));
        System.out.println("Ammount of negative numbers is " + list.countNegative());
        System.out.println(list.getLargest());
        System.out.println(list.toString());
        list.insert(2, -9);
        list.sort();
        System.out.println(list.toString());
       
    }
    
}

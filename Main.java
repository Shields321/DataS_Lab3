package datas_lab3;

/*
Group members
Alessio Barranca and Dylan Kokilepersaud
*/
public class DataS_Lab3 {

    public static int num =20;
    public static int count =0;
    public static void main(String[] args) {
        MyLinkedList<Object> list = new MyLinkedList<>();  

        System.out.println(list.isEmpty());
        for(int i =0;i<=30;i++){
            list.addFirst(nextRandom());
        }      
        System.out.println("Insertion the value of 87 ");
        list.insert(5, 87);        
        System.out.println(list.toString());
        System.out.println(list.isEmpty());
        System.out.println("Largest value in the list "+list.getLargest());
        System.out.println("Amount of negative numbers in the list = " +list.countNegative());        
        list.sort();
        System.out.println(list.toString());      
    }    
    public static int nextRandom() {
        
        if(count%2  == 0){
            num = num+3;
        }
        else{            
            num = num+2;
        }
        return num;
    }
    
}

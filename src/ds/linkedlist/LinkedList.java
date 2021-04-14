package ds.linkedlist;

public class LinkedList {

    private Node head = new Node();

    public void addFirst(String text){
        head.text = text;
    }
    public void addLast(String text){
        Node n= head;
        if(n==null){
           this.addFirst(text);
           return;
        }
        while(n.next!=null){
            n = n.next;
        }
        Node newN =  new Node();
        newN.text = text;
        n.next = newN;
    }

    public void printAll(){
        Node n= head;
        do{
            if(n!=null) {
                System.out.println("Ele - " + n.text);
                n = n.next;
            }
        }while(n!=null);
    }

}

import java.util.*;

class LinkedListRemove
{

    public static Node1 removeDuplicates(Node1 head) {
        //Write your code here
        Node1 cur = head;
        int m,ct=0;
        while(cur!=null){
            m = cur.data;
            deleteif(head.next, m);
            cur = cur.next;
        }
        return cur;
    }
    public static void deleteif(Node1 n, int d){
        if(n!=null){
            if(n.data == d){
                if(n.next!=null){
                    n.next=n.next.next;
                    deleteif(n.next, d);
                }
            }else if(n.next!=null){
                deleteif(n.next, d);
            }
        }

    }

    public static Node1 insert(Node1 head, int data)
    {
        Node1 p=new Node1(data);
        if(head==null)
            head=p;
        else if(head.next==null)
            head.next=p;
        else
        {
            Node1 start=head;
            while(start.next!=null)
                start=start.next;
            start.next=p;

        }
        return head;
    }
    public static void display(Node1 head)
    {
        Node1 start=head;
        while(start!=null)
        {
            System.out.print(start.data+" ");
            start=start.next;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Node1 head=null;
        int T=sc.nextInt();
        while(T-->0){
            int ele=sc.nextInt();
            head=insert(head,ele);
        }
        head=removeDuplicates(head);
        display(head);

    }
}
import java.lang.*;
class Linkedlis{
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data =d;
            next=null;
        }
    }
    public void printlist(){
        Node n =head;
        while(n!= null){
            System.out.printf("%d->",n.data);
            n=n.next;
        }System.out.println("null");
    
    }
    public void middle(){
        Node fastpointer=head;
        Node slowpointer=head;
        while(fastpointer !=null && fastpointer.next != null){
            fastpointer = fastpointer.next.next;
            slowpointer =slowpointer.next;
        }
        System.out.printf("Middle element: %d\n",slowpointer.data);
    }

    public static void main(String []args){
        Linkedlis list1 =new Linkedlis();
        list1.head =new Node(1);
        Node second =new Node(3);
        Node third = new Node(4);
        Node four = new Node(5);
        Node five = new Node(12);
        list1.head.next =second;
        second.next=third;
        third.next =four;
        four.next = five;
        list1.printlist();
        list1.middle();
    }
}
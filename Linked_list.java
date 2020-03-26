import java.lang.*;
class Linked_list{
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int d)
        {
            data =d;
            next=null;
        }
    }

    public static void main(String[] args)
    {
        Linked_list list1 =new Linked_list();
        list1.head =new Node(5);
        Node second =new Node(3);
        Node third = new Node(4);
        Node four = new Node(5);
        list1.head.next =second;
        second.next=third;
        third.next =four;
    }
}
import java.util.*;
class Customer
{
  Customer(int id,int num1,int num2,int num3,int num4,int num5,int num6)
  {
    this.id=id;
    this.num1=num1;
    this.num2=num2;
    this.num2=num2;
    this.num3=num3;
    this.num4=num4;
    this.num5=num5;
    this.num6=num6;
  }
  ArrayList<Integer> numbers;
  int id,num1,num2,num3,num4,num5,num6;
  int[] allvals()
  {
    int vals[]=new int[6];
    vals[0]=num1;
    vals[1]=num2;
    vals[2]=num3;
    vals[3]=num4;
    vals[4]=num5;
    vals[5]=num6;
    return vals;
  }

}
public class Lottery
{
  ArrayList<Customer> contacts=new ArrayList();
  void buyTicket(int id,int num1,int num2,int num3,int num4,int num5,int num6)
  {
    Customer c=new Customer(id,num1,num2,num3,num4,num5,num6);
    contacts.add(c);
  }

  void pickLottery()
  {
    Random ran=new Random();
    List<Integer> thelist=new ArrayList();
    //Creating list of random numbers;
    for(int i=0;i<6;i++)
    {
      thelist.add(ran.nextInt(10));
    }
    System.out.println("THe Lucky draw numbers are\n");
    for(int a:thelist)
    {
        System.out.print(a+" ");
    }
    System.out.println();

    for(Customer c:contacts)
    {
      int score=0;
      int[] contactvals=c.allvals();
      for(int i=0;i<6;i++)
      {
        if(thelist.contains(contactvals[i]))
        score++;
      }
      switch(score)
      {
        case 4:
        System.out.println("\nPrize Amount = 10,000\n Won by Id="+c.id+" \n");
        break;
        case 5:
        System.out.println("\nPrize Amount = 10,00,000\n Won by Id="+c.id+" \n");
        break;
        case 6:
        System.out.println("\nPrize Amount = 1,00,000,000\n Won by Id="+c.id+" \n");
        break;
      }

    }
  }
  public static void main(String[] args)
  {
    Lottery ll=new Lottery();
    ll.buyTicket(1,5,8,6,4,7,5);
    ll.buyTicket(2,5,7,6,2,7,3);
    ll.buyTicket(3,5,8,6,4,7,5);
    ll.buyTicket(4,5,8,9,9,7,5);
    ll.buyTicket(5,2,3,6,4,7,5);
    ll.buyTicket(6,5,9,6,8,7,5);
    ll.pickLottery();
  }
}

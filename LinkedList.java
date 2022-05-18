public class LinkedList{
    Node head;
  public void insert(int data)
  {
      Node node = new Node(data);

      if(head == null) {
          head = node;
      } else
      {
          Node n = head;
          while(n.next!=null)
          {
              n=n.next;
          }
          n.next = node;
      }
  }
  public void insertAtStart(int data )
  {
      Node node = new Node(data);

      node.next=head;
      head = node;
  }
  public void insertAtIndex(int ind,int data)
  {
      Node node = new Node(data);


      if(ind ==0 ) {
          insertAtStart(data);
      }
      else {
          Node n = head;
          for (int i =0;i<ind-1;i++)
          {    n= n.next;}
          node.next= n.next;
          n.next=node;
      }
  }
  public void delete(int ind ){
      if(ind==0)
          head = head.next;
      else
      {
          Node n = head;
          for(int i =0;i<ind-1;i++)
          {
              n = n.next;
          }
          Node n1 = n.next;
          n.next=n1.next;
          System.out.println("deleted element: "+n1.data);
          n1= null;
      }
    }
  public void show ()
  {
      if(head == null)
          System.out.println("null");
      else
      {
          Node n = head;
          while(n.next!=null)
          {
              System.out.println(n.data+"");
              n=n.next;
          }
          System.out.println(n.data+"");
      }
  }
}

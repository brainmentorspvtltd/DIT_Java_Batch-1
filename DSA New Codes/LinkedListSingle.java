class Node <T>
{
    T data;
    Node<T> next;
    boolean isvisited;

    Node(T data)
    {
        this.data=data;
        next=null;
    }

    public String toString()
    {
        return "Node"+data+"Pointer"+next;
    }
}

class LinkedListOperations<T>
{
    private Node<T>start;

    void inserAtEnd(Node<T>node)
    {
     if(start==null)
     {
     start=node;
     return;
     }
     Node<T>temp=start;
     while(temp.next!=null)
     {
         temp=temp.next;
     }
     temp.next=node;

    }

void print()
{
   System.out.println("After Insertion/Deletion List is....");
    Node<T>temp=start;
    while(temp!=null)
    {
        System.out.println(temp.data);
        temp=temp.next;

    }
}
void insertAtBeg(Node<T>node)
{
    if(start==null)
    {
    start=node;
    return;
    }
    node.next=start;
    start=node;
}

void insertAtMid(Node<T>node,int position)
{
    if(start==null)
    {
        start=node;
        return;
    }
    if(position==0)
    {
        node.next=start;
        start=node;
        return;
    }

    if(position>0)
    {
        int i=1;
        Node<T>temp=start;
        while(i<position)
        {
            temp=temp.next;
            i++;
        }
        node.next=temp.next;
        temp.next=node;

    }

}

 void deleteInMid(int position)
{
Node<T>temp=null;

if(start==null)
{
System.out.println("Linked is empty");
return;
}

if(position==0)
{
    temp=start.next;
    start=temp;
    return;
}

temp=start;
int i=1;

while(i<position)
{
temp=temp.next;
i++;
}
temp.next=temp.next.next;
}


}




public class LinkedListSingle {

    public static void main(String[] args) {

        LinkedListOperations<Integer>opr=new LinkedListOperations<>();
        opr.inserAtEnd(new Node<Integer>(100));
       // opr.print();
        opr.inserAtEnd(new Node<Integer>(200));
        opr.inserAtEnd(new Node<Integer>(300));
        opr.print();
        opr.insertAtBeg(new Node<Integer>(1000));
        opr.print();
        opr.insertAtBeg(new Node<Integer>(2000));
        opr.print();
        opr.insertAtMid(new Node<Integer>(500),1);
        opr.print();
         System.out.println("After Deletion List is ");
         opr.deleteInMid(3);
         opr.print();

    }
}

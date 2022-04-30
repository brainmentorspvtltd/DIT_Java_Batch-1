//Writing Linked list

class Node1 
{
    int data;
    Node1 next;

    Node1(int data)
    {
        this.data=data;
        this.next=null;
    }
}
// Node with Template
class Node2<T>
{
T data;
Node2<T>next;
Node2(T data)
{
    this.data=data;
    this.next=null;

}
}









public class SingleLL {
    public static void main(String[] args) {
        
      //create a node object

//Node<Integer>node=new Node<>(100);
//System.out.println(node.data);
//System.out.println(node.next);

//connecting the Nodes

//Node<Integer>node2=new Node<>(100);
//node.next=node2;

//Printing the Linked list

//Node<Integer>start=firstNode;
/*while(start!=null)
{
System.out.println(start.data);
start=start.next;
}*/

//Adding in Linked list at end

/*
Node<Integer>start=null;

do
{
    int data=scanner.nextInt();
    Node<Integer>node=new Node<>(data);
    if(start==null)
    start=node;
    else
    {
        Node<Integer>temp=start;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
      //  node.next=temp.next; optional
        temp.next=node;
    }
}

//Insertion in LinkedList Position wise

Node<Integer>node=new Node<>(1000);
int position=2;
if(position==0)
{
    node.next=start;
    start=node;
}

int l=1;

Node<Integer>temp=start;
while(l<=position)//move till u reach the position
{
    temp=temp.next;
    l++;
}
//Once u reach the position

node.next=temp.next;
temp.next=node;

//delete a Node in Linked list

int position=2;
if(start.next==null && position==0)
{
start=null;
return;
}

Node<Integer>temp=start;

int l=0;

Node<Integer>temp=start;
while(l<position-1)
{
    temp=temp.next;
    l++;
}
temp.next=temp.next.next;


*/





      





    }
    
}

import java.util.Scanner;
public class ArrayTest {
int size;
int arr[];

ArrayTest(int capacity)
{
    this.arr=new int[capacity];
    int size=0;
}
    void insert(int index,int value)
{

    if(index>size)
    {
        System.out.println("Position can't be greater than size");

    }

    if(size==arr.length)
    {
        System.out.println("Array full can't add");
    }

    for(int i=size-1;i>=index;i--)
    {
        arr[i+1]=arr[i];
    }

    arr[index]=value;
    size++;
    System.out.println("Element added...");
    print();

}

void print()
{
    for(int element:arr)
    {
        System.out.println(element);
    }
}

void remove(int index)
{
if(size==0)
System.out.println("Array is empty U can't remove further");

for(int i=index;i<size-1;i++)
{
    arr[i]=arr[i+1];

}

arr[size-1]=0;
size--;
System.out.println("Element removed...");
print();
}

int search(int value) //Linear search
{
   for(int i=0;i<arr.length;i++)
   {
    if(arr[i]==value)
    {
    System.out.println("Element found "+value);
    return i;
   }
}

System.out.println("Element Not Found "+value);
return -1;
}


void update(int valuesearch,int valueupdate)
{
    int index=search(valuesearch);
    if(index==-1)
    return;
    else
    {
        arr[index]=valueupdate;
        System.out.println("Array updated ");
        print();
    }
}

    public static void main(String[] args) {

        ArrayTest opr=new ArrayTest(5);
        Scanner scanner=new Scanner(System.in);

        int choice,index,value;

        while(true)
        {
            System.out.println("Array Operations");
            System.out.println("Press 1. Array insert at specific position");
            System.out.println("Press 2. Delete from specific position");
           System.out.println("Press 3. Search in an Array");
            System.out.println("Press 4. Print an Array");
            System.out.println("Pres  5. Update an Array");
            System.out.println("Press 6. Exit");
            System.out.println("Enter your choice");
            choice=scanner.nextInt();
            switch(choice)
            {
                case 1:
                System.out.println("Enter the index");
                index=scanner.nextInt();
                System.out.println("Enter the value");
                value=scanner.nextInt();
                opr.insert(index,value);
                break;
                case 2:
                System.out.println("Enter the index where u want to remove the value");
                index=scanner.nextInt();
                opr.remove(index);
                 break;
                 case 3:
                 System.out.println("Enter the value to be search");
                 value=scanner.nextInt();
                 opr.search(value);
                case 4:
                opr.print();
                break;
                case 5:
                System.out.println("Enter the value to be search");
                value=scanner.nextInt();
                System.out.println("Enter the value to be update");
                int value2=scanner.nextInt();
                opr.update(value,value2);
                break;


                default:
                System.out.println("Wrong choice(Plz enter the in between(1-6)");


            }
        }
    }
}

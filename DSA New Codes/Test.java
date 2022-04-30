class MyTest
{
{
    System.out.println("init parent");
}

MyTest()
{
System.out.println("Parent constructor");
}

static
{
    System.out.println("Parent static");
}

}

class ChildTest extends MyTest
{
    {
        System.out.println("init child");
    }

    ChildTest()
    {
        System.out.println("child constructor");
    }

    static
    {
        System.out.println("child static");
    }
}


public class Test {

    public static void main(String[] args) {

        ChildTest c1=new ChildTest();

    }

}

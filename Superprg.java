class A
{
    public A()
    {
        System.out.println("A");
    }
}
class B extends A
{
    public B()
    {
        System.out.println("B");
    }
}
class Superprg
{
    public static void main(String[] args)
    {
        B obj = new B();
    }
}

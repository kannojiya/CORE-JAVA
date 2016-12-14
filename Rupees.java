package rupees;
class Base
{
    int a = 100;
}

class Sup2 extends Base
{
    int a = 200;
    void Show()
    {
        System.out.println(super.a);
        System.out.println(a);
    }
    public static void main(String[] args)
    {
        new Sup2().Show();
    }
}
    
    

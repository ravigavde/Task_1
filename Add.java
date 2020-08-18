public class Add
{
    int add(int a, int b)
    {
        return(a+b);
    }
    int mul(int a, int b)
    {
        return(a*b);
    }
    public static void main(String arg[])
    {
        int a =0, b=0;
        Add a = new Add();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number ");
        a = sc.nextInt();
        System.out.println("Enter second number ");
        b = sc.nextInt();
        System.out.println("Addition is "+a.add(a,b));
        System.out.println("Multiplication is "+a.mul(a,b));
    }
}

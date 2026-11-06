class MultipleCatch
{
    public static void main(String args[])
    {
        try
        {
            int a[] = {10, 20, 30};

            System.out.println(a[5]);

            int result = 10 / 0;
            System.out.println(result);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array index is invalid");
        }
        catch(ArithmeticException e)
        {
            System.out.println("Cannot divide by zero");
        }
        catch(Exception e)
        {
            System.out.println("Some other exception occurred");
        }
    }
}

class Test
{
    public static void main(String[] args)
    {
        testSum();
    }

    private static void testSum()
    {
        int a = 6;
        int b = 6;
<<<<<<< HEAD
        int expected = 1;
        BasicMath bm = new BasicMath();
        int result = bm.div(a, b);
        if (result == expected)
        {
            System.out.println("Div: OK");
        }
        else
        {
            System.out.println("Div: Failed, expected = " + expected + ", result = " + result);
=======
        int expected = -1;
        BasicMath bm = new BasicMath();
        int result = bm.mult(a, b);
        if (result == expected)
        {
            System.out.println("Mult: OK");
        }
        else
        {
            System.out.println("Mult: Failed, expected = " + expected + ", result = " + result);
        int expected = -1;
        BasicMath bm = new BasicMath();
        int result = bm.sub(a, b);
        if (result == expected)
        {
            System.out.println("Sub: OK");
        }
        else
        {
            System.out.println("Sub: Failed, expected = " + expected + ", result = " + result);
>>>>>>> master
        }
    }
}

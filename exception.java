public class exception {
    public static void main(String[] args) {
        int age=18;
        try
        {
            if(age<18)
                throw new ArithmeticException();
            System.out.println(" voting");
        }
        catch(ArithmeticException e)
        {
            System.out.println(" vote failed");
        }
    }
    
}

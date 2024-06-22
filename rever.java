import java.util.*;
public class rever {
        public static void main(String[] args)
        {
            Scanner scanner = new Scanner(System.in);
            int a=scanner.nextInt();
            int temp=a;
            int rev=1;
            int digit=0;
            while(a !=0)
            {
                digit=a%10;
                rev*=10+digit;
                a/=10;
            }
            if(rev==temp)
                System.out.println("palindrome detected");
            else
                System.out.println("notpalindrome detected");


        }


    
}

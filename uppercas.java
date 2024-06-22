import java.util.*;
import java.io.*;
public class uppercas
{
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String str=scanner.nextLine();
        
        String upper="";
        String lower="";
        for (int i=0; i<str.length(); i++)
        {
            char ch= str.charAt(i);
            if(ch>='A' && ch<='Z')
                upper+= ch;
        else
        {
            lower+=ch;
        }
    }
        System.out.println(lower+upper);
}
}
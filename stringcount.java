import java.util.*;
public class stringcount {
    public static void main(String[]args)
    {
        int t1=0;
        Scanner scanner = new Scanner(System.in);
        String str=scanner.nextLine();
        char ch[]=str.toCharArray();
       
        for(int i=0; i<str.length(); i+=t1) 
        {
            t1=0;
            for(int j=i; j<str.length(); j++)
            {
                if(ch[i]==ch[j])
                 t1++;
                else
                 break;
            
        }
    System.out.printf("%c%d", ch[i], t1);


            }
        }

    }
    

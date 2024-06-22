import java.util.*;
public class frequencyofcharacter {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s1=sc.nextLine();
        char[]ch=s1.toCharArray();
        char search=sc.next().charAt(0);
        int count=0;
        for (int i=0; i<s1.length(); i++) {
            if(search==ch[i])
            count+=1;
        }
        System.out.println(count);
    }
    
}

import java.util.*;
import java.lang.Math;
public class sample {
    public static void main(String[] args) 
    {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int max=Math.max(c,Math.max(a,b));  
        System.out.println("the maximum is:");  
        System.out.print(max);

        
    }
    
}

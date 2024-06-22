import java.util.*;
public class increasevalue {
    public static void main(String[]args){
    Scanner sc= new Scanner(System.in);
    int value=sc.nextInt();
    int pv=1;
    int num=1;
    while((num&pv)!=0)
    {
        num=num^pv;
        pv=pv<<1;
    }
    num=num^pv;
    System.out.print(value);
    
}
}

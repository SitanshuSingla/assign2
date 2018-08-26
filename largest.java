import java.util.*;
public class largest
{
public static void main(String ags[])

{
Scanner sc=new Scanner(System.in);
Double a=sc.nextDouble();
Double b=sc.nextDouble();
Double c=sc.nextDouble();

if(a>b && a>c)
{System.out.println("A is largest");
}
else if(b>c && b>a)
{
System.out.println("B is largest");}
else
{System.out.println("C is largest");}


}
}
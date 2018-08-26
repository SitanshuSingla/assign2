import java.util.*;
public class leap
{
public static void main(String ags[])
{

Scanner sc= new Scanner(System.in);
int a=sc.nextInt();
if(a%400==0)
{System.out.println(a + "is leap year");
}
else if(a%4==0 && a%100!=0)
{
System.out.println(a + "is leap year");

}
else
{System.out.println(a + "is not leap year");
}

}


}



import java .util.*;
public class prime{
public static void main(String args[])
{

Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int flag=0,i;
for(i=2;i<=a/2;i++)

{if(a%i==0)
{flag=1;
break;
}


}

if(flag==0)
{System.out.println("It is prime");}
else 
{System.out.println("It is not prime");}
}

}
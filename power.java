import java.util.Scanner;
public class power{
public static void main(string args[]){
Scanner sc=new Scanner(System.in);
int num=0;
int power=0;
int pow=0;
System.out.print("enter number");
num=sc.nextInt();
System.out.println("enter power");
pow=sc.nextInt();
System.out.println(power(num,pow));
}
public static int power(inta,intb)
{
int power=1;
for(int c=0;c<b;c++)
power*=a;
return power;
}
}

public class Natural
{
public static void main(string args[])
int x,i=1;
int sum=0;
System.out.println("enter number of items:");
Scanner s = new Scanner(System.in);
x=s.nextInt();
while(i<=x)
{
sum=sum+i;
i++;
}
System.out.println("sum of "+x" number is:"=sum);
}
}

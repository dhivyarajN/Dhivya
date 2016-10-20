import java.util.Scanner;
public class Prime{
public ststic void main(String args[]){
int temp;
boolean isPrime=true;
Scanner san = new Scanner(System.in);
System.out.println("enter a number for check:");
int num=scan.nextInt();
for(int i=2;i<num/2;i++)
{
temp=num%i;
if(temp==0)
{
isPrime=false;
break;
}
}
if(isPrime)
System.out.println("prime number");
else
System.out.println("not prime number");
}
}

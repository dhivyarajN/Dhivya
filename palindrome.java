public class palindrome{
public static void main(string args[]){
int r,n,sum=0,temp;
temp=n;
while(n>0)
{
r=n%10;
sum=(sum*10)+r;
n=n/10;
}
if(temp==sum)
System.out.println("tne number is palindrome");
else
System.out.println("not palindrome");
}}

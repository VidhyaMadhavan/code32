import java.util.*;
class fibonacci
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
int first=0,second=1,third,r;
r=sc.nextInt();
for(int i=0;i<r;i++)
{
third=first+second;
System.out.println(third);
first=second;
second=third;
}
}
}

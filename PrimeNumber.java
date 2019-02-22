import java.util.Scanner;
class PrimeNumber{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.print("enter a number:");
int n=s.nextInt();
int flag=0;

for(int i=2;i<n;i++){
if(n%i==0){
flag=1;
break;
}

else
continue;
}

if(flag==1)
System.out.println("not a prime");
else
System.out.println("prime");


}
}
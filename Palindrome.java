import java.util.Scanner;
class Palindrome{
public static void main(String args[]){
Scanner s=new Scanner(System.in);

System.out.println("enter a number:");
int n=s.nextInt();
int temp=n,sum=0;

while(n!=0){
int r=n%10;
sum=(sum*10)+r;
n=n/10;
}

System.out.println(" the reversed num is "+sum);

if(temp==sum){
System.out.println("the given number is a palindrome");
}
else{
System.out.println("the given number is not a palindrome");
}
}
}
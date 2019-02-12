import java.util.Scanner;
class SumOfDigits{
public static void main(String[] args){
Scanner Scan=new Scanner(System.in);
System.out.print("enter a value for N:");
int N=Scan.nextInt();
int sum=0;

while(N!=0){
int r=N%10;
sum=sum+r;
N=N/10;

}
System.out.print("result: "+sum);
}
}

import java.util.Scanner;
class SumOfNaturalNum{
public static void main(String[] args){
Scanner Scan=new Scanner(System.in);
System.out.print("enter a number:");
int N = Scan.nextInt();
int sum=0,i;
for (i=1;i<=N;i++){
sum+=i;
}
System.out.print("sum is "+sum);
}
}

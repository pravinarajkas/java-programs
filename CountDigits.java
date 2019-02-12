import java.util.Scanner;
class CountDigits{
public static void main(String[] args){
Scanner Scan=new Scanner(System.in);
System.out.print("enter a value for N:");
int N=Scan.nextInt();
int count=0;

while(N!=0){
N=N/10;
count++;
}
System.out.print("result: "+count);
}
}

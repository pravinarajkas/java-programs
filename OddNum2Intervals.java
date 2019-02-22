import java.util.Scanner;
class OddNum2Intervals{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.print("starting number:");
int n=s.nextInt();

System.out.print("ending number:");
int k=s.nextInt();

System.out.print("the odd numbers: ");


for( int i=n+1;i<k;i++){

if (i%2!=0){
System.out.print(i);
System.out.print(' ');

}
}
}
}




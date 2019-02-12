import java.util.Scanner;
class CheckSign{
public static void main (String[] aaa){
Scanner scan=new Scanner(System.in);
int a = scan.nextInt();
if (a<0){
System.out.print("negative");

}
else if(a==0){
System.out.print("the number is zero");
}
else{
System.out.print("the number is positive");
}
}
}

import java.util.Scanner;
class AlphabetOrNot{
public static void main(String[] args){
Scanner Scan=new Scanner(System.in);
System.out.print(" enter a character: ");
String ch=Scan.next();
char x=ch.charAt(0);
if((( x>='a') && (x<='z' )) || (( x>='A') && (x<='Z' ))){
System.out.print(x+ " is a alphabet ");
}
else{
System.out.print(x+" is not a alphabet ");
}
}
}

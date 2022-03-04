/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
Scanner sc = new Scanner (System.in);
	System.out.println("Enter a sentence"); 
String s= sc.nextLine();
s=s+" ";
int l= s.length();
int wc=0 ;
int lc =0;
for ( int i=0;i<l;i++)
{
char ch =s.charAt(i);
if(ch ==' ' )
wc++; 
else
lc++; 
}System.out.println("No of words="+ wc);
System.out.println("No of letters ="+ lc);



	}
}

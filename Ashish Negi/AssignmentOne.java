import java.io.*;
import java.util.*;
class AssignmentOne
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter value of a,b,c");
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();

Solution obj=new Solution();
String s1=obj.solution(a,b,c);
System.out.println(s1);

}
}





class Solution
{
  String solution(int a, int b, int c)
  {
        String dString="";
        int A=0,B=0,C=0;
        
        
        int sum=a+b+c;
        
        for(int i=0;i<sum;i++){
            
            if(a>=b && a>=c && a>1 && A<2){
                dString+="aa";
                a-=2;
                A=2;
                B=0;
                C=0;
            }
            else if(b>=c && b>=a && b>1 && B<2){
                dString+="bb";
                b-=2;
                B=2;
                A=0;
                C=0;
            }
            else if(c>=b && c>=a && c>1 && C<2){
                dString+="cc";
                c-=2;
                C=2;
                B=0;
                A=0;
            }    
            
            else if(a>0 && A<2){
                dString+="a";
                a--;
                A++;
                B=0;
                C=0;
                
            }
            
            else if(b>0 && B<2){
                dString+="b";
                b--;
                B++;
                A=0;
                C=0;
            }
            
            else if(c>0 && C<2){
                dString+="c";
                c--;
                C++;
                A=0;
                B=0;
            }
            
        }
        
        
        return dString;
		
	}
}
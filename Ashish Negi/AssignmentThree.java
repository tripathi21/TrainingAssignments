import java.io.*;
import java.util.*;
class AssignmentThree
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
Solution obj=new Solution();
int s1=obj.solution(s);
System.out.println(s1);
}}




    class Solution {
    public int solution(String s) {
         int steps = 0;
		 char[] st = s. toCharArray();       
		 int i = s.length() - 1;
		        int count = 0;
		        while (i >= 0) {
		            if (st[i] == '0') 
		            {
		                if (count == 0) 
		                {
		                    
		                    --i;
		                    ++steps;
		                } else {
		                    st[i] = '1';
		                    count = 0;
		                }
		            } else {
		                if (count == 0) {
		                    if (i == 0) return steps;
		                    
		                    
		                    count = 1;
		                   
		                    ++steps;
		                } 
		                
		                
		                --i;
		                ++steps;
		            }
		        }
		        return steps;

    }
}
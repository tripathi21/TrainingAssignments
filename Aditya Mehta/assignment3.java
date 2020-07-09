package Assignment;

public class assignment3
{
	public static void main(String args[])
	{
	int ans=Solution3.numSteps("1101");
	System.out.println(ans);
	}
}

class Solution3
{
   	public static int numSteps(String s) 
   	{
    	    int op = 0;
    	    int carry = 0;
    	    for (int i = s.length() - 1; i >= 0; i--) {
    	        if (i == 0 && carry == 0) break;
    	        int bit = s.charAt(i) - '0';
    	        bit = carry == 1 ? 1 ^ bit : bit;
    	        if (bit == 1) {
    	            op += 2;
    	            carry = 1;
    	        } else {
    	            op++;
    	        }
    	    }
    	    return op;
   	}
}

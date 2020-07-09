package Assignment;

public class assignment3
{
	public static void main(String args[])
	{
	int ans=Solution3.numSteps("1011");
	System.out.println(ans);
	}
}

class Solution3
{
	    public static int numSteps(String s) {
	        int result = 0;
	        int carry = 0;
	        for(int i = s.length() - 1; i > 0; i--){
	            if(s.charAt(i) - '0' + carry == 1){
	                result += 2;
	                carry = 1;
	            }else{
	                result += 1;
	                carry = s.charAt(i) - '0';
	            }
	        }
	        return result + carry;
	            
	    }
	}

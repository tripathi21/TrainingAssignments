package Assignment;

public class assignment1
{
	public static void main (String args[])
	{
		String abc=Solution1.longestDiverseString(1,1,7);
		System.out.println(abc);
	}
}
class Solution1
{
    public static String longestDiverseString(int a, int b, int c) 
    {
        int total=a+b+c;
        int ca=0,cb=0,cc=0;
        String s="";

        for(int i=0;i<total;i++)    
        {
            if((a>=b && a>=c && ca!=2)||(a>0 && (cb==2||cc==2)))
            {
                s=s+"a";
                ca++;
                cb=0;
                cc=0;
                a--;
            }
            else if((b>=a && b>=c && cb!=2)||(b>0 && (ca==2||cc==2)))
            {
                s=s+"b";
                cb++;
                ca=0;
                cc=0;
                b--;
            }
            else if((c>=b && c>=a && cc!=2)||(c>0 && (cb==2||ca==2)))
            {
                s=s+"c";
                cc++;
                ca=0;
                cb=0;        
                c--;        
            }
        }

            return s;
    }
}

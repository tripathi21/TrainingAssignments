package Assignment;

public class StepsBinaryToOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryToOne a = new BinaryToOne();
		int k = a.calculate_("1101");
		System.out.println(k);
	}

}
class BinaryToOne { 
    public int calculate_(String s) 
    { 
    	int count = 0;
        int carry = 0;
        for (int i = s.length() - 1; i > 0; i--) {
            if (s.charAt(i) - '0' + carry == 1) {
                carry = 1;
                count += 2;
            } else {
                count += 1;
            }
        }
        return count + carry;
    }
}
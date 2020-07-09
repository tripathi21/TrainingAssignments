package model;

import java.util.ArrayList;
import java.util.Collections;

public class Bivalued {
	public static void main(String args[]) {
		int arr[] = {5,4,4,5,0,12};
		Largest obj1 = new Largest();
		int response = obj1.bToOne(arr);
		System.out.println("response will be...."+response);


	}

}
class Largest{
	public int bToOne(int[] A) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		int initial =0,i=0;
		int[] L = new int[2];
		L[0]=-1;L[1]=-1;
		for(;i<A.length;i++) {
			if(L[0]==-1) {
				L[0] = A[i];
			}else if(L[1]==-1) {
				L[1] = A[i];
			}else {
				if(L[0]!=A[i] && L[1]!=A[i]) {
					l.add(i-initial);
					initial = i-1;
					int k = A[i-1];
					if(L[0]!=k) L[0]=A[i];
					else L[1]=A[i];
				}
			}
		}
		l.add(i-initial);
		return Collections.max(l);
	}
}
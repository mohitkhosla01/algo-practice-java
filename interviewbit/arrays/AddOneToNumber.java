package arrays;
import java.util.ArrayList;

public class AddOneToNumber {
	public static void main(String[] args) {

		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(0);
		A.add(3);
		A.add(0);
		A.add(6);

		ArrayList<Integer> B = new AddOneToNumber().plusOne(A);
		for(int i=0; i<B.size(); ++i) {
			System.out.print(B.get(i)+" ");
		}
	}

	public ArrayList<Integer> plusOne(ArrayList<Integer> A) {
		
		boolean flag = true;
		
		for(int i=A.size()-1; i>=0; --i) {
			if(A.get(i)>=0 && A.get(i)<9) {
				A.set(i, A.get(i)+1);
				flag = false;
				break;
			}
			else {
				A.set(i, 0);
			}
		}
		
		if(flag) {
			ArrayList<Integer> A1 = new ArrayList<Integer>();
			A1.add(1);
			for(int i=0; i<A.size(); ++i) {
				A1.add(0);
			}
			return A1;
		}
		else {
			if(A.get(0) == 0) {
				boolean flag2 = false;
				
				ArrayList<Integer> A2 = new ArrayList<Integer>();
				for(int i=0; i<A.size(); ++i) {
					if(A.get(i) != 0) {
						if(flag2 == false) {
							flag2 = true;
						}
						A2.add(A.get(i));
					}
					else if(A.get(i) == 0 && flag2) {
						A2.add(A.get(i));
					}
				}
				
				return A2;
			}
			else {
				return A;
			}
		}
	}
}
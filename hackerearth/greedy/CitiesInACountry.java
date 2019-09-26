package greedy;

import java.util.Scanner;
class CitiesInACountry {

	public static void main(String[] args) {
		
		// ** Revisit - Test cases haven't passed! **

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();

		for(int v=0; v<T; ++v) {

			int N = sc.nextInt();
			sc.nextLine();

			int minX = Integer.MAX_VALUE;
			int maxX = Integer.MIN_VALUE;
			int minY = Integer.MAX_VALUE;
			int maxY = Integer.MIN_VALUE;

			for(int w=0; w<N; ++w) {
				int X = sc.nextInt();
				if(X < minX) {
					minX = X;
				}
				if(X > maxX) {
					maxX = X;
				}

				int Y = sc.nextInt();
				if(Y < minY) {
					minY = Y;
				}
				if(Y > maxY) {
					maxY = Y;
				}
			}

			int rangeX = maxX - minX;
			int rangeY = maxY - minY;
			int range = rangeX > rangeY ? rangeX : rangeY;
			System.out.println(range * range);
		}

		sc.close();
	}
}
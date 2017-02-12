package isoscelestriangle;

public class IsoscelesTriangle {

	public static void main(String[] args) {
		int h=7,w=13;
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w/2-i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k < (i+1)*2; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

import java.util.Scanner;

public class RobotWalkApp {

	public static void main(String[] args) {
		final int W = 10;
		final int H = 10;
		int rr = 2;
		int rc = 2;
		int gr = 7;
		int gc = 7;
		boolean g = true;
		String dir;
		Scanner in = new Scanner(System.in);
		
		while (true) {
			if (rr == gr && rc == gc) {
				g = false;
			}
			clearScreen ();
			renderMap(W, H, rr, rc, gr, gc, g);
			System.out.println ("directions: a,w,s,d: ");
			System.out.print ("move >>>");
			dir = in.next();						
			
			if (dir.equals("a")) {
				if (rc == 0) {
					rc = W - 1;
				}
				else {
					rc--;
				}
				
			}
			else if (dir.equals("d")) {
				if (rc == W - 1) {
					rc = 0;
				}
				else {
					rc++;
				}
				
			}
			else if (dir.equals("w")) {
				if (rr == 0) {
					rr = H - 1;
				}
				else {
					rr--;
				}
				
			}
			else if (dir.equals("s")){
				if (rr == H - 1) {
					rr = 0;
				}
				else {
					rr++;
				}
				
			}			
		}		
	}	
	
	static void renderMap(final int W, final int H, int rr, int rc, int gr, int gc, boolean g) {
		for (int row = 0; row < W; row++) {
			for (int col = 0; col < H; col++) {
				if (row == rr && col == rc) {
					System.out.print("R ");
				}
				else if (row == gr && col == gc && g == true){
					System.out.print("X ");
				}
				else {
					System.out.print(". ");
				}
			}
			System.out.println ();
		}
	}
	
	static void clearScreen () {
		for (int i = 0; i< 26; i++) {
			System.out.println();
		}
	}
}

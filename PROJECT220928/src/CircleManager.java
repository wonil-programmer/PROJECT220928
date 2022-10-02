import java.util.Scanner;

class CircleEx {
	private double x, y;
	private int radius;
	public CircleEx(double x, double y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	public void show() {
		System.out.println("("+ x + "," + y + ")" + radius);
	}
	public int getRadius() {
		return radius;
	}
}
public class CircleManager {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		CircleEx c[] = new CircleEx[3];
		for (int i = 0; i < c.length; i++) {
			System.out.print("x, y, radius >>");
			double x = scanner.nextDouble();
			double y = scanner.nextDouble();
			int radius = scanner.nextInt();
			c[i] = new CircleEx(x, y, radius);
		}
		
		int temp = 0;
		for (int i = 1; i < c.length; i++) {
			if (c[temp].getRadius() < c[i].getRadius())
				temp = i;
		}
		
		System.out.print("가장 큰 원은 ");
		c[temp].show();
		scanner.close();

	}

}

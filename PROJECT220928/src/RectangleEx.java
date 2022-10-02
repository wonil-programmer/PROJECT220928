
public class RectangleEx {
	private int x, y, width, height;
	RectangleEx(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	public void show() {
		System.out.printf("(%d,%d)에서 크기가 %dx%d인 사각형", x, y, width, height);
		System.out.println();
	}
	
	public int square() {
		return width*height;
	}
	
	public boolean contains(RectangleEx r) {
		if ((x < r.x && y < r.y) && (x + width > r.x + r.width && y + height > r.y + r.height))
			return true;
		return false;
	}
	
	public static void main(String[] args) {
		RectangleEx r = new RectangleEx(2, 2, 8, 7);
		RectangleEx s = new RectangleEx(5, 5, 6, 6);
		RectangleEx t = new RectangleEx(1, 1, 10, 10);
	
		r.show();
		System.out.println("s의 면적은 " + s.square());
		if(t.contains(r)) System.out.println("t는 r을 포함합니다.");
		if(t.contains(s)) System.out.println("t는 s를 포함합니다.");
	}
}



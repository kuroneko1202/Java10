// hw10_6,	
class CTriangle {
	protected int base;
	protected int height;

	public CTriangle(int b, int h) {
		base = b;
		height = h;
	}

	protected void show() {
		System.out.println("base=" + base + ", height=" + height);
	}
}

class CData extends CTriangle {
	public CData(int b, int h) {
		super(b, h);
	}

	public void area() {
		show();
		System.out.println("area=" + base * height / 2.0);
	}
}
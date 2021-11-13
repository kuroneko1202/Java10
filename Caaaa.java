// hw10_3,
class Caaaa {
	public int num1;
	public int num2;

	public Caaaa() {
		num1 = 1;
		num2 = 1;
	}

	public Caaaa(int a, int b) {
		num1 = a;
		num2 = b;
	}
}

class Cbbbb extends Caaaa {
	public Cbbbb() {
	}

	public Cbbbb(int a, int b) {
		super(a, b);
	}

	public void show() {
		System.out.println("num1=" + num1 + ", num2=" + num2);
	}
}


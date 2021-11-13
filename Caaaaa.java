// hw10_5a,
public class Caaaaa {
	private int num;
	
	public Caaaaa() {
		this(2);
}
	public Caaaaa(int n) {
		num=n;
	}
	public int get() {
		return num;
		}
	}
class Cbbbbb extends Caaaaa{
	public void show() {
		System.out.println("num="+get());
	}
}

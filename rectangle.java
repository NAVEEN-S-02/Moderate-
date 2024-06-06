package Udemy;

class rectangle1 extends arrRev {
	 int length;
	 int breath;
	
	public rectangle1() {
		length = breath = 1;
	}
	public rectangle1(int x,int y) {
		length = x;
		breath = y;
	}
	
	public int area() {
		int area = length * breath;
		System.out.println("area");
		
		return area;
	}
}

class cuboid extends rectangle1{
	int height;
	
	public cuboid() {
		height = 1;
	}
	public cuboid (int x) {
		super(x, x);
		height = x;
	}
	public int volume () {
		
		int volume = length*breath*height;
		System.out.println("volume");
		return volume;
	}
}

public class rectangle {
	public static void main(String[] args) {
		cuboid rc = new cuboid(5);
		System.out.println(rc.volume());
		int[] arr ={1,2,3,4,5};
		rc.rev(arr);
		for (int x:rc.rev(arr)) {
			System.out.print(x);
		}
	}
}

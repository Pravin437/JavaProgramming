package classProject;

public class Area {

	int length;
	int breadth;
	 
	Area(int len, int bre){
	length=len;
	breadth=bre;
	}
	
	public int getArea() {
		return length*breadth;
	}
	
	public static void main(String[] args) {
		Area obj1 =new Area(4,6);
		System.out.println("Area of rectangle is" + obj1.getArea());
		
	}
}


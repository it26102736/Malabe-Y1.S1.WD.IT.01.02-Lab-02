public class IT26102736Lab2Q1 {
	public static void main(String[] args) {
		double length,width;
		double perimeter =100; //perimeter is given in integer
		
		
		//caluclating length using perimeter equation: perimeter = 2* (length + width)
		//given that width = 3/4 of length ; perimeter = 2*(length + 3/4*length)
		//perimeter =2* (7*length/4)
		length = perimeter*2/7;
		width = 3*length/4;
		//print outputs
		System.out.println("length of the fence is: " +length);
		System.out.println("width of the fence is: " +width);
	}
}

public class IT26102736Lab2Q2 {
	public static void main(String[] args){
		double radius,perimeter,circumference,length;
		
		//length of a side of a square is given; length = 10
		length=10;
		//Perimeter of the square; perimeter = 4*length
		perimeter = length*4;
		
		//Since same rope is used to create a circle; Perimeter of the square is same as circumference of the circle
		circumference = perimeter;
		
		//finding radius: circumference of a circle = 2*radius*3.14
		radius = circumference/(2*3.14);
		System.out.print("Radius of the circular fence: " +radius);
	}
}

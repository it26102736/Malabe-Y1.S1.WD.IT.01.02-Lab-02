public class IT26102736Lab2Q3 {
	public static void main(String[] args){
		double side_A,side_B,hypotenus;
		
		//Lengths of the known sides
		side_A=3;
		side_B=4;
		
		//Hypotenus equation of a right angle triangle:
		//Hypotenus = square root(SideA^2 + SideB^2)
		hypotenus=Math.sqrt((side_A*side_A)+(side_B*side_B));
		System.out.print("length of the hypotenus: " +hypotenus); 
	}
}
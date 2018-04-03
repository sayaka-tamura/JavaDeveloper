
public class Triangle {
	
	public double calcHypotenuse(double sideA, double sideB) {
		double sideC = Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2));
		return sideC;
	}
}

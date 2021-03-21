package DesRochers.Ryan.Chapter7.Java.Project;

public class SimpleMath {
	
	public double divide(double num, double den) {
		if(den == 0) {
			throw new ArithmeticException();
		}
		else {
			return (num/den);
		}
	}
}

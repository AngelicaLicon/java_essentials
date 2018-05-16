package numericTypes;

import libs.Input;

public class EjemploFloat {

	public static void main(String[] args) {
		System.out.print("f is: ");
		float f = Input.get_float();
		
		System.out.print("f2 is: ");
		float f2 = Input.get_float();
		
		Input.print("f/f2 = " + (f/f2));

	}

}

package Lab_1_CSC123;

public class Part_1 {

	public static void main(String[] args) {
		
		
		
		byte b = 39;
		short s = 20000;
		int i = 100000;
		long l = 1000000000;
		float f = 1.345f;
		double d = 2.0645 ;
		char c = 'C';
		boolean bo = false;
		
		int n = 'd'; 
		long h = 1.567f;
		boolean hg = 34;
		
		byte by = 128;
		short sh = 32790;
		float fl = 1.2344556;
		
		
		
		//Reflection
		// I learned that every data type only has a certain range you can work with. If you go above that range, the compiler tries to change the data type to the one that can handle that range of numbers or characters. 
		//It then gives an error because it cannot run the code while using the wrong data type.
		// The assignments that resulted in error codes were long to float and Boolean to int. 
		//Strangely enough, int to char did not give me an error code, but I believe it didn’t because I have not tried to print the variable.
		//They gave me the error, Type mismatch, because it could not convert the data type to the data type of the value because I didn’t use type casting to allow it to happen. 
		//It also gave me the same error code when putting out of range values on data types, byte, short, and float. 
		//It is trying to do the same thing as the previous errors, like switch the data type to the correct one.

		
		
		

	}

}

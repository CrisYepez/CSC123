package assignment_2;

public class InvertedStringClass {

	private String string;
	
	public InvertedStringClass(String string) {
		this.string = string;
	}
	
	public void stringReversed() {
		for (int i = string.length()-1; i >=0; i--) {
			System.out.print(string.charAt(i));
		}
		System.out.println();
	}
}
		
	
	


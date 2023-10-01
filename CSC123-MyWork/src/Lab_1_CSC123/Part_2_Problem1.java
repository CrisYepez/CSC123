package Lab_1_CSC123;

public class Part_2_Problem1 {

	public static void main(String[] args) {
		int row = 9;
        int stars = 6;

        // top part
        for (int i = 0; i < row; i++) {
            if (i < stars) {
                for (int j = 0; j < 6; j++) {
                    System.out.print("* ");
                }
                System.out.println("==================================");
            } else {
                System.out.println("==============================================");
            }
        }

        // bottom part rows
        for (int i = 0; i < 6; i++) {
            System.out.println("==============================================");
        }
    }
}





	



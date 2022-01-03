import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter square side:");

        int squareSide = myObj.nextInt();  // Read user input
        Square mySquare = new Square(squareSide,squareSide);
        mySquare.calculateArea();
        mySquare.calculatePerimeter();
        mySquare.print();

        System.out.println("Enter rectangle sides.a:");
        int aSide = myObj.nextInt();  // Read user input
        System.out.println("Enter rectangle sides.a:");
        int bSide = myObj.nextInt();  // Read user input
        Rectangle myRectangle = new Rectangle(aSide,bSide);
        myRectangle.calculateArea();
        myRectangle.calculatePerimeter();
        myRectangle.print();
    }
}

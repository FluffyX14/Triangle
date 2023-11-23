import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int side1;
    int side2;
    int side3;
    int repeat = 1;
    Triangle t = new Triangle();
    do{
    	System.out.print("Enter side length 1: ");
    	side1 = sc.nextInt();
        System.out.print("Enter side length 2: ");
        side2 = sc.nextInt();
        System.out.print("Enter side length 3: ");
        side3 = sc.nextInt();
        if (side1 < 0 || side2 < 0 || side3 < 0) {
        	System.out.println("Side lengths cannot be negative");
        }
        else if (side1 + side2 < side3 || side2 + side3 < side1 || side1 + side3 < side2) {
        	System.out.println("These side lengths do not create a triangle");
        }
        else {
        	System.out.println("The triangle is " + t.getTriangleType(side1, side2, side3));
            System.out.println("The perimeter is " + t.getPerimeter());
            if (t.getRight() == 1) {
            	System.out.println("The area is " + t.getArea());
            }
        }
        System.out.print("Would you like to repeat the program? (1=yes 2=no): ");
        repeat = sc.nextInt();
    }while(repeat == 1);

  }
}
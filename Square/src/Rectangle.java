public class Rectangle extends Square{
    public Rectangle(int side,int side2) {
        super(side,side2);

    }

    // Getters
    public int getSideOne() {
        return side;
    }

    public int getSideTwo() {
        return side2;
    }
    // Setters
    public void setSideOne(int newSideOne) {
        this.side = newSideOne;
    }

    public void setSideTwo(int newSideTwo) {
        this.side = newSideTwo;
    }

    void calculatePerimeter() {
        perimeter = 2*side+2*side2;
    }

    void calculateArea() {
        area = this.side * this.side2;
    }

    void print(){
        System.out.println("The sides are a:" + side + " cm and b:" + side2 + " cm.");
        System.out.println("The perimeter is " + perimeter + " cm.");
        System.out.println("The area is " + area+ " cm.");
    }
}

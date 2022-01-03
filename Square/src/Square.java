public class Square {
    static public int side;
    static public int side2;
    static public int perimeter;
    static public int area;
    public Square(int side,int side2) {
        this.side = side;
        this.side2 = side2;
    }

    // Getter
    public int getSide() {
        return side;
    }

    // Setter
    public void setSide(int newSide) {
        this.side = newSide;
    }

    void calculatePerimeter() {
        perimeter = 2*side+2*side2;
    }

    void calculateArea() {
        area = this.side * this.side2;
    }

    void print(){
        System.out.println("The side is " + side + " cm.");
        System.out.println("The perimeter is " + perimeter + " cm.");
        System.out.println("The area is " + area+ " cm.");
    }
}

public class Circle {
    private double radius;

    /**
     * class's constructor
     * @param radius circle radius (double type)
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * calculates and returns the circle perimeter
     * @return circle perimeter
     */
    public double calculatePerimeter(){
        double perimeter = 2 * Math.PI * radius;
        return perimeter;
    }

    /**
     * calculates and returns the circle area
     * @return circle area
     */
    public double calculateArea(){
        double area = radius * radius * Math.PI;
        return area;
    }

    /**
     * prints the type of this shape (circle in this class) + perimeter + area
     */
    public void draw(){
        System.out.println("Type : Circle | Perimeter = " + calculatePerimeter()
                + " | Area = " + calculateArea());
    }

    /**
     * checks if input circle is equal to this circle (check the radius)
     * @param testCircle input circle to be tested
     * @return true if it equals / false if not
     */
    public boolean equals(Circle testCircle){
        if(this.getRadius() == testCircle.getRadius())
            return true;
        else
            return false;
    }

    /**
     * returns a string representing shape type (circle in this class) + radius
     * @return the string that stores this circle's details
     */
    public String toString(){
        return ("Type : Circle | Radius : " + this.getRadius());
    }

    /**
     *
     * @return circle radius
     */
    public double getRadius() {
        return radius;
    }
}

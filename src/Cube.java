public class Cube {
    private int side;

    // Constructor with no arguments, sets side to 1
    public Cube() {
        this.side = 1;
    }

    // Constructor with side parameter
    public Cube(int side) {
        if (side < 1) {
            throw new IllegalArgumentException("A cube's side length cannot be less than 1!");
        }
        this.side = side;
    }

    // Getter method for side
    public int getSide() {
        return side;
    }

    // Setter method for side
    public void setSide(int side) {
        if (side < 1) {
            throw new IllegalArgumentException("A cube's side length cannot be less than 1!");
        }
        this.side = side;
    }

    // Calculate surface area of the cube
    public int calculateSurfaceArea() {
        return 6 * side * side;
    }

    // Calculate volume of the cube
    public int calculateVolume() {
        return side * side * side;
    }

    // toString method
    @Override
    public String toString() {
        return "Cube{side=" + side + "}";
    }
}
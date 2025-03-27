public class Triangle extends Shape { // Subclass of Shape
    private int sideA, sideB, sideC;

    public Triangle(Point location, int sideA, int sideB, int sideC) {
        super(location);
        setSideA(sideA);
        setSideB(sideB);
        setSideC(sideC);
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        if (sideA <= 0) {
            throw new IllegalArgumentException("Side A must be a positive number");
        }
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        if (sideB <= 0) {
            throw new IllegalArgumentException("Side B must be a positive number");
        }
        this.sideB = sideB;
    }

    public int getSideC() {
        return sideC;
    }

    public void setSideC(int sideC) {
        if (sideC <= 0) {
            throw new IllegalArgumentException("Side C must be a positive number");
        }
        this.sideC = sideC;
    }

    @Override
    public double perimeter() {
        System.out.println("Shape Class Perimeter Method:");
        return sideA + sideB + sideC;
    }

    @Override
    public double area() {
        System.out.println("Shape Class Area Method:");
        double s = perimeter() / 2.0;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC)); // Heron's Formula
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", sideC=" + sideC +
                ", location=" + getLocation() +
                '}';
    }
}

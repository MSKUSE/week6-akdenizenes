public class Rectangle extends Shape {//Sub classlar Circle.Main classların sttributelerine ulaşabilir.
    //Rectangle class has 3 attribute.
    private int sideA, sideB;

    public Rectangle(Point location, int sideA, int sideB) {
        super(location);
        setSideA(sideA);
        setSideB(sideB);
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        if(sideB < 0){
            throw new IllegalArgumentException("Side B must be a positive number");         //ASSİGNMENT ALERT//
        }
        else{
            this.sideB = sideB;
        }
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        if(sideA < 0) {
            throw new IllegalArgumentException("Side A must be a positive number");         //negatif uzunluk ve açı olamayacağı için hata almamızı sağlıyor
        }                                                                                   //hatadan sonraki kod kısımları çalışmayacak.
        else {
            this.sideA = sideA;
        }
    }
    @Override
    public double perimeter(){
        System.out.println("Shape Class Perimeter Method : ");
        return 2*sideA+2*sideB;
    }

    @Override
    public double area(){
        System.out.println("Shape Class Area Method : ");
        return sideA*sideB;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "sideB=" + this.sideB +
                ", sideA=" + this.sideA +
                ", location=" + this.getLocation() +
                '}';
    }
}

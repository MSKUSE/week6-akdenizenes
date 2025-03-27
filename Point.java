public class Point {
    public int xCoord, yCoord;

    //Constructor!!
    public Point() {     //Bu constructor yazılmasada olur arkada
    }                    //vardır sadece göstermek için yazıldı.
                        //Ancak eğer bunu silersen nesne olarak boş bir nesne oluşturamazsın!
    //Constructor!!
    public Point(int x, int y){
        this.xCoord = x;
        this.yCoord = y;
    }
    //Constructor!!
    public Point(int xy){
        this.xCoord = xy;
        this.yCoord = xy;
    }

    @Override
    public String toString() {
        return "Point{" +
                "xCoord=" + xCoord +
                ", yCoord=" + yCoord +
                '}';
    }
}


public class Main {
    public static void main(String[] args) {    //Diğer classlardan oluşturulan nesneler burada oluşturulur.
        Rectangle r = new Rectangle(new Point(3,4),5,6);
        System.out.println(r.getLocation());
        System.out.println(r);
        System.out.println(r.area());
        System.out.println(r.perimeter());

        Circle c = new Circle(new Point(3,4),5);
        System.out.println(c);
        System.out.println(c.area());
        System.out.println(c.perimeter());












//        Point p = new Point(3, 4);
//        Rectangle r1 = new Rectangle(p, 3,4);
//
//        System.out.println(r1.counterForObject);
//        System.out.println(Rectangle.counter);
//
//        Rectangle r2 = new Rectangle(p, 5,6);
//
//        System.out.println(r1.counterForObject);
//        System.out.println(r2.counterForObject);
//        System.out.println(Rectangle.counter);
//
//        Circle c1 = new Circle(p,5);
//
//        System.out.println(r1);
//        System.out.println(c1);
//
//        String a = new String("aaa");
//        System.out.println(a);
    }
}
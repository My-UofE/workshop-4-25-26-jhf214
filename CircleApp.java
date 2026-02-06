public class CircleApp {

    public static void main( String[] args ) {
        Circle myCirc1 = new Circle(5.0, 8.0,30.0);
        System.out.println("myCirc1: "+myCirc1);

        myCirc1.move(5.0, 6.0);
        System.out.println("moved myCirc1: "+myCirc1);
        System.out.println("area of myCirc1: "+myCirc1.getArea());
        System.out.println("circum of myCirc1: "+myCirc1.getCircumference());

        Circle myCirc2 = new Circle(20.0, 14.0, 35.0);
        System.out.println("myCirc2: "+myCirc2);
        System.out.println("myCirc1 and myCirc2 overlap: "+myCirc1.isOverlappedWith(myCirc2));
        System.out.println("myCirc1 and myCirc2 overlap: "+Circle.areOverlapping(myCirc1, myCirc2));

        Circle myCirc3 = new Circle(3.0, 15.0, 38.0);
        System.out.println("myCirc3: "+myCirc3);
        System.out.println("myCirc2 encloses myCirc3: "+myCirc3.isEnclosedBy(myCirc2));

    }

}
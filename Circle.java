public class Circle {
    private double radius;
    private double originX;
    private double originY;

    //constructor
    public Circle(double radius, double originX, double originY) {
        this.radius = radius;
        this.originX = originX;
        this.originY = originY;
    }

    //override constructor
    public Circle(double radius) {
        this(radius, 0, 0);
    }

    //override constructor
    public Circle() {
        this(1,0,0);
    }

    //getters
    public double getRadius() {
        return this.radius;
    }
    public double getOriginX() {
        return this.originX;
    }
    public double getOriginY() {
        return this.originY;
    }
    //setters
    public void setRadius(double radius) {
        if (radius > 0) { this.radius = radius; }
    }
    public void setOriginX(double originX) {
        this.originX = originX;
    }
    public void setOriginY(double originY) {
        this.originY = originY;
    }

    //methods
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }
    public void move(double dx, double dy) {
	   originX += dx;
	   originY += dy;
    }
    // Rectangle[x=*,y=*,w=*,h=*]
    public String toString(){
        return "Circle[x="+originX+",y="+originY+",rad="+radius+"]";
    }

    public void scale(double scale) {
        radius = radius*scale;
    }
      
    public boolean isOverlappedWith(Circle c){
        double centreXDiff = Math.abs(c.originX - this.originX);

        if ((centreXDiff - c.radius - this.radius) >= 0) {
            return false;
        }
        double centreYDiff = Math.abs(c.originY - this.originY);

        if ((centreYDiff - c.radius - this.radius >= 0)) {
            return false;
        }

        return true;
    }

    public static boolean areOverlapping(Circle c1, Circle c2) {
        return c1.isOverlappedWith(c2);
    }

    public boolean isEnclosedBy(Circle c) {
        double centreXDiff = Math.abs(c.originX - this.originX);
        double centreYDiff = Math.abs(c.originY - this.originY);

        double centreDiff = Math.sqrt(centreYDiff*centreYDiff + centreXDiff*centreXDiff);
        
        if (centreDiff + this.radius < c.radius) {
            return true;
        }

        return false;
    }

}
//import java.Math.abs;

// A Rectangle class
public class Rectangle {
  
  // 4 instance attributes
  private double width;
  private double height;
  private double originX = 0.0;
  private double originY = 0.0;

  // 1 static attributes
  public static final int NUMBER_OF_SIDES = 4;

  // main constructor
  public Rectangle(double width, double height, double originX, double originY) {
    this.width = width;
    this.height = height;
    this.originX = originX;
    this.originY = originY;
  }

  //second constructor
  public Rectangle(double width, double height) {
    this(width, height, 0, 0);
  }

  //third constructor
  // second constructor: 
  public Rectangle() {
      this(1, 1, 0, 0);
  }

  // method: move the rectangle
  public void move(double dx, double dy) {
	   originX += dx;
	   originY += dy;
  }

  // method: compute the area of the rectangle
  public double getArea() {
    return width * height;
  }

  // method: compute the area of the rectangle
  public void scale(double scaleX, double scaleY) {
    width = width*scaleX;
    height = height*scaleY;
  }

  // method: compute the area of the rectangle
  public void scale(double scale) {
    width = width*scale;
    height = height*scale;
  }


  public boolean isOverlappedWith(Rectangle r){
    double centreXDiff = Math.abs(r.originX - this.originX);

    if ((centreXDiff - r.width/2 - this.width/2) >= 0) {
      return false;
    }
    double centreYDiff = Math.abs(r.originY - this.originY);

    if ((centreYDiff - r.height/2 - this.height/2 >= 0)) {
      return false;
    }

    return true;
  }

  public static boolean areOverlapping(Rectangle r1, Rectangle r2) {
    return r1.isOverlappedWith(r2);
  }
  
  // method: compute the perimeter of the rectangle
  public double getPerimeter() {
    return 2 * (width + height);
  }

  public double calcRatio() {
    return width / height;
  }

  public boolean isSquare() {
    double ratio = this.calcRatio();

    return (0.999 < ratio && ratio < 1.001);
  }


  //getters:
  public double getWidth() {
    return this.width;
  }
  public double getHeight() {
    return this.height;
  }
  public double getOriginX() {
    return this.originX;
  }
  public double getOriginY() {
    return this.originY;
  }

  //setters:
  public void setWidth(double width) {
    if (width > 0) { this.width = width; }
  }
  public void setHeight(double height) {
    if (height > 0) { this.height = height; }
  }
  public void setOriginX(double originX) {
    this.originX = originX;
  }
  public void setOriginY(double originY) {
    this.originY = originY;
  }
  
}

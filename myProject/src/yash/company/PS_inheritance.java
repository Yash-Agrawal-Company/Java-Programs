package yash.company;
class Circle{
    public int radius;
    public Circle(int a){
        System.out.println("I am the constructor of circle class ");
        this.radius = a;
    }
    public double area(){
        return (Math.PI*this.radius*this.radius);
    }
}
class Cylinder extends Circle{
  public  Cylinder(int r,int h){
      super(r);
      System.out.println("I am the constructor of cylinder class ");
     this.height = h;
  }
    public int height;
    public double volume(){
        return Math.PI*this.radius*this.radius*height;
    }
}
public class PS_inheritance {
    public static void main(String[] args) {
        // Create a class circle and made its child class cylinder using inheritance
        Cylinder cyl = new Cylinder(5,4);
    }
}

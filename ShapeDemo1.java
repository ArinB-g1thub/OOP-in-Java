// Parent Class
class Shape1{
    public void draw(){
        System.out.println("Drawing a Shape");
    }
}

// Child Class - Circle
class Circle1 extends Shape1{
    @Override
    public void draw(){
        System.out.println("Drawing a circle");
    }
}

// Child Class - Rectangle
class Rectangle1 extends Shape1{
    @Override
    public void draw(){
        System.out.println("Drawing a Rectangle");
    }
}

// Main Class
public class ShapeDemo1{
    public static void main (String[] args){
        Shape1 s1 = new Shape1();
        Shape1 s2 = new Circle1();
        Shape1 s3 = new Rectangle1();
        
        s1.draw();      // Calls Shape's draw()
        s2.draw();      // Calls Circle's Overridden draw()
        s3.draw();      // Calls Rectangle's Overridden draw()
    }
}
package polymorphism;

class shapearea1 {
    
    int area(int a)
    {
        return (a*a);
    }

    int area(int l, int b)
    {
        return (l*b);
    }

    double area(double r)
    {
        return (3.14*r*r);
    }
}

public class shapearea{
    public static void main(String[] args){
        shapearea1 shape = new shapearea1();

        System.out.println("Area of Square: "+ shape.area(2));
        System.out.println("Area of triangle: " + shape.area(2, 3));
        System.out.println("Area of Circle : "+shape.area(4.0));
    }
}



// create a subclass called circle that overrides the perimeter and area

package Day21;

class Shape{
    public float getPerimeter(int l,int b){
        return 2*l*b;
        
    }

    public float getArea(int l,int b){
        return l*b;
    }
}

class Rectangle extends Shape
{
    public float getPerimeter(int l,int b){
        float res=super.getPerimeter(l,b);
        return res;
    }

    public float getArea(int l,int b){
        float area=super.getArea(l,b);
        return area;
    }
}


public class Oops {
    public static void main(String[] args) {
       Rectangle obj=new Rectangle();
       System.out.println(obj.getArea(3, 4));
       System.out.println(obj.getPerimeter(3, 4));

    }
}

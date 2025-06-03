package Day20;
class parent{
    void display(){
        System.out.println("Parent class");
    }
}
class Child extends parent{
    void show(){
        System.out.println("Child class");
    }
}
public class Inderitance {
    public static void main(String[] args) {
        Child obj=new Child();
        obj.display();
        obj.show();
        
    }
}

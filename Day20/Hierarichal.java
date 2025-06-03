package Day20;
class parent{
    void displayParent(){
        System.out.println("Parent class");
    }
}
class Child1 extends parent{
    void displayChild1(){
        System.out.println("Child1 class");
    }
}

class Child2 extends parent{
    void displayChild2(){
        System.out.println("Child2 class");
    }
}

public class Hierarichal {
   public static void main(String[] args) {
    Child1 obj=new Child1();
    Child2 obj1=new Child2();
    
   }
}

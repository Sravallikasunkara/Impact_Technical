// To Create a class called Animal with a method called sound create a subclass named cat that overwrite the sound method to bark

package Day21;

class Animal{
    void sound(){
        System.out.println("Sounding.....");
    }
}

class Cat extends Animal{
    void sound(){
        System.out.println("Meowwww..........");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Cat obj=new Cat();
        obj.sound();
        
    }
    
}

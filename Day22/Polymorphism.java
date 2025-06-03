package Day22;

class Operations{
    int add(int a,int b){
        return a+b;
    }
    double add1(double a,double b){
        return a+b;
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Operations obj=new Operations();
        System.out.println(obj.add(5,5));
        System.out.println(obj.add1(10.55,10.55));
    }
    
}

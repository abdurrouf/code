package javaapplication1;

public class Prac {
    public static void main(String[] args) {
        System.out.println("Hello World !!!");
    }
}

class Bicycle{
    int cadense;
    int gear;
    int speed;

    public Bicycle(int a, int b, int c) {
        cadense=a;
        gear=b;
        speed=c;
    }
    
}
class MountainBike extends Bicycle{
    int seatHight;

    public MountainBike(int a, int b, int c,int d) {
        super(a, b, c);
        seatHight=d;
    }
    
}

class copyConstructor{
    int id;
    String name;
    public copyConstructor(int i,String s) {
        id=i;
        name=s;
    }

    public copyConstructor(copyConstructor cct) {
        id=cct.id;
        name=cct.name;
    }
    void display(){
        System.out.println("id = "+this.id+" name = "+this.name);
    }
    
    
}
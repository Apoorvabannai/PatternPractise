package CorePractise;

 class Animal{
    Animal(){
        System.out.println("This is parent class constructor");
    }
    void eat(){
        System.out.println("Animal is eating");
    }
}
class Dog extends Animal{
    Dog(){
        System.out.println(" child constructor is called");
    }
    void eat(){
        System.out.println("Dog is barking method is changed ");
    }
    public static void main(String[]args){
      //  Dog a = new Dog();
        Animal b = new Dog();
        b.eat();
    }
}
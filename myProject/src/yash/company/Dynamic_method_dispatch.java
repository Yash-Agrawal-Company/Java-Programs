package yash.company;
class Animal{

    void eat(){
        System.out.println("I am eating some king of food . . . ");
    }
    public void say(){
        System.out.println("I shout  . . . ");
    }
}
class Dog extends Animal{
    public void say(){
        System.out.println("I shout very loudly . . . ");
    }
    @Override
    void eat(){
        System.out.println("I am eating a human bone . . .  ");
    }
}
public class Dynamic_method_dispatch {
    public static void take(int a){
        System.out.println("Today i watched "+a+" movies");
    }
    public static void main(String[] args) {
        /* In dynamic method dispatch , we give the reference of the super class ,but actually we make the object of the subClass
         hence the method of the superClass will be executed except the method which are override in the subclass
         Here , the dog is a class inherited from a parent class Animal , so it acquires all the properties of the parent class
         except those which are changed */
        Animal rockey = new Dog();
        rockey.eat();
        rockey.say();

        take(4);
    }
}

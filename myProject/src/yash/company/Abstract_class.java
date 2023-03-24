package yash.company;

import org.w3c.dom.ls.LSOutput;

abstract class White{
    abstract public void choose(); // Abstract methods are those methods which are not defined and the classes which contain
                                    //    abstract method called an abstract class
}
class Black extends White{
    @Override
    public void choose(){               /* if we override the method of super abstract class then we can make the cbect of the derived class otherwise not */
        System.out.println("I always Black color");
    }
}

abstract class Red extends White{
    public void say(){
        System.out.println("I am Red not white now "); // now this class doesn't contain the overriden method choose so , it is also an abstract class
    }
}
public class Abstract_class {
    public static void main(String[] args) {
            White color = new Black(); // objects of an abstract class can't be made
            color.choose();
            Red colr = new Red() {
                @Override
                public void choose() {
                    System.out.println("this is a method");
                }
            };
            colr.choose();
    }
}

class Parent {
    void show() {
        System.out.println("Parent's method");
    }
}

class Child extends Parent {
    @Override
    void show() {
        System.out.println("Child's method");
    }
}

public class OverridingDemo {
    public static void main(String[] args) {
        Parent obj = new Child(); // Runtime Polymorphism
        obj.show(); 
    }
}

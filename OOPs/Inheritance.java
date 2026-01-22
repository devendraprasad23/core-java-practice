class Parent {
    void show() {
        System.out.println("Parent class method");
    }
}

class Child extends Parent {
    void display() {
        System.out.println("Child class method");
    }
}

class InheritanceDemo {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.show();
        obj.display();
    }
}

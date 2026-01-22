class Parent {
    void show() {
        System.out.println("Parent class");
    }
}

class Child extends Parent {
    public static void main(String[] args) {
        Child c = new Child();
        c.show();
    }
}

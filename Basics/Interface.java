interface A {
    void show();
}

class B implements A {
    public void show() {
        System.out.println("Interface implemented");
    }

    public static void main(String[] args) {
        B obj = new B();
        obj.show();
    }
}

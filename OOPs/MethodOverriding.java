class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}
class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}
class OverridingDemo {
    public static void main(String[] args) {

        Animal a = new Dog();   // runtime polymorphism
        a.sound();
    }
}

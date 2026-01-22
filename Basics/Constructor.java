class Student {
    String name;

    Student(String n) {
        name = n;
    }

    void display() {
        System.out.println(name);
    }

    public static void main(String[] args) {
        Student s = new Student("Devendra");
        s.display();
    }
}

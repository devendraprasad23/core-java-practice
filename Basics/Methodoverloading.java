class MathOperation {

    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        MathOperation obj = new MathOperation();
        System.out.println(obj.add(10, 20));
        System.out.println(obj.add(10.5, 20.5));
    }
}

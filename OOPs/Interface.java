interface Bank {
    void rateOfInterest();
}
class SBI implements Bank {
    public void rateOfInterest() {
        System.out.println("SBI interest is 7%");
    }
}
class InterfaceDemo {
    public static void main(String[] args) {
        Bank b = new SBI();
        b.rateOfInterest();
    }
}

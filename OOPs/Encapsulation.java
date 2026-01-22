class Account {

    private int balance = 1000;   // data hiding

    public int getBalance() {
        return balance;
    }

    public void setBalance(int amount) {
        balance = balance + amount;
    }
}

class EncapsulationDemo {
    public static void main(String[] args) {

        Account acc = new Account();

        acc.setBalance(500);
        System.out.println("Balance = " + acc.getBalance());
    }
}

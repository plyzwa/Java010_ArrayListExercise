public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank("PKO");
        bank.addBranch("Gdansk");
        bank.addCustomer("Gdansk", "Patryk", 50.24);
        bank.addCustomer("Gdansk", "Roman", 23.54);
        bank.addCustomer("Gdansk", "Patryk", 12.34);

        bank.addBranch("Warsaw");
        bank.addCustomer("Warsaw", "Patryk", 24.75);

        bank.addCustomerTrans("Warsaw", "Patryk", 44.52);
        bank.addCustomerTrans("Warsaw", "Patryk", 24.63);
        bank.addCustomerTrans("Warsaw", "Roman", 8.40);

        bank.listCustomers("Gdansk", false);

    }
}

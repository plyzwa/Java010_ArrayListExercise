import java.util.ArrayList;

public class Branch {
    private String branchName;
    private ArrayList<Customer> customers;

    public Branch(String branchName) {
        this.branchName = branchName;
        this.customers = new ArrayList<Customer>();

    }

    public String getBranchName() {
        return branchName;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String name, double initialAmount) {
        if (findCustomer(name) == null) {
            this.customers.add(new Customer(name, initialAmount));
            return true;
        }
        return false;
    }
    public boolean addCustomerTransaction(String name, double amount) {
        Customer existCustomer = findCustomer(name);
        if (existCustomer != null) {
            existCustomer.addTrans(amount);
            return true;
        }
        return false;
    }
    private Customer findCustomer(String name) {
        for (int i=0;i<this.customers.size();i++) {
            if (this.customers.get(i).getName().equals(name)) {
                return this.customers.get(i);
            }
        }
        return null;
    }
}

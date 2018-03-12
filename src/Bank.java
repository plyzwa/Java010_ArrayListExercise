import java.util.ArrayList;

public class Bank {
    private String bankName;
    private ArrayList<Branch> branchList = new ArrayList<Branch>();

    public Bank(String bankName) {
        this.bankName = bankName;
        this.branchList = new ArrayList<Branch>();
    }
    public boolean addBranch(String name) {
        if(findBranch(name) != null) {
            this.branchList.add(new Branch(name));
            return true;
        }
        return false;
    }
    public boolean addCustomer(String branchName, String CustomerName, double initAmount) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.newCustomer(CustomerName, initAmount);
        }
        return false;
    }
    public boolean addCustomerTrans(String branchName, String customerName, double amount) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.addCustomerTransaction(customerName, amount);
        }
        return false;
    }
    private Branch findBranch(String name) {
        for (int i=0;i<this.branchList.size();i++) {
            if (this.branchList.get(i).getBranchName().equals(name)) {
                return this.branchList.get(i);
            }
        }
        return null;
    }
    public boolean listCustomers(String branchName, boolean showTransactions) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            System.out.println("Customers of branch: " + branch.getBranchName());
            ArrayList<Customer> branchCustomers = branch.getCustomers();
            for (int i=0; i<branchCustomers.size();i++) {
                Customer branchCustomer = branchCustomers.get(i);
                System.out.println("Customer " + branchCustomer.getName() + "[" +(i+1)+"]");
                if (showTransactions) {
                    System.out.println("Transactions");
                    ArrayList<Double> transactions = branchCustomer.getTranList();
                    for(int j=0;j<transactions.size();j++) {
                        System.out.println("["+(j+1)+"]" + " Amount: " + transactions.get(j));
                    }
                }
            }
            return true;
        } else {
            return false;
        }
    }
}

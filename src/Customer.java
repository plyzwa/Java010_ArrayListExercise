import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> tranList;

    public Customer(String name, double initialAmount) {
        this.name = name;
        this.tranList = new ArrayList<Double>();
        addTrans(initialAmount);
    }
    public void addTrans(double amount) {
        this.tranList.add(amount);
    }
    public String getName() {
        return name;
    }
    public ArrayList<Double> getTranList() {
        return tranList;
    }
}

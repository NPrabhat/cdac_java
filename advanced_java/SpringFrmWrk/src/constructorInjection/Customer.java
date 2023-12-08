package constructorInjection;

import java.util.Set;

public class Customer {
    private int custId;
    private String custName;
    private Set<String> itemPurchased;

    public Customer() {
    }

    public Customer(int custId, String custName, Set<String> itemPurchased) {
        System.out.println("Constructor running");
        this.custId = custId;
        this.custName = custName;
        this.itemPurchased = itemPurchased;
    }

    @Override
    public String toString() {
        return "Customer{" + "custId=" + custId + ", custName=" + custName + ", itemPurchased=" + itemPurchased + '}';
    }
    
    
}
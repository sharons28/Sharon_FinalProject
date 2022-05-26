package petshop;

public class Shop {
    private Customer[] record;
    private int index;
    private int lastIndex;

    // constructor
    public Shop() {
        record = new Customer[10];
        index = 0;
    }

    public void add (Customer i) {
        // adds items to the array of items one at a time
        if (index < record.length) {
            record[index] = i;
            index++;
        }
    }
    public String printRecord() {
        // prints all the students added in the record excluding the null values
        int i= 10;
            if (record[i] == null) {
                index--;
            }
        return record[index].toString();
    }


    public Customer getCheapestOrder() {
        // returns the cheapest appointment booked
        Customer cheapest = record[0];
        for (int i = 0; i < record.length; i++) {
            if (record[i].getTotalExpenses() < cheapest.getTotalExpenses()) {
                cheapest = record[i];
            }
        }
        return cheapest;
    }

    public Customer getMostExpensiveOrder() {
        // returns the most expensive appointment booked
        Customer mostExpensive = record[0];
        for (int i = 0; i < record.length; i++) {
            if (record[i].getTotalExpenses() > mostExpensive.getTotalExpenses()) {
                mostExpensive = record[i];
            }
        }
        return mostExpensive;
    }

}

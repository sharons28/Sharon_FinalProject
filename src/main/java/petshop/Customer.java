package petshop;

public class Customer {
    private String petName;
    private String ownerName;
    private String cart;
    private String date;
    private int totalExpenses;

    public Customer (String pName, String oName, String date, String cart, int total){
        this.petName=  pName;
        this.ownerName= oName;
        this.date= date;
        this.totalExpenses = total;
        this.cart= cart;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getTotalExpenses() {
        return totalExpenses;
    }

    public void setTotalExpenses(int totalExpenses) {
        this.totalExpenses = totalExpenses;
    }

    public String getCart() {
        return cart;
    }

    public void setCart(String cart) {
        this.cart = cart;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Pet Name: " + petName + "\n" +
                "Owner Name: " + ownerName + "\n" +
                "Account Started On: " + date + "\n"+
                "Cart: " + cart + "\n"+
                "Total Expenses: " + totalExpenses;
    }
}

public class Customer {

    private String name;
    private double creditLimit;
    private String email;

    public Customer() {
        this("Nobody",  "Nobody@nowhere.com");
    }

    public Customer(String name, String email) {
        this(name, 10000.00, email);
    }

    public Customer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }


    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getemail() {
        return email;
    }

}

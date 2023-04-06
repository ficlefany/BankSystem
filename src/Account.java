import java.util.Date;

public class Accounts implements  Comparable {

   // Variables
    static int nextAccNo = 10;
    int accNo;
    String owner;
    City city;
    char gender;
    double balance;
    Date openDate;

//constructor
    public Accounts() {
    }

    public Accounts(String owner, City city, char gender) {
        accNo = nextAccNo;
        nextAccNo += 10;
        this.owner = owner;
        this.city = city;
        this.gender = gender;
        balance = 0.0;
        openDate = null; //System.currentDate();
    }

    public Accounts(int accNo, String owner, City city, char gender, double balance) {
        this.accNo = accNo;
        this.owner = owner;
        this.city = city;
        this.gender = gender;
        setBalance(balance);
    }

    public void setBalance(double b) {
        balance = b > 0.0 ? b: 0.0;
    }

    @Override
    public String toString() {
        return  accNo + " " + owner + " "+ city + " " + gender + " " + balance +
                " " + openDate;
    }

    @Override
    public int compareTo(Object o) {
        return this.owner.compareTo(((Account) 0) .owner);
    }
}

public class Customer {
    private String email;
    private String name;
    private double balance;

    public Customer(String email, String name, double balance) {
        this.email = email;
        this.name = name;
        this.balance = balance;
    }

    public Customer(String email, String name) {
        this.email = email;
        this.name = name;
        this.balance = 0.0;

    }
public void buyBook(double price){
    if (this.balance<price)
        throw new IllegalArgumentException("Bütçe yetersiz"); //hata vermemesi için hata mesajı üretmek.
this.balance-=price; //bütçe azaltma
    System.out.println("Kitap satın alındı ");
    System.out.println("Kalan bütçe"+this.balance); //kalan bütçe
    }

    public void addBalance(double amount){
        this.balance+=amount; //arttırıyor.
        System.out.println("Yeni Bakiye: "+this.balance);
    }




    //get set


    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }


}



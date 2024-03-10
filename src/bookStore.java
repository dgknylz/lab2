public class bookStore {
    public static void main(String[] args) {

        Book books[] = {
                new Book("selami", "Orkun Kaya", 2500, 750),
                new Book("Sakladığın Bir şeyler var", "Ahmet Tevet", 500, 1997)

        };
        System.out.println("\nKitaplar Başarıyla Eklendi");
        Customer[] customers = {
                new Customer("dogukanylmazz11@gmail.com", "Doğukan Yılmaz",10000)
        };
        System.out.println("\nMüşretiler Başarılıyla Eklendi");
        double balace = 0;
        String email = "dogukanylmazz11@gmail.com";
        Customer foundCustomer = null;
        for (Customer c : customers) {
            if (c.getEmail().equals(email)) {
                foundCustomer = c;
                break;
            }
        }
        if (foundCustomer == null) {
            throw new IllegalArgumentException("Müşteri Bulunamadı.!!");

        }
String bookName="sielami";
        Book foundBook=null;
        for (Book b:books){
            if (b.getName().equals(bookName)){
                foundBook=b;
                break;
            }
        }
if (foundBook==null){
    throw new IllegalArgumentException("Kitap Bulunamadı.");

}
try {
    foundCustomer.buyBook(foundBook.getPrice());
balace+=foundBook.getPrice();
    System.out.println("\nKitap Başarılıyla Satın Alındı.");


}
catch (IllegalArgumentException e){
    System.out.println("\n"+e.getMessage());

}
        System.out.println("Bakiye: "+ balace);

    }

}
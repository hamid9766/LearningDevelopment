public class PhoneixMall {

    int customerId;
    String customerName;
    String phone;
    String email;
    String address;
    Store[] store;
    double subtotal = 0;
    double total;
    boolean paymentStatus = false;

    public PhoneixMall(int customerId, String customerName, String phone, String email, String address,Store[] store){
      this.customerId = customerId;
      this.customerName = customerName;
      this.phone = phone;
      this.email = email;
      this.address = address;
      this.store = store;
    }

    public PhoneixMall(String name, String phone, String address ){
        this.customerName = name;
        this.phone = phone;
        this.address= address;
    }

    public void productCost(double[] nike){
        double a = 0.0;
        for (int i = 0; i<=nike.length-1; i++){
            a = a + nike[i];
        }
        this.subtotal = this.subtotal + a;
        System.out.println(+a);
    }


    public double beforeDiscount(){
        return this.subtotal;
    }

    public double discount(){
        return this.subtotal * 0.15;
    }

    public double totalBill(){
        this.total = (this.subtotal - discount()) * 0.18 + this.subtotal;
        return this.total;
    }

    boolean payment(double amount){
        this.total= this.total - amount;
        System.out.println("your pending amount is :" + this.total);
        if(this.total==0)
        {
            paymentStatus= true;

            return paymentStatus;
        }
        return paymentStatus;
    }

    void printInvoice(){
        System.out.println("Customer_Id:" + customerId + "\nCustomer_Name:" + customerName + "\nPhone:" +phone
        + "\nEmail:" + email + "\nAddress:" + address + "\nstore Name:" + store);
    }



    public static void main(String[] args){

        Store nike = new Store("Nike");
        Store adidas = new Store("Adidas");
        Store reebok = new Store("Levi's");
        Store zara = new Store("ZARA");
        Store lee = new Store("Lee");
        Store flyingMachine = new Store("FlyingMachine");

        PhoneixMall phoneixmall = new PhoneixMall(134,"Hamid","9766912252","khanham4@gmail.com", "Pride World City",
                new Store[]{nike, adidas, reebok, zara,lee});


        System.out.println("***** WELCOME TO PHONEIX MARKETCITY *****");
        System.out.println(" GETTING YOUR INVOICE");

        System.out.println("INVOICE");
        phoneixmall.printInvoice();

        System.out.println(" WELCOME TO NIKE STORE");


        System.out.println("Product purchased Worth:");
        phoneixmall.productCost(new double[]{499.0, 899.0, 1299.0, 1759.0, 3599.0});

        System.out.println("***** Before Applying Discount *****");
        double beforeDiscount = phoneixmall.beforeDiscount();
        System.out.println("***** Discounted Amount is: " + phoneixmall.discount());
        System.out.println("***** Calculating CGST & SGST:*****");
        System.out.println("***** Generating Bill *****");
        double finalAmount = phoneixmall.totalBill();

        System.out.println("And your bill is:" + finalAmount);

        boolean billclear = phoneixmall.payment(finalAmount);

        if( billclear == true){
            System.out.println("GET THE FUCK OUT OF HERE !!!!!HAPPY TO SERVE YOU");
        }else{
            System.out.println("clear the billv ");
        }

    }
}


public class PostPaidConnection {

        String name;
        String email;
        String phone;
        String address;
        char gender;
        String adharId;
        double currentBill;
        double bill;
        boolean isPaymentDone = false;


        public PostPaidConnection(String name, String email, String phone, String address, char gender, String adharId, double plan) {
            this.name = name;
            this.email = email;
            this.phone = phone;
            this.address = address;
            this.gender = gender;
            this.adharId = adharId;
            this.currentBill = plan;


        }

        void usageCharges(double amount) {
            this.currentBill = this.currentBill + amount;
        }


        public double generatBill() {

            this.currentBill = (this.currentBill * 0.18) + this.currentBill;
            return currentBill;
        }

        double outstandingAmount() {
            return this.currentBill;
        }

        boolean processPayment(double amount) {
            this.currentBill = this.currentBill - amount;
            System.out.println("the pending amount is  :" + this.currentBill);
            if (this.currentBill == 0.0) {
                isPaymentDone = true;
                return isPaymentDone;
            }

            return isPaymentDone;
        }


        void printData() {
            System.out.println("Name:" + name + "email:" + "phone:" + phone + "address:" + address + "gender:" + gender +
                    "adharId:" + adharId + "currentBill:" + currentBill);
        }

        public static void main(String[] args) {
            PostPaidConnection airtel = new PostPaidConnection("Hamid", "anonyms4@gmail.com", "9769912152",
                    "pwc", 'M', "32457354609", 899);

            System.out.println("**** welcome to  airtel family ****");
            System.out.println("the current outstanding bill:" + airtel.outstandingAmount());

            airtel.usageCharges(20.0);
            airtel.usageCharges(55.0);
            airtel.usageCharges(100.0);


            System.out.println("the current outstanding bill:" + airtel.outstandingAmount());
            System.out.println("**** Bill Cycle Date has reached *****");
            double generatBill = airtel.generatBill();
            System.out.println("the bill generated amount is :" + +generatBill);
            System.out.println("***** Let's clear the bill by making the payment of Rs " + generatBill);
            boolean billClear = airtel.processPayment(generatBill);

            if (billClear == true) {
                System.out.println("Thank you for doing the payment. Happy to serve you!");
            }
            else {
                System.out.println("Kindly clear your pending dues as soon as possible to have un-interruppted services");
            }

        }

    }

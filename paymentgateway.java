interface paymentgateway {
    abstract void makePayment();   
}
class GooglePay implements paymentgateway
{
    public void makePayment(){

    
    System.out.println("Payment completed using Google Pay");
}
}


class PhonePe implements paymentgateway{
    public void makePayment(){

    
    System.out.println("Payment completed using PhonePe");
}
}

class Main{
    public static void main (String[] args){
        paymentgateway p1 = new GooglePay();
        paymentgateway p2 = new PhonePe(); 
        p1.makePayment();
        p2.makePayment();
    }
}
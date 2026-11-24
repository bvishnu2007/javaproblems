public class Bank {
    double getInterestRate() {
        return 0.0;
    }

}
class SBI extends Bank{
    double getInterestRate(){
        return 6.5;

    }
}
class HDFC extends Bank{
    double getInterestRate(){
        return 7.0;
    }
}
class Main{
    public static void main (String[] args){
        SBI s=new SBI();
        HDFC h=new HDFC();
        System.out.println(s.getInterestRate());
        System.out.println(h.getInterestRate());
    }
}

abstract class Delivery {
    public void acceptOrder(){
        System.out.println("Delivery order accepted");
    }
    
}
class FoodDelivery extends Delivery{
    public void deliverProduct(){
        System.out.println( "Food order delivered to customer");
    }
}
class ParcelDelivery extends Delivery{
    public void deliverProduct(){
System.out.println("Parcel delivered successfully");
    }
}
class Main{
    public static void main(String[] args) {
        FoodDelivery fd=new FoodDelivery();
        ParcelDelivery pd=new ParcelDelivery();
        fd.acceptOrder();
        fd.deliverProduct();
        pd.acceptOrder();
        pd.deliverProduct();
    }
}
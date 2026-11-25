public class WebsiteValidator {
   String url="https://www.google.com" ;
   void display(){
    if(url.startsWith("https://")){
System.out.println("ok");
   }
else{
    System.out.println("not ok");
}
    }
   }
   class Main{
    public static void main(String[] args) {
        WebsiteValidator wv=new WebsiteValidator();
        wv.display();
    }
   }


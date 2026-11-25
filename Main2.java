class Main{
    public static void main(String[] args) {
        
        String s1= "vishnu";
        System.out.println(s1.length());
        String s2= "VISHNU";

        System.out.println(s2.toLowerCase());
        System.out.println("nuber of characters:"+s2.length());

        for(int i=0;i<s1.length();i++){
        System.out.println(s1.charAt(i));
            
        }
        System.out.println(s1.equals(s2));
    

        
    }
}
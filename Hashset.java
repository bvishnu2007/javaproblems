import java. util.HashSet;
class Hashset1 {
    public static void main(String[] args) {
        
    
HashSet <Integer> ids= new HashSet<>(); 
ids.add(101);
 ids.add(102);
 ids.add(103);
  ids.add(104);
System.out.println(ids);
ids.add(105);
System.out.println(ids);
 ids. remove (104);
System.out.println("After Removal: " + ids);
System.out.println(ids.contains(103));
System.out.println(ids);
for (int id : ids) {
            System.out.println(id);
        }

}
    }

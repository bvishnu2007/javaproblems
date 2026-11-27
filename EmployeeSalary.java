public class EmployeeSalary {
    void setSalary(double salary){
        if(salary<=0){
            throw new IllegalArgumentException ("salary must be greater than zero");
            }
            else{

                System.out.println("employee salary"+salary);

            }
        }
    
public static void main(String[] args) {
    EmployeeSalary es=new EmployeeSalary();
    double[] arr={250000,500000,0,-19000};
    try{
    for(int i=0;i<arr.length;i++){
        es.setSalary(arr[i]);
    }
}
catch(IllegalArgumentException e){
    System.out.println("invalid");
}
}

}
    
    


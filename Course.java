 class Course {
    String coursename;
    int duration;
    double fee;
Course(String courseName, int duration, double fee){
    this.coursename=coursename;
    this.duration=duration;
    this.fee=fee;
}

void DisplayCourse(){
    System.out.println(this.coursename);
    System.out.println(this.duration);
    System.out.println(this.fee);


}

}
class Main{
    public static void main(String[] args) {
        Course c=new Course("python", 05, 5000000);
        c.DisplayCourse();
    }
}
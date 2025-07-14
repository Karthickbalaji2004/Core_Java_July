package Corejava;

public class kursha {
    static String Name= "Varsha";
    int rollno =54;

    public void kursh() {
        System.out.println("Name:" + Name);

    }

    public static void main(String[] args) {
        String Department="CSE";
        System.out.println("Department:"+Department);
        kursha boj=new kursha();
        System.out.println(boj.rollno);
        boj.kursh();
    }
}

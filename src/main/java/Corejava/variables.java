package Corejava;

public class variables {
    static String Name="ram"; // static
    int num =410; //instance

    public void  row()
    {
        int rat=152; //local
        System.out.println("Rat value is:"+rat);
        System.out.println("the number value is:"+num);
        System.out.println("Name is:"+Name);



    }
    public static void main(String[] args) {
        int age = 25; //global varaible
        System.out.println("age is:" + age);

        variables cc=new variables();
        cc.row();
    }
}

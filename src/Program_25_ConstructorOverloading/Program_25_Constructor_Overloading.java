package Program_25_ConstructorOverloading;

public class Program_25_Constructor_Overloading {
    int id;
    String name;
    int age;

    //creating two arg constructor
    Program_25_Constructor_Overloading(int i, String n) {
        id = i;
        name = n;
    }

    //creating three arg constructor
    Program_25_Constructor_Overloading(int i, String n, int a) {
        id = i;
        name = n;
        age = a;
    }

    public void display() {
        System.out.println(id + " " + name + " " + age);
    }

    public static void main(String args[]) {
        Program_25_Constructor_Overloading s1 = new Program_25_Constructor_Overloading(111, "Karan");
        Program_25_Constructor_Overloading s2 = new Program_25_Constructor_Overloading(222, "Aryan", 25);
        s1.display();
        s2.display();
    }
}

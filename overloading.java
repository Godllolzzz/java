// overloading or compile time polymorphism where the name of the function can be same put the number of arguments or type of
// arguments must be different

class Student {
    String Name;
    int Age;
    
    Student(String n, int a) {
        this.Name = n;
        this.Age = a;
    }
    public void printInfo() {
        System.out.println("Name: "+this.Name);
        System.out.println("Age: "+this.Age);
    }
    public void printInfo(String name) {
        System.out.println("Name: "+name);
        // System.out.println("Age: "+this.Age);
    }
    public void printInfo(int age) {
        System.out.println("Age: "+age);
    }
}

class Overloading {
    public static void main(String[] args) {
        Student student = new Student("Sudarshan", 21);
        student.printInfo(student.Age);
        student.printInfo();
        student.printInfo(student.Name);
    }

}

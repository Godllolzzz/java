// The name of the costructor is same as of the class.
// constructor is a special type of the function that does not return anything.
// for one object, consttructor can only call for once.


class Pen {
    String color;
    String type;
    
    Pen(String c, String t) {
        this.color = c;
        this.type = t;
    }    
    Pen() {

    }    

    Pen(Pen p) {
        this.color = p.color;
        this.type = p.type;
    }    
    public void write() {
        System.out.println(this.type+" pen is writing");
    }    
}    


class Main {
    public static void main(String[] args) {
        Pen p1 = new Pen(); // simple constructor
        p1.color = "red";
        p1.type = "ballpoint";
        Pen p2 = new Pen("pink", "fountain"); // argument constructor
        Pen p3 = new Pen(p2); // copy constructor
        // p1.write();
        // p2.write();
        p3.write();
    }    

}    


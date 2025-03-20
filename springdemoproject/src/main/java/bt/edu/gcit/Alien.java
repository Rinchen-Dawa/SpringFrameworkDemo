package bt.edu.gcit;

public class Alien {

    private int age;
    private int salary;

    private Computer comp;
    private Computer comp1;


    public int getAge(){
        return age;
    }

    public int getSalary(){
        return salary;
    }

    public void setAge(int age){
        System.out.println("Set Alien called");
        this.age = age;
    }

    public Alien(int salary,int age,Computer comp,Computer comp1) {
        this.comp = comp;
        this.comp1 = comp1;
        this.salary = salary;
        this.age = age;
    }
    
    public Alien(){
        System.out.println("Alien Object created");

    }


    public void code(){
        // System.out.println("I am coding");
        // desktop.compile();
        comp.compile();
        // comp1.compile();
    }

    // public Laptop getLap() {
    //     return lap;
    // }

    // public void setLap(Laptop lap) {
    //     System.out.println("From setLap");
    //     this.lap = lap;
    // }

    public Computer getComp() {
        return comp;
    }

    public void setComp(Computer comp) {
        this.comp = comp;
    }

    public Computer getComp1() {
        return comp1;
    }

    public void setComp1(Computer comp1) {
        this.comp1 = comp1;
    }
}
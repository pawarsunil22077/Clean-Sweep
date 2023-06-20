//Makes sure that all imported packages are Java.util
import java.util.*; 

//Class for Clean Sweep
public class CleanSweep {

    //Instance Variables
    private String name;
    private int age;
    private String type;
    
    //Constructor
    public CleanSweep(String name, int age, String type) {
        this.name = name;
        this.age = age;
        this.type = type;
    }
    
    //Getters and Setters
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    //Clean Sweep Cleaning Method
    public void cleanSweepCleaning() {
        System.out.println("Clean Sweep " + name + " is cleaning using " + type + "!");
    }
    
    //Power Me Up Method
    public void powerMeUp() {
        if (this.type == "Battery") {
            System.out.println("Clean Sweep " + name + " is powered with Battery!");
        }
        else if (this.type == "Wireless Charger") {
            System.out.println("Clean Sweep " + name + " is powered with Wireless Charger!");
        }
        else {
            System.out.println("Clean Sweep " + name + " is powered with electricity!");
        }
    }
    
    //Auto Recharge Method
    public void autoRecharge() {
        System.out.println("Clean Sweep " + name + " can now auto recharge!");
    }
    
    //Main Method
    public static void main(String[] args) {
        
        //Create an instance of Clean Sweep
        CleanSweep cs = new CleanSweep("Bob", 5, "Battery");
        
        //Call clean sweep cleaning method
        cs.cleanSweepCleaning();
        
        //Call Power me up method
        cs.powerMeUp();
        
        //Call Auto Recharge method
        cs.autoRecharge();
    }
}
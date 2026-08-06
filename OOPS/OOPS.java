// other classes like class pen , student should below the public class 
public class OOPS {
    public static void main(String[] args) {
        Pen p = new Pen();
        p.setColor("Bule");
        System.out.println(p.color);
        p.setTip(5);
        System.out.println(p.tip);
        // Direct set the color
        p.color = "yellow";
        System.out.println(p.color);
    }
}

class Pen {
    String color;
    int tip;
    
    void setColor(String newColor) {
    color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}

class student {
    String name;
    int age;
    float percentage; // CGPA

    void calculatePercentage(int phy, int chem, int math) {
        percentage = (phy + chem + math) / 3;
    }
}



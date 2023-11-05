class Medicines1 {
    
    public void takemedicine()
    {
        System.out.println("Take medicine per instruction");
    }
    /*Medicines(String group, String name, String type) 
    {
        this.name = "Crocin";
        this.group = "Antipyretic";
        this.type = "tablet";
    }*/
    
}

class Tablets extends Medicines1
{
    public void crush()
    {
        System.out.println("Take Tablets after food");
    }
    
    
    /*Tablets(String color, int weight)
    {
        this.color = "white";
        this.weight = 10;
        
    }*/
}

class Capsules extends Medicines1 
{
    public void swallow()
    {
        System.out.println("Take Capsules with water");
    }
    
    
    
    /*Capsules(String color, int weight) 
    {
        this.color = "Green";
        this.weight= 5;
    }*/
}

public class Medicines 
{
    public static void main(String[] args) {
        Capsules cap = new Capsules();
        cap.swallow();
        Tablets tab = new Tablets();
        tab.crush();
        Medicines1 md = new Medicines1();
        md.takemedicine();
    }
}
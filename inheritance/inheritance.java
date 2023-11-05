package inheritance;

class employee 
{
    void salary() 
    {
        System.out.println("salary = 70000");
    }
}

class hr extends employee
{
    void bonus() 
    {
        System.out.println("bonus = 30000");
    }
}
        
        
public class inheritance {

    public static void main(String[] args) {
        
        hr obj = new hr();
        obj.salary();
        System.out.println();
        obj.bonus();
    }
    
}

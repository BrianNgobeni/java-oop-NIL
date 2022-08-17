// program to demonstrate encapsulation
class Encapsulation 
{
    //private variables declared which can be accessed by public methods of this class
    private String geekName;
    private int geekAge;
    private int geekRoll;

    //public methods to access private variables (get methods have a return type)
    public String getName()
    {
        return geekName;
    }
    public int getAge()
    {
        return geekAge;
    }
    public int getRoll()
    {
        return geekRoll;
    }

    //set methods to access private variables (set methods are usually void)
    public void setName(String newName)
    {
        geekName = newName;
    }
    public void setAge(int newAge)
    {
        geekAge = newAge;
    }
    public void setRoll(int newRoll)
    {
        geekRoll = newRoll;

    }
    public class TestEncapsulation
    {
         public static void main(String[] args)
        {
            Encapsulation obj = new Encapsulation();
             // set values for variables
            obj.setName("Joseph");
            obj.setAge(37);
            obj.setRoll(58); 

            System.out.println("Geek's name is " + obj.getName());
            System.out.println("Geek's age is " + obj.getAge());
            System.out.println("Geek's roll is " + obj.getRoll());
        }
    }
 
}



public class Dog
{
    //instance variables
    String name;
    String breed;
    String color;
    int age;

    //construsctor declaration of class
    public Dog( String name, String breed, String color, int age)
    {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.age = age;
    }

    //getMethods
    public String getName()
    {
        return name;
    }
    public String getBreed()
    {
        return breed;
    }
    public String getColor()
    {
        return color;
    }
    public int getAge()
    {
        return age;
    }
  
    public String toString()
    {
        return("Hi my name is " + this.getName() + ".\nMy breed, age and color are " + this.getBreed() + "," + this.getAge() + ", " 
        + this.getColor());
    }

    public static void main(String[] args) 
    {
        Dog tuffy = new Dog("Tuffy","Husky", "Brown ", 15);
        System.out.println(tuffy.toString());
    }

}

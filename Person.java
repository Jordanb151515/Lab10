
/**
 * Person is superclass for Lab10 that takes and holds the name of the employees.
 *
 * @author Jordan Byrne
 * @version v1.0
 * @since 5/13/25
 */
public class Person
{
    private String name;
    public final static int CURRENT_YEAR = 2025;

    /**
     * No-args Constructor for objects of class Person
     */
    public Person()
    {
        name = "No name yet";
    }
    
    /**
     * Constructor for objects of class Person that takes the parameter of the 
     * name of the person.
     */
    public Person(String name)
    {
        this.name = name;
    }

    /**
     * Method takes the inputted string and sets it to name.
     *
     * @param  name  inputted name of the person
     */
    public void setName(String name)
    {
        this.name = name;
    }
    
    /**
     * Method is a getter for the name field.
     *
     * @return    the name variable
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * Method creates toString containing the name of the person.
     *
     * @return    the string with the name
     */
    public String toString()
    {
        String str = String.format("Name: ", name); 
        return str;
    }
}

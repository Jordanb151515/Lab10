
/**
 * Write a description of class Adjunct here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Adjunct extends Employee
{
    // instance variables - replace the example below with your own
    private double hours, hrRate;

    /**
     * Constructor for objects of class Adjunct
     */
    public Adjunct()
    {
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public double getSalary()
    {
        return (hours*hrRate);
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String toString()
    {
        String str = super.toString() +
                     String.format("\nHours: ",hours) +
                     String.format("\tHourly Rate: ", hrRate) +
                     String.format("\tSalary: $%,.2f", getSalary());
        return str;
    }
}

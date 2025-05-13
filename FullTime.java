
/**
 * Write a description of class FullTime here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FullTime extends Employee
{
    private double salary;

    /**
     * Constructor for objects of class FullTime
     */
    public FullTime()
    {
        
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void setSalary(double salary)
    {
        this.salary = salary;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public double getSalary()
    {
        return salary;
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
                     String.format("\nSalary: $%,.2f", salary);
        return str;
    }
}

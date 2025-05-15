
/**
 * FullTime class holds the salary for fulltime employees. Extends the employee and person
 * classes.
 *
 * @author Jordan Byrne
 * @version v1.0
 * @since 5/15/25
 */
public class FullTime extends Employee
{
    private double salary;

    /**
     * Constructor for objects of class FullTime. Sets the salary and also calls the super
     * constructor.
     * 
     * @param  name  inputted name of the employee
     * @param  year  inputted start year of the employee
     * @param  idNum  inputted ID number of the employee
     * @param  salary  inputted annual salary of the employee
     */
    public FullTime(String name, int year, String idNum, double salary)
    {
        super(name, year, idNum);
        this.salary = salary;
    }
    
    /**
     * No-args Constructor for objects of class FullTime. Sets salary to 0.
     */
    public FullTime()
    {
        super();
        salary = 0.0;
    }
    
    /**
     * Method is a setter for salary.
     *
     * @param  salary   the inputted salary of the employee
     */
    public void setSalary(double salary)
    {
        this.salary = salary;
    }

    /**
     * Method is a getter for salary.
     *
     * @return   the salary field
     */
    public double getSalary()
    {
        return salary;
    }
    
    /**
     * Method is a toString for the FullTime class. Displays information about the object.
     *
     * @return  str   the employee's information string
     */
    public String toString()
    {
        String str = super.toString() +
                     String.format("\nSalary: $%,.2f", salary);
        return str;
    }
}


/**
 * Adjunct classes holds information about hours and hourly rate for part time employees.
 *
 * @author Jordan Byrne
 * @version v1.0
 * @since 5/15/25
 */
public class Adjunct extends Employee
{
    private double hours, hrRate;

    /**
     * No-args Constructor for objects of class Adjunct. Sets fields to 0.
     */
    public Adjunct()
    {
        super();
        hours = 0.0;
        hrRate = 0.0;
    }

    /**
     * Constructor for objects of class Adjunct. Sets hours and rate and calls the super
     * class constructor.
     */
    public Adjunct(String name, int year, String idNum, double hours, double hrRate)
    {
        super(name, year, idNum);
        this.hours = hours;
        this.hrRate = hrRate;
    }

    /**
     * Method is a getter for the salary of the employee.
     *
     * @return    the hours times the hourly rate
     */
    public double getSalary()
    {
        return (hours*hrRate);
    }

    /**
     * This method is a toString for the Adjunct class. Displays information about
     * the hours, hourly rate, and salary of the employee.
     *
     * @return   str   the employee's information string
     */
    public String toString()
    {
        String str = super.toString() +
            String.format("\nHours: %.2f",hours) +
            String.format("\tHourly Rate: %.2f", hrRate) +
            String.format("\tSalary: $%,.2f", getSalary());
        return str;
    }
}

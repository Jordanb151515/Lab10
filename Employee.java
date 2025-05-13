
/**
 * Employee class takes and stores information relating to the person's id number
 * and the year they were hired. Extends the person class.
 *
 * @author Jordan Byrne
 * @version v1.0
 * @since 5/13/25
 */
public class Employee extends Person
{
    // instance variables - replace the example below with your own
    private int hireYear;
    private String idNum;

    /**
     * Constructor for objects of class Employee
     */
    public Employee()
    {
        super();
        hireYear = 0;
        idNum = "Onboarding";
    }

    /**
     * Constructor for objects of class Employee
     */
    public Employee(String name, int hireYear, String idNum)
    {
        super(name);
        this.hireYear = hireYear;
        this.idNum = idNum;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public boolean equals (Object o){
        boolean isEqual = false;
        if (o != null && getClass()==o.getClass()){
            Employee copy = (Employee)o;
            if (idNum.equalsIgnoreCase(copy.idNum))
                isEqual = true;
        }
        return isEqual;
    }

    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int getServiceYears()
    {
        return (CURRENT_YEAR - hireYear);
    }
    
    /**
     * Method is a setter for the year hired.
     *
     * @param  hireYear  year employee was hired
     */
    public void setHireDate(int hireYear)
    {
        this.hireYear = hireYear;
    }
    
    /**
     * Method is a getter for the date hired.
     *
     * @return    the hireYear field
     */
    public int getHireDate()
    {
        return hireYear;
    }
    
    /**
     * Method is a setter for id number.
     *
     * @param  idNum is the inputted id number for the employee
     */
    public void setIdNum(String idNum)
    {
        this.idNum = idNum;
    }
    
    /**
     * Method is a getter for id number.
     *
     * @return    the idNum field
     */
    public String getIdNum()
    {
        return idNum;
    }
    
    /**
     * Employee toString consisting of name, id number, year hired, and years 
     * of service.
     *
     * @return    the string of employee
     */
    public String toString()
    {
        String str = super.toString() + 
                     String.format("\nID Number: ", idNum) +
                     String.format("\nYear Hired: ", hireYear) +
                     String.format("\tYears of Service: ", getServiceYears());
        return str;
    }
}

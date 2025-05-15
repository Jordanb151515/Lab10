
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
    private int hireYear;
    private String idNum;

    /**
     * No-args Constructor for objects of class Employee. Calls the super class constructor.
     */
    public Employee()
    {
        super();
        hireYear = 0;
        idNum = "Onboarding";
    }

    /**
     * Constructor for objects of class Employee. Sets year hired and ID number and
     * calls the superclass constructor.
     */
    public Employee(String name, int hireYear, String idNum)
    {
        super(name);
        this.hireYear = hireYear;
        this.idNum = idNum;
    }

    /**
     * Method tests to see if two objects are equal.
     *
     * @param  o  is the object being tested to the object calling the method
     * @return  boolean isEqual for if condition was true or false
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
     * Method is a getter for the years in service.
     *
     * @return    the current year minus the year hired
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
                     String.format("\nID Number: %s", idNum) +
                     String.format("\nYear Hired: %d", hireYear) +
                     String.format("\tYears of Service: %d", getServiceYears());
        return str;
    }
}

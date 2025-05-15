
/**
 * Application demonstrates classes FullTime, Adjunct, Employee, and Person by creating a 
 * list of the employees and there information.
 *
 * @author Jordan Byrne
 * @version v1.0
 * @since 5/15/25
 */
public class HRDemo
{
    public static void main(String[] args){
        int index;
        boolean flag = false;
        
        //create employee objects
        FullTime fred = new FullTime("Flinstone, Fred", 2013, "BR-1", 75000.1234);
        Adjunct barney = new Adjunct("Rubble, Barney", 2014, "BR-2", 320, 60.55);
        FullTime wilma = new FullTime();
        wilma.setName("Flintstone, Wilma");
        wilma.setIdNum("BR-3");
        wilma.setHireDate(2016);
        wilma.setSalary(78123.2468);
        Employee betty = new Employee("Rubble, Betty", 2020, "BR-4");
        FullTime wilma2 = new FullTime("Slate, Wilma", 2016, "BR-3", 78123.2468);
        
        //print out objects
        Person[] staff = {fred, barney, wilma, betty, wilma2};
        index = 0;
        for(Person object: staff){
           System.out.print("\nEmployee " + (index+1));
           System.out.print("\n" + object + "\n");
           index++;
        }
        
        //check to see is wilma and wilma2 are same person
        flag = wilma.equals(wilma2);
        if(flag){
           wilma.setName("Slate, Wilma");
           System.out.print("\nwilma and wilma2 are the same person: true\n");
        }
        
        //print out objects again
        Person[] staff2 = {fred, barney, wilma, betty};
        index = 0;
        for(Person object: staff2){
           System.out.print("\nEmployee " + (index+1));
           System.out.print("\n" + object + "\n");
           index++;
        }
    }
}

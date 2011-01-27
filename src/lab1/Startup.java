package lab1;

/**
 * In this lab your challenge is to fix the code in both classes to use
 * proper encapsulation and best practices as explained by your instructor.
 *
 * @author jlombardo
 */
public class Startup {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.firstName = "Peter";
        employee.lastName = "Piper";
        employee.ssn = "333-1234";
        employee.meetWithHrForBenefitAndSalryInfo();
        employee.meetDepartmentStaff();
        employee.reviewDeptPolicies();
        String status = employee.getStatus();

        if(status.equals("New Hire")) {
            System.out.println("Something went wrong with your code!"
                    + " Should be 'Regular Employee'");
        } else {
            System.out.println(employee.firstName + " " + employee.lastName
                    + " born on " + employee.birthDate.toString()
                    + " SSN: " + employee.ssn + " is a " + employee.getStatus()
                    + " located a Cube No. " + employee.cubeId);
        }
    }
    
    
}

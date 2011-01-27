package lab1;

import java.util.Date;

/**
 * In this lab your challenge is to fix the code in both classes to use
 * proper encapsulation and best practices as explained by your instructor.
 *
 * @author jlombardo
 */
public class Employee {
    String firstName;
    String lastName;
    public String ssn;
    public Date birthDate;
    private boolean orientationCompleted;
    boolean metWithHr;
    boolean metDeptStaff;
    boolean revieweddeptPolicies;
    boolean movedIn;
    String cubeId;

    public Employee() {

    }

    public void completeOrientation() {
        if(metWithHr && metDeptStaff
           && revieweddeptPolicies && movedIn) {
              orientationCompleted = true;
        }
    }

    public void meetWithHrForBenefitAndSalryInfo() {
        this.metWithHr = true;
    }

    public void meetDepartmentStaff() {
        this.metDeptStaff = true;
    }

    public void reviewDeptPolicies() {
        this.revieweddeptPolicies = true;
    }

    public void moveIntoCubicle(String cubeId) {
        this.cubeId = cubeId;
        this.movedIn = true;
    }

    public String getStatus() {
        if(this.orientationCompleted) {
            return "Regular Employee";
        } else {
            return "New Hire";
        }
    }
}

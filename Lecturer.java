

public class Lecturer extends Teacher
{
    private String department;
    private int yearsOfExperience;
    private int gradedScore;
    private Boolean hasGraded;
    
    // paramaterized constructor
    public Lecturer(int teacherID, String teacherName, String address, String workingType, String employmentStatus,
                    int workingHour,String Department,int YearOfExperience)
    {
        super(teacherID,teacherName,address,workingType,employmentStatus);
        this.department = Department;
        this.yearsOfExperience = YearOfExperience;
        this.gradedScore=0;
        this.hasGraded=false;
    }
    //creating accessor method
    public String getDepartment()
    {
        return this.department;   
    }
    
    public int getYearsOfExperience()
    {
        return this.yearsOfExperience;
    }
    
    public int getGradedScore()
    {
        return this.gradedScore;
    }
    
    public Boolean getHasGraded()
    {
        return this.hasGraded;
    }
    
    //Creating mutator method
    
    public void setGradedScore(int gradedScore)
    {
        this.gradedScore=gradedScore;
    }
    
    //creating method named GradeAssignment which grades assignment submitted on time
    
    public void gradeAssignment(int gradedScore, String department, int YearsOfExperience)
    {
        if ( yearsOfExperience>=5 && this.department==department)
        {
            if(gradedScore>=70)
                {
                    System.out.println("The garde of the Student is A");
                }
            else if (gradedScore>=60)
                {
                    System.out.println("The garde of the Student is B");
                }
            else if (gradedScore>=50)
                {
                    System.out.println("The garde of the Student is C");
                }   
            else if (gradedScore>=40)
                {
                    System.out.println("The garde of the Student is D");
                }
            else 
                {
                    System.out.println("The garde of the Student is E");
                }
            hasGraded=true;
        }
        else
        {
            System.out.println("The lecturer criteria dosenot match");
        }
    }
    /*display/output section
    override syntax is used such that the compiler focus on the current operation aka updated version
    */
    @Override
    public void display()
    {
        super.display();
        System.out.println("The Department of the teacher is "+department);
        System.out.println("The teacher has "+yearsOfExperience+" year of experience");
        
        if(hasGraded)
        {
            System.out.println("The teacher has graded score is "+gradedScore);
        }
        else
        {
            System.out.println("The teacher has not yet graded");
        }
    }
}

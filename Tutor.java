
public class Tutor extends Teacher
{
    //Creating instance variables
    private double salary;
    private String specialization;
    private String academicQualifications;
    private int performanceIndex;
    private Boolean isCertified;
    
    //Creating paramaterized constructor
    public Tutor(int teacherID, String teacherName, String address, String workingType,
                 String employmentStatus, int workingHours, double salary, String specialization, String academicQualifications,
                    int performanceIndex)
    {
        super(teacherID,teacherName,address,workingType,employmentStatus);
        setWorkinghours(workingHours);        //setter method calling
        this.salary=salary;
        this.specialization=specialization;
        this.academicQualifications = academicQualifications;
        this.performanceIndex = performanceIndex;
        this.isCertified=false;
    }
    
    //Creating accessor method
    public double getSalary()
    {
        return this.salary;
    }
    
    public String getSpecialization()
    {
        return this.specialization;
    }
    
    public String getAcademicQualifications()
    {
        return this.academicQualifications;
    }
    
    public int getPerformanceIndex()
    {
        return this.performanceIndex;
    }
    
    //Creating mutator/setter method
    
    public void setSalary( double salary,int performanceIndex)
    {
        if(performanceIndex>5 && getWorkingHours()>20)
        {
            if(performanceIndex>=5 && performanceIndex<=7)
                {
                    this.salary=salary+(salary*5/100);
                }
            else if(performanceIndex>=8 && performanceIndex<=9)
                {
                    this.salary=salary+(salary*10/100);
                }
            else
                {
                    this.salary=salary+(salary*20/100);
                }
            this.isCertified=true;
            System.out.println("The teacher salary appraisal approved");
        }
        else
            {
                System.out.println("The teacher is not yet certified such that salary is not approved");
            }
    }
    
    public void removerTutor()
    {
        if(isCertified)
        {
            System.out.println("Congratulations tutor can continue your work");
        }
        else
        {
            System.out.println("Sorry, tutor have been fired because tutor was not certified");
            this.salary=0;
            this.specialization="";
            this.academicQualifications="";
            this.performanceIndex=0;
            this.isCertified=false;
        }
    }
    
    /*display/output section
    override syntax is used such that the compiler focus on the current operation aka updated varsion
    */
    @Override
    public void display()
    {
        super.display();
        if(isCertified)
        {
            System.out.println("The salary of the tutor is "+salary);
            System.out.println("The tutor is specialized in "+specialization);
            System.out.println("The academic qualification of the tutor is "+academicQualifications);
            System.out.println("The performance index of the tutor is "+ performanceIndex);
        }
    }
}

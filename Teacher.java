
public class Teacher
{
    //creating instance variables
    private String teacherName;
    private String address;
    private String workingType;
    private String employmentStatus;
    private int teacherID;
    private int workingHours;
    
    //Paramaterized constructor 
    public Teacher(int teacherID, String teacherName, String address, String workingType, String employmentStatus)
    {
        this.teacherID = teacherID;
        this.teacherName = teacherName;
        this.address = address;
        this.workingType = workingType;
        this.employmentStatus = employmentStatus;
    }
    
    // creating getter method (accessoor method)
    public String getTeacherName()
    {
        return this.teacherName;
    }
    
    public String getAddress()
    {
        return this.address;
    }
    
    public String getWorkingType()
    {
        return this.workingType;
    }
    
    public String getEmoloymentStatus()
    {
        return this.employmentStatus;
    }
    
    public int getTeacherID()
    {
        return this.teacherID;
    }
    
    public int getWorkingHours()
    {
        return this.workingHours;
    }
    
    // Creating setter method (mutator method)
    
    public void setWorkinghours(int workingHours)
    {
        this.workingHours = workingHours;
    }
    
    //displaying method output 
    
    public void display()
    {
        System.out.println("The teacher ID is "+teacherID);
        System.out.println("The teacher name is "+teacherName);
        System.out.println("The address of teacher is "+address);
        System.out.println("The post of teacher is:"+workingType);
        System.out.println("The current employment status is:  "+employmentStatus);
        if (workingHours==0)
        {
            System.out.println("The working hours is not assainged.");
        }
        else
        {
            System.out.println("The working hours is "+workingHours);
        }
    }
    
    
}

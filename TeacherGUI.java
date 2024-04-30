import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;

public class TeacherGUI implements ActionListener{
    private ArrayList<Teacher> teacherList;
    private JFrame TeacherGUI;
    private int lteacher_ID,lworking_Hours,lyearsOfExperience;
    private JLabel background,heading,Logo_,paragraph,try_,teacherID,teacherName,department,WorkingType,WorkingHour,employmentstatus,address,yearsOfExperience;
    private JLabel t_teacherID,t_teacherName,t_address,t_WorkingType,t_WorkingHour,t_employmentstatus,t_setSalary,t_specialization,t_academicQualifications,t_performanceIndex;//for tutor
    private JTextField forteacherID,forteacherName,fordepartment,forWorkingType,forWorkingHour,foremploymentstatus,foraddress,foryearsOfExperience;
    private JTextField t_forteacherID,t_forteacherName,t_foraddress,t_forWorkingType,t_forWorkingHour,t_foremploymentstatus,t_forsetSalary,t_forspecialization,t_foracademicQualifications,t_forperformanceIndex;//for tutor
    private JPanel select,p_Lecturer,t_panel;
    private ImageIcon back,Logo,try_1;
    private JButton Lecturer,Tutor,Quit,Add,GradeAssignment,Display,Clear,Previous,Back;
    private JButton t_Add,t_salary,t_Display,t_Clear,t_Previous,t_Back,t_RemoveTutor;//for tutor
    private int teacher_ID,working_Hours,performanceIndex;
    private double check_salary;
    //Creating the pattern for the word
   private  String wordPattern = "^[a-zA-Z\\s]+$";
    
    //Creating constructor  
    public TeacherGUI(){
        //Implementing arraylist
        teacherList = new ArrayList<>();
        //Creating JFrame for TeacherGUI
        TeacherGUI = new JFrame();
        
        //Heading of JFrame
        heading = new JLabel("Teacher Management System");// Creating the label for heading 
        Font fhead = new Font("inter", Font.PLAIN, 26);//Declaring the font for heading
        heading.setFont(fhead);//Setting the font of heading
        heading.setBounds(410,71,477,47);//Setting the size of heading
        TeacherGUI.add(heading);//adding the heading to teacherGUI
        
        
        //Creating ImageIcon and JLabel for Logo of college
        Logo = new ImageIcon(getClass().getResource("/logo.png"));
        Logo_ = new JLabel(Logo);
        Logo_.setBounds(979,6,150,180);//Setting the size of logo
        TeacherGUI.add(Logo_);//Adding the logo to frame
        
        //Creating JPanel for selection part
        select = new JPanel();
        select.setBounds(236,190,825,571);
        TeacherGUI.add(select);//Adding JPanel to JFrame
        
        //Creating the JLabel for selection part in JPanel
        paragraph =  new JLabel("Please select the option of which the data want to be entered");
        Font fpara = new Font("inter", Font.PLAIN,20);//Declaring the font for paragraph
        paragraph.setFont(fpara);//Settiing the  font for paragraph
        paragraph.setBounds(41,282,564,73);
        select.add(paragraph);//Addding paragraph to panel
        
        //Creating Buttons needed in JPanel options
        Lecturer = new JButton("Lecturer");
        Lecturer.setBounds(565,188,219,72);//Setting the size of Lecturer
        select.add(Lecturer);//Addding Lecturer to panel
        
        Tutor = new JButton("Tutor");
        Tutor.setBounds(565,377,219,72);//Setting size of Tutor
        select.add(Tutor);//Adding to panel
        
        Quit = new JButton("Close");
        Quit.setBounds(237,484,219,72);//Setting size of Quit
        select.add(Quit);//Adding quit to panel
        
        //Adding the button to ActionLISTENER  
        Lecturer.addActionListener(this);
        Tutor.addActionListener(this);
        Quit.addActionListener(this);
        
        //Setting the background color of all button
        Lecturer.setBackground(new java.awt.Color(198, 99, 99));
        Tutor.setBackground(new java.awt.Color(198, 99, 99));
        Quit.setBackground(new java.awt.Color(198, 99, 99));

        //Creating the font of buttons for selection part in JPanel
        Font fbutton = new Font("inter", Font.PLAIN, 20);//Declaring the font for buttons
        
        // Setting the text color of the Lecturer button to yellow
        Lecturer.setForeground(Color.YELLOW); 
        Tutor.setForeground(Color.YELLOW); 
        Quit.setForeground(Color.YELLOW); 

        //Lecturer.setTextColor(new java.awt.Color(YELLOW));
        Lecturer.setFont(fbutton);//Setting the font of buttons
        Tutor.setFont(fbutton);//Setting the font of buttons
        Quit.setFont(fbutton);//Setting the font of buttons
        
        //Creating ImageIcon and JLabel for Logo for image
        try_1 = new ImageIcon(getClass().getResource("/try.png"));
        try_ = new JLabel(try_1);
        try_.setBounds(95,14,351,209);//Setting the size of logo
        select.add(try_);//Adding the logo to frame
        
        
        select.setLayout(null);//Seting the layout of panel null
                
        //Creating the panel for Lecturer
        p_Lecturer = new JPanel();
        p_Lecturer.setBounds(236,190,825,571);
        p_Lecturer.setLayout(null);//Setting the layout of panel lecturer
        TeacherGUI.add(p_Lecturer);//Adding JPanel to JFrame
        p_Lecturer.setVisible(false);//
        
        //Creating JLabel for Lecturer
        teacherID = new JLabel("Teacher ID:");
        teacherID.setBounds(23,45,149,33);
        
        //Creacting JLabel for Lecturer
        teacherName = new JLabel("Teacher name:");
        teacherName.setBounds(23,91,163,50);

        //Creacting JLabel for Lecturer
        address = new JLabel("Address:");
        address.setBounds(450,91,80,50);
        
        //Creacting JLabel for Lecturer
        department = new JLabel("Department:");
        department.setBounds(23,156,163,50);

        //Creacting JLabel for Lecturer
        yearsOfExperience = new JLabel("Years Of Experience:");
        yearsOfExperience.setBounds(450,157,190,50);

        //Creacting JLabel for Lecturer
        WorkingType = new JLabel("Working Type:");
        WorkingType.setBounds(23,221,180,42);
        
        //Creacting JLabel for Lecturer
        WorkingHour = new JLabel("Working Hour:");
        WorkingHour.setBounds(450,221,214,50);
        
        //Creacting JLabel for Lecturer
        employmentstatus = new JLabel("Employment Status:");
        employmentstatus.setBounds(23,278,281,42);
        
        


        
        
        //Creating JTextField for Lecturer
        forteacherID = new JTextField();
        forteacherID.setBounds(140,45,182,25);
        
        //Creating JTextField for Lecturer
        forteacherName = new JTextField();
        forteacherName.setBounds(165,105,182,25);

        //Creating JTextField for Lecturer
        foraddress = new JTextField();
        foraddress.setBounds(550,105,182,25);
        
        //Creating JTextField for Lecturer
        fordepartment = new JTextField();
        fordepartment.setBounds(155,169,182,25);

        //Creating JTextField for Lecturer
        foryearsOfExperience = new JTextField();
        foryearsOfExperience.setBounds(638,173,170,25);
        
        //Creating JTextField for Lecturer
        forWorkingType = new JTextField();
        forWorkingType.setBounds(180,230,182,25);

        //Creating JTextField for Lecturer
        forWorkingHour = new JTextField();
        forWorkingHour.setBounds(600,230,182,25);

        //Creating JTextField for Lecturer
        foremploymentstatus = new JTextField();
        foremploymentstatus.setBounds(200,290,182,25);

        //Creating necessary Jbutton
        Add = new JButton("Add");
        Add.setBounds(2,363,140,67);
        
        //Creating necessary Jbutton
        GradeAssignment = new JButton("Grade Assignment");
        GradeAssignment.setBounds(160,363,200,67);
        
        //Creating necessary Jbutton
        Display = new JButton("Display");
        Display.setBounds(400,363,172,67);
        
        //Creating necessary Jbutton
        Clear = new JButton("Clear");
        Clear.setBounds(580,361,172,67);
        
        //Creating necessary Jbutton
        Previous = new JButton("Previous");
        Previous.setBounds(122,462,172,67);
        
        //Creating necessary Jbutton
        Back = new JButton("Quit");
        Back.setBounds(450,462,172,67);
        
        //Setting the background of the button
        Add.setBackground(new java.awt.Color(198, 99, 99));
        GradeAssignment.setBackground(new java.awt.Color(198, 99, 99));
        Display.setBackground(new java.awt.Color(198, 99, 99));
        Clear.setBackground(new java.awt.Color(198, 99, 99));
        Previous.setBackground(new java.awt.Color(198, 99, 99));
        Back.setBackground(new java.awt.Color(198, 99, 99));
        
        //Setting the font color aka forgrount of button
        Add.setForeground(Color.YELLOW); 
        GradeAssignment.setForeground(Color.YELLOW); 
        Display.setForeground(Color.YELLOW); 
        Clear.setForeground(Color.YELLOW); 
        Previous.setForeground(Color.YELLOW); 
        Back.setForeground(Color.YELLOW); 
        
        //Declaring font for all JLabel in Lecturer and Tutor
        Font label = new Font("inter", Font.PLAIN, 20);
        
        
        //Setting font
        teacherID.setFont(label);
        teacherName.setFont(label);
        department.setFont(label);
        WorkingType.setFont(label);
        WorkingHour.setFont(label);
        employmentstatus.setFont(label);
        address.setFont(label);
        yearsOfExperience.setFont(label);
        forteacherID.setFont(label);
        forteacherName.setFont(label);
        fordepartment.setFont(label);
        forWorkingType.setFont(label);
        forWorkingHour.setFont(label);
        foremploymentstatus.setFont(label);
        foraddress.setFont(label);
        foryearsOfExperience.setFont(label);
        Add.setFont(label);
        GradeAssignment.setFont(label);
        Display.setFont(label);
        Clear.setFont(label);
        Previous.setFont(label);
        Back.setFont(label);
        
        //Adding all the lecturer components to lecturer panel
        p_Lecturer.add(teacherID);
        p_Lecturer.add(teacherName);
        p_Lecturer.add(address);
        p_Lecturer.add(department);
        p_Lecturer.add(yearsOfExperience);
        p_Lecturer.add(WorkingType);
        p_Lecturer.add(WorkingHour);
        p_Lecturer.add(employmentstatus);
        p_Lecturer.add(forteacherID);
        p_Lecturer.add(forteacherName);
        p_Lecturer.add(foraddress);
        p_Lecturer.add(fordepartment);
        p_Lecturer.add(foryearsOfExperience);
        p_Lecturer.add(forWorkingType);
        p_Lecturer.add(forWorkingHour); 
        p_Lecturer.add(foremploymentstatus);
        p_Lecturer.add(Add);
        p_Lecturer.add(GradeAssignment);
        p_Lecturer.add(Display);
        p_Lecturer.add(Clear);
        p_Lecturer.add(Previous);
        p_Lecturer.add(Back);
        
        //Adding the button to ACTIONLISTENER
        Add.addActionListener(this);
        GradeAssignment.addActionListener(this);
        Display.addActionListener(this);
        Clear.addActionListener(this);
        Previous.addActionListener(this);
        Back.addActionListener(this);
        
        
        //Start of Tutor panel
        
        //Creating the new panel for Tutor
        t_panel = new JPanel();
        
        //Setting the layout for panel Tutor
        t_panel.setBounds(236,190,825,571);
        TeacherGUI.add(t_panel);
        t_panel.setLayout(null);
        t_panel.setVisible(false);

        
        //Creating JLabel for Tutor
        t_teacherID = new JLabel("Teacher ID:");
        t_teacherID.setBounds(23,45,149,33);
        
        //Creacting JLabel for Tutor
        t_teacherName = new JLabel("Teacher name:");
        t_teacherName.setBounds(23,91,163,50);

        //Creacting JLabel for Tutor
        t_address = new JLabel("Address:");
        t_address.setBounds(435,91,163,50);

        //Creacting JLabel for Tutor
        t_WorkingType = new JLabel("Working Type:");
        t_WorkingType.setBounds(23,156,176,50);
        
        //Creacting JLabel for Tutor
        t_WorkingHour = new JLabel("Working Hour:");
        t_WorkingHour.setBounds(435,157,214,50);
        
        //Creacting JLabel for Tutor
        t_employmentstatus = new JLabel("Employment Status:");
        t_employmentstatus.setBounds(23,221,281,42);
        
        //Creacting JLabel for Tutor
        t_setSalary = new JLabel("Salary:");
        t_setSalary.setBounds(23,278,183,50);

        //Creating JLabel for Tutor
        t_specialization = new JLabel("Specialization:");
        t_specialization.setBounds(435,221,214,50);
        
        //Creating JLabel for Tutor
        t_academicQualifications = new JLabel("Academic Qualifications:");
        t_academicQualifications.setBounds(435,278,230,50);

        //Creating JLabel for Tutor
        t_performanceIndex = new JLabel("Performance Index:");
        t_performanceIndex.setBounds(23,322,214,50);  

        
        //Creating JTextField for Tutor
        t_forteacherID = new JTextField();
        t_forteacherID.setBounds(140,45,182,25);
        
        //Creating JTextField for Tutor
        t_forteacherName = new JTextField();
        t_forteacherName.setBounds(165,105,182,25);
        
        //Creating JTextField for Tutor
        t_foraddress = new JTextField();
        t_foraddress.setBounds(525,105,182,25);
        
        //Creating JTextField for Tutor
        t_forWorkingType = new JTextField();
        t_forWorkingType.setBounds(155,169,182,25);
        
        //Creating JTextField for Tutor
        t_forWorkingHour = new JTextField();
        t_forWorkingHour.setBounds(575,173,182,25);
        
        //Creating JTextField for Tutor
        t_foremploymentstatus = new JTextField();
        t_foremploymentstatus.setBounds(205,230,182,25);

        //Creating JTextField for Tutor
        t_forspecialization = new JTextField();
        t_forspecialization.setBounds(575,230,182,25);
        
        //Creating JTextField for Tutor
        t_forsetSalary = new JTextField();
        t_forsetSalary.setBounds(110,290,182,25);

        //Creating JTextField for Tutor
        t_foracademicQualifications = new JTextField();
        t_foracademicQualifications.setBounds(655,290,150,25);

        //Creating JTextField for Tutor
        t_forperformanceIndex = new JTextField();
        t_forperformanceIndex.setBounds(205,335,182,25);
        
        //Creating necessary Jbutton
        t_Add = new JButton("Add");
        t_Add.setBounds(2,380,140,67);
        
        
        //Creating necessary Jbutton
        t_salary = new JButton("Set Salary");
        t_salary.setBounds(160,380,200,67);
        
        
        //Creating necessary Jbutton
        t_Display = new JButton("Display");
        t_Display.setBounds(400,380,172,67);
        
        //Creating necessary Jbutton
        t_Clear = new JButton("Clear");
        t_Clear.setBounds(580,380,172,67);
        
        //Creating necessary Jbutton
        t_Previous = new JButton("Previous");
        t_Previous.setBounds(100,462,172,67);
        
        //Creating necessary Jbutton
        t_RemoveTutor = new JButton("Remove Tutor");
        t_RemoveTutor.setBounds(300,462,172,67);
        
        //Creating necessary Jbutton
        t_Back = new JButton("Quit");
        t_Back.setBounds(500,462,172,67);
        
        //Setting the background of the button
        t_Add.setBackground(new java.awt.Color(198, 99, 99));
        t_salary.setBackground(new java.awt.Color(198, 99, 99));
        t_Display.setBackground(new java.awt.Color(198, 99, 99));
        t_Clear.setBackground(new java.awt.Color(198, 99, 99));
        t_Previous.setBackground(new java.awt.Color(198, 99, 99));
        t_RemoveTutor.setBackground(new java.awt.Color(198, 99, 99));
        t_Back.setBackground(new java.awt.Color(198, 99, 99));
        
        //Setting the font color aka forground of button
        t_Add.setForeground(Color.YELLOW); 
        t_salary.setForeground(Color.YELLOW); 
        t_Display.setForeground(Color.YELLOW); 
        t_Clear.setForeground(Color.YELLOW); 
        t_Previous.setForeground(Color.YELLOW); 
        t_RemoveTutor.setForeground(Color.YELLOW);
        t_Back.setForeground(Color.YELLOW); 
        
        //Setting the font for JButton
        t_teacherID.setFont(label);
        t_teacherName.setFont(label);
        t_address.setFont(label);
        t_WorkingType.setFont(label);
        t_WorkingHour.setFont(label);
        t_employmentstatus.setFont(label);
        t_specialization.setFont(label);
        t_setSalary.setFont(label);
        t_academicQualifications.setFont(label);
        t_performanceIndex.setFont(label);
        t_forteacherID.setFont(label);
        t_forteacherName.setFont(label);
        t_foraddress.setFont(label);
        t_forWorkingType.setFont(label);
        t_forWorkingHour.setFont(label);
        t_foremploymentstatus.setFont(label);
        t_forspecialization.setFont(label);
        t_foracademicQualifications.setFont(label);
        t_forperformanceIndex.setFont(label);
        t_salary.setFont(label);
        t_forsetSalary.setFont(label);
        t_Add.setFont(label);
        t_salary.setFont(label);
        t_Display.setFont(label);
        t_Clear.setFont(label);
        t_Previous.setFont(label);
        t_RemoveTutor.setFont(label);
        t_Back.setFont(label);
        
        
        //Adding all the necessary label and textfield for tutor panel
        t_panel.add(t_teacherID);
        t_panel.add(t_teacherName);
        t_panel.add(t_address);
        t_panel.add(t_WorkingType);
        t_panel.add(t_WorkingHour);
        t_panel.add(t_employmentstatus);
        t_panel.add(t_specialization);
        t_panel.add(t_academicQualifications);
        t_panel.add(t_performanceIndex);
        t_panel.add(t_forteacherID);
        t_panel.add(t_forteacherName);
        t_panel.add(t_foraddress);
        t_panel.add(t_forWorkingType);
        t_panel.add(t_forWorkingHour);
        t_panel.add(t_foremploymentstatus);
        t_panel.add(t_forspecialization);
        t_panel.add(t_foracademicQualifications);
        t_panel.add(t_forperformanceIndex);
        t_panel.add(t_setSalary);
        t_panel.add(t_forsetSalary);
        t_panel.add(t_Add);
        t_panel.add(t_salary);
        t_panel.add(t_Display);
        t_panel.add(t_Back);
        t_panel.add(t_Clear);
        t_panel.add(t_Back);
        t_panel.add(t_RemoveTutor);
        t_panel.add(t_Previous);
        
        //Adding the button to ACTIONLISTENER
        t_Add.addActionListener(this);
        t_salary.addActionListener(this);
        t_Display.addActionListener(this);
        t_Clear.addActionListener(this);
        t_Previous.addActionListener(this);
        t_RemoveTutor.addActionListener(this);
        t_Back.addActionListener(this);
        
        
        
        //Creating a background for Frame Teacher GUI
        back = new ImageIcon(getClass().getResource("/background.png"));//Declaring image icon and calling the image  get resource helps to get the image
        background = new JLabel(back);/*Decelaring JLabel background to set background of Frame 
                                                        the back gives to the image*/
        background.setBounds(0,0,1280,832);//Giving position for JLabel
        TeacherGUI.add(background);//Adding JLAbel as background for frame
        
        //Setting various properties for Frame "TeacherGUI"
        TeacherGUI.setTitle("TeacherGUI");
        TeacherGUI.setLayout(null);
        TeacherGUI.setVisible(true);
        TeacherGUI.setSize(1280,832);
        
    }
    //main function
        public static void main(String[] args){
            new TeacherGUI();
        }

    //Adding different EventHandeling functions in the buttons
    @Override
    public void actionPerformed(ActionEvent e){
        
        if(e.getSource() == Quit){//checking if the user clicked the quit button in main panel
            TeacherGUI.dispose();
        }
        else if(e.getSource() == Lecturer){//Checking if the user wants to enter Lecturer
            select.setVisible(false);//It removes the main panel
            p_Lecturer.setVisible(true);//It shows the Lecturer panel
        }
        else if(e.getSource() == Tutor){//Checking if the user wants to enter Tutor 
            select.setVisible(false);//It removes the main panel
            t_panel.setVisible(true);//It shows the Tutor panel
        }
        //Checking if the user click any buttons in Lecturer Panel
        //Checking if the user wants to add the lecturer
        
        if(e.getSource() == Add){
            //Checking if the user added the correct Teacher ID
                
                //Declarin the variables to store the data
                String teacherID = forteacherID.getText();
                String teacherName = forteacherName.getText();
                String address = foraddress.getText();
                String Department = fordepartment.getText();
                String yearOfExperience = foryearsOfExperience.getText();
                String workingType = forWorkingType.getText();
                String workingHour = forWorkingHour.getText();
                String employmentStatus = foremploymentstatus.getText();   
                //Checkif the user added all the needed information
                if(teacherID.isEmpty() || teacherName.isEmpty() || address.isEmpty() || Department.isEmpty() || yearOfExperience.isEmpty() || workingType.isEmpty() || workingHour.isEmpty() || employmentStatus.isEmpty()){
                    JOptionPane.showMessageDialog(TeacherGUI,"Please Fill all the asked information","Alert",JOptionPane.WARNING_MESSAGE);  
                }
                else{
                    //Checking if the user added the correct data
                    if (teacherName.matches(wordPattern) && address.matches(wordPattern) && Department.matches(wordPattern) && workingType.matches(wordPattern) && employmentStatus.matches(wordPattern)){
                        // Checking if the user added correct pattern
                        try{
                            lteacher_ID =Integer.parseInt(forteacherID.getText());
                            lworking_Hours = Integer.parseInt(forWorkingHour.getText());
                            lyearsOfExperience = Integer.parseInt(foryearsOfExperience.getText());
                            
                         
                            //Checking if arraylist is empty or not
                            if(teacherList.isEmpty()){
                                //Adding the data to the ArrayList
                                Lecturer lecturer_list= new Lecturer(lteacher_ID, teacherName, address, workingType, employmentStatus, lworking_Hours, Department, lyearsOfExperience);
                                teacherList.add(lecturer_list);
    
                                //Showing the message if that the data is added successfully
                                JOptionPane.showMessageDialog(TeacherGUI,"Data Added Successfully","Success",JOptionPane.INFORMATION_MESSAGE);
    
                                //Setting the textfield to empty after the data is added  
                                forteacherID.setText("");
                                forteacherName.setText("");
                                fordepartment.setText("");
                                foryearsOfExperience.setText("");
                                foraddress.setText("");
                                forWorkingType.setText("");
                                forWorkingHour.setText("");
                                foremploymentstatus.setText("");
                            }else{
                                //Checking if the teacher ID is already added or not
                                boolean check = false;
                                for(Teacher teacher : teacherList){
                                    if(teacher.getTeacherID() == lteacher_ID){
                                        //Checking if the teacher ID is of lecturer 
                                        if(teacher instanceof Lecturer){
                                            check = true;
                                            break;
                                        }
                                    }
                                }
                                //If the teacher ID is already added then it will show the message
                                if(check){
                                    JOptionPane.showMessageDialog(TeacherGUI,"The Teacher ID is already added","Alert",JOptionPane.WARNING_MESSAGE);
                                }else{
                                    //Adding the data to the ArrayList
                                    Lecturer lecturer_list= new Lecturer(lteacher_ID, teacherName, address, workingType, employmentStatus, lworking_Hours, Department, lyearsOfExperience);
                                    teacherList.add(lecturer_list);
    
                                    //Showing the message if that the data is added successfully
                                    JOptionPane.showMessageDialog(TeacherGUI,"Data Added Successfully","Success",JOptionPane.INFORMATION_MESSAGE);
                                    
                                    //Setting the textfield to empty after the data is added  
                                    forteacherID.setText("");
                                    forteacherName.setText("");
                                    fordepartment.setText("");
                                    foryearsOfExperience.setText("");
                                    foraddress.setText("");
                                    forWorkingType.setText("");
                                    forWorkingHour.setText("");
                                    foremploymentstatus.setText("");
                                }
                            }
                        }catch (NumberFormatException a) {
                            JOptionPane.showMessageDialog(TeacherGUI,"Please Enter the Valid Data","Alert",JOptionPane.WARNING_MESSAGE);
                    }
                    }else{
                        JOptionPane.showMessageDialog(TeacherGUI,"Please Enter the Valid Data","Alert",JOptionPane.WARNING_MESSAGE);
                    }
            }  
        }
        //Checking if the user wants to grade the assignment
        else if(e.getSource() == GradeAssignment){
            if (teacherList.isEmpty()){
                JOptionPane.showMessageDialog(TeacherGUI,"No data to grade","Alert",JOptionPane.WARNING_MESSAGE);
            }
            else{
                for(Teacher teacher : teacherList){
                    if(teacher instanceof Lecturer){
                        // Downcasting
                        Lecturer lecturer = (Lecturer) teacher;
                        //Checking if the user entered the correct teacher ID
                        try{
                            int gra = Integer.parseInt(forteacherID.getText());
                            String dep = fordepartment.getText();
                            int yoe = Integer.parseInt(foryearsOfExperience.getText());
                            String YOE = Integer.toString(yoe);
                            if(forteacherID.getText().isEmpty() || dep.isEmpty() || YOE.isEmpty()){
                                JOptionPane.showMessageDialog(TeacherGUI,"Please enter all the required data to grade Assaignment\n Required Data:\n Teacher ID \n Department \n Year of Experience","Alert",JOptionPane.WARNING_MESSAGE);
                            }
                            else if (gra == teacher.getTeacherID() || dep.equals(lecturer.getDepartment()) || yoe == lecturer.getYearsOfExperience()){
                                //Taking the grade from the user
                                String grade = JOptionPane.showInputDialog("Grade Assaignment");
                                //Changing the string to integer
                                int grad = Integer.parseInt(grade);
                                try{
                                    //Checking if the user entered the correct grade
                                    int ch = Integer.parseInt(grade);
                                    if (ch >=0 && ch<=100){
                                        JOptionPane.showMessageDialog(TeacherGUI,"Grade Added Successfully","Success",JOptionPane.INFORMATION_MESSAGE);

                                        //Calling the method to grade the assignment
                                        lecturer.gradeAssignment(grad,dep,yoe);

                                        //clearing the textfield after the data is added   
                                        forteacherID.setText("");
                                        forteacherName.setText("");
                                        fordepartment.setText("");
                                        foryearsOfExperience.setText("");
                                    }
                                    else{
                                        JOptionPane.showMessageDialog(TeacherGUI,"Please enter the valid grade","Alert",JOptionPane.WARNING_MESSAGE);
                                    }
                                }catch(NumberFormatException b){
                                    JOptionPane.showMessageDialog(TeacherGUI," Please enter valid grade", "Alert", JOptionPane.WARNING_MESSAGE);
                                }
                            }
                            }catch(NumberFormatException a){
                                JOptionPane.showMessageDialog(TeacherGUI,"Please enter valid data\n Required Data:\n Teacher ID \n Department \n Year of Experience","Alert",JOptionPane.WARNING_MESSAGE);
                        }
                    }
                }
            }
        }
        //Checking if the user wants to display the data
        else if(e.getSource() == Display){
            //Showing the Lecturer data
            //Checking id the arraylist is empty or not
            if(teacherList.isEmpty()){
                JOptionPane.showMessageDialog(TeacherGUI,"No data to display","Alert",JOptionPane.WARNING_MESSAGE);
            }
            else {
                for (Teacher teacher : teacherList) {
                    if (teacher instanceof Lecturer) {
                        //Taking teacher ID as Input using JOptionPane
                        try{
                            int teacherID = Integer.parseInt(JOptionPane.showInputDialog("Enter Teacher ID"));
                            //Checking if the teacher ID is available in the ArrayList
                            if(teacherID == teacher.getTeacherID()){
                                //Downcasting
                                Lecturer lecturer = (Lecturer) teacher;

                                //Creating a StringBuilder object to store the message to display in the JOptionPane
                                StringBuilder displayMessage = new StringBuilder();

                                // Construct a string containing the tutor's information
                                displayMessage.append("Teacher ID: ").append(lecturer.getTeacherID()).append("\n");
                                displayMessage.append("Name: ").append(lecturer.getTeacherName()).append("\n");
                                displayMessage.append("Address: ").append(lecturer.getAddress()).append("\n");
                                displayMessage.append("department").append(lecturer.getDepartment()).append("\n");
                                displayMessage.append("Years of Experience: ").append(lecturer.getYearsOfExperience()).append("\n");
                                displayMessage.append("Working Type: ").append(lecturer.getWorkingType()).append("\n");
                                displayMessage.append("Working Hours: ").append(lecturer.getWorkingHours()).append("\n");
                                displayMessage.append("Employment Status: ").append(lecturer.getEmploymentStatus()).append("\n");
                                displayMessage.append("Graded Score: ").append(lecturer.getGradedScore()).append("\n");
                                displayMessage.append("\n"); // Add a separator between each tutor's information

                                // Display the message in a JOptionPane
                                JOptionPane.showMessageDialog(TeacherGUI, displayMessage.toString(), "Tutor Information", JOptionPane.INFORMATION_MESSAGE);
                            }else{
                                JOptionPane.showMessageDialog(TeacherGUI,"Teacher ID is not available","Alert",JOptionPane.WARNING_MESSAGE);
                            }
                        }catch(NumberFormatException a){
                            JOptionPane.showMessageDialog(TeacherGUI,"Please enter valid Teacher ID","Alert",JOptionPane.WARNING_MESSAGE);
                        }
                        
                    }
                }
        }
    }
        //Checking if the user wants to clear the textfield   
        else if(e.getSource() == Clear){
            forteacherID.setText("");
            forteacherName.setText("");
            fordepartment.setText("");
            foryearsOfExperience.setText("");
            foraddress.setText("");
            forWorkingType.setText("");
            forWorkingHour.setText("");
            foremploymentstatus.setText("");
        }
        //Checking if the user wants to go back to the main panel
        else if(e.getSource() == Previous){
            p_Lecturer.setVisible(false);
            select.setVisible(true);
        }
        //Checking if the user wants to quit the program
        else if(e.getSource() == Back){
            TeacherGUI.dispose();
        }
        
        
        //Checking if the user click any buttons in Tutor Panel
        //Checking if the user wants to add the tutor
        else
        if(e.getSource() == t_Add){
            //Declarin the variables to store the data
            String teacherID = t_forteacherID.getText();
            String teacherName = t_forteacherName.getText();
            String address = t_foraddress.getText();
            String workingType = t_forWorkingType.getText();
            String workingHour = t_forWorkingHour.getText();
            String employmentStatus = t_foremploymentstatus.getText();
            String specialization = t_forspecialization.getText();
            String salary = t_forsetSalary.getText();
            String academicQualifications = t_foracademicQualifications.getText();
            String performance = t_forperformanceIndex.getText();
            //Checkif the user added all the needed information
            if(teacherID.isEmpty() || teacherName.isEmpty() || address.isEmpty() || workingType.isEmpty() || workingHour.isEmpty() || employmentStatus.isEmpty() || specialization.isEmpty() || salary.isEmpty() || academicQualifications.isEmpty() || performance.isEmpty()){
                JOptionPane.showMessageDialog(TeacherGUI,"Please fill all the asked information","Alert",JOptionPane.WARNING_MESSAGE);  
            }
            else{
                if(teacherName.matches(wordPattern) && address.matches(wordPattern) && workingType.matches(wordPattern) && employmentStatus.matches(wordPattern) && specialization.matches(wordPattern) && academicQualifications.matches(wordPattern)){
                    //Checking if the user added the correct data
                    try{
                        teacher_ID = Integer.parseInt(t_forteacherID.getText());
                        working_Hours = Integer.parseInt(t_forWorkingHour.getText());
                        performanceIndex = Integer.parseInt(t_forperformanceIndex.getText());
                        check_salary = Double.parseDouble(t_forsetSalary.getText());
                    //Checking if arraylist is empty or not
                    if(teacherList.isEmpty()){

                        //Adding the data to the ArrayList
                        Tutor tutor_list = new Tutor(teacher_ID, teacherName, address, workingType, employmentStatus, working_Hours, check_salary, specialization, academicQualifications, performanceIndex);
                        teacherList.add(tutor_list);  

                        //Showing the message if the data is added successfully
                        JOptionPane.showMessageDialog(TeacherGUI,"Data Added Successfully","Success",JOptionPane.INFORMATION_MESSAGE);

                        //Setting the textfield to empty after the data is added
                        t_forteacherID.setText("");
                        t_forteacherName.setText("");
                        t_foraddress.setText("");
                        t_forWorkingHour.setText("");
                        t_forWorkingType.setText("");
                        t_foremploymentstatus.setText("");
                        t_forspecialization.setText("");
                        t_forsetSalary.setText("");
                        t_foracademicQualifications.setText("");
                        t_forperformanceIndex.setText("");
                    }else{
                        //Checking if the teacher ID is already added or not
                        boolean check = false;
                        for(Teacher teacher : teacherList){
                            if(teacher.getTeacherID() == teacher_ID){
                                //Checking if the teacher ID is of lecturer or tutor
                                if(teacher instanceof Tutor){
                                    check = true;
                                }
                            }
                        }
                        //If the teacher ID is already added then it will show the message
                        if(check){
                            JOptionPane.showMessageDialog(TeacherGUI,"Teacher ID is already added","Alert",JOptionPane.WARNING_MESSAGE);
                        }else{
                            //Adding the data to the ArrayList
                            Tutor tutor_list = new Tutor(teacher_ID, teacherName, address, workingType, employmentStatus, working_Hours, check_salary, specialization, academicQualifications, performanceIndex);
                            teacherList.add(tutor_list);

                            //Showing the message if the data is added successfully
                            JOptionPane.showMessageDialog(TeacherGUI,"Data Added Successfully","Success",JOptionPane.INFORMATION_MESSAGE);

                            //Setting the textfield to empty after the data is added
                            t_forteacherID.setText("");
                            t_forteacherName.setText("");
                            t_foraddress.setText("");
                            t_forWorkingHour.setText("");
                            t_forWorkingType.setText("");
                            t_foremploymentstatus.setText("");
                            t_forspecialization.setText("");
                            t_forsetSalary.setText("");
                            t_foracademicQualifications.setText("");
                            t_forperformanceIndex.setText("");
                            }
                        }
                    }catch (NumberFormatException a) {
                    JOptionPane.showMessageDialog(TeacherGUI,"Please enter valid data","Alert",JOptionPane.WARNING_MESSAGE);
                    }
                }else{
                    JOptionPane.showMessageDialog(TeacherGUI,"Please enter valid data","Alert",JOptionPane.WARNING_MESSAGE);
                }
        }
    }
    //Checking if the user wants to set the salary of the tutor
        else if(e.getSource() == t_salary){
            //Checking if arraylist is empty or not
            if(teacherList.isEmpty()){
                JOptionPane.showMessageDialog(TeacherGUI,"No data to set salary","Alert",JOptionPane.WARNING_MESSAGE);
            }else{
                for(Teacher teacher : teacherList){
                    if(teacher instanceof Tutor){
                        // Downcasting
                        Tutor tutor = (Tutor) teacher;

                        //Checking if the user the needed data
                        String id = t_forteacherID.getText();
                        String name = t_forteacherName.getText();
                        String perf = t_forperformanceIndex.getText();
                        String workHour = t_forWorkingHour.getText();

                        //Checking if the user entered the data or not
                        if(id.isEmpty() || name.isEmpty() || perf.isEmpty() || workHour.isEmpty()){
                            JOptionPane.showMessageDialog(TeacherGUI,"Please enter the required  data set salary \n Required Data are: \n Teacher ID \n Teacher Name \n Working Hour \n Performance Indez ","Alert",JOptionPane.WARNING_MESSAGE);
                            }
                        else{
                            try{
                                int sal = Integer.parseInt(t_forteacherID.getText());
                                if (sal == teacher.getTeacherID()){
                                    String salary = JOptionPane.showInputDialog("Set Salary");
                                    try {
                                        //Checking if the user entered the correct data type of salary
                                        double salar = Double.parseDouble(salary);
                                        int per = Integer.parseInt(perf);
                                        if (salar > 0) {
                                            JOptionPane.showMessageDialog(TeacherGUI, "Salary Setted Successfully", "Success", JOptionPane.INFORMATION_MESSAGE);

                                            //Changing the salary of the tutor
                                            tutor.setSalary(salar, per);//Method calling to set the salary of tutor

                                            //clearing the textfield after the salary is changed succcessfully
                                            t_forteacherID.setText("");
                                            t_forteacherName.setText("");
                                            t_forperformanceIndex.setText("");
                                            t_forWorkingHour.setText("");
                                        } else {
                                         JOptionPane.showMessageDialog(TeacherGUI, "Please enter the valid salary", "Alert", JOptionPane.WARNING_MESSAGE);
                                        }
                                    } catch (NumberFormatException b) {
                                        JOptionPane.showMessageDialog(TeacherGUI, " Please enter valid data", "Alert", JOptionPane.WARNING_MESSAGE);
                                    }
                                }
                            }catch(NumberFormatException a){
                                JOptionPane.showMessageDialog(TeacherGUI,"Please enter valid data to set Salary","Alert",JOptionPane.WARNING_MESSAGE);
                            }
                        }
                    }
                }
            }  
        //Checking if the user wants to remove the tutor
        }else if (e.getSource() == t_RemoveTutor) {
            if (teacherList.isEmpty()) {
                JOptionPane.showMessageDialog(TeacherGUI, "No data to remove", "Alert", JOptionPane.WARNING_MESSAGE);
            } else {
                // Create an iterator to iterate through the teacherList
                Iterator<Teacher> i = teacherList.iterator();
                while (i.hasNext()) {
                    Teacher teacher = i.next();
                    if (teacher instanceof Tutor) {
                        // Checking if the user entered the correct teacher ID
                        try {
                            int teac = Integer.parseInt(JOptionPane.showInputDialog("Enter Teacher ID"));
                            if (teac == teacher.getTeacherID()) {
                                i.remove(); // Remove the element using the iterator
                                JOptionPane.showMessageDialog(TeacherGUI, "Tutor Removed Successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
                            } else { 
                                JOptionPane.showMessageDialog(TeacherGUI, "Teacher ID is not available", "Alert", JOptionPane.WARNING_MESSAGE);
                            }
                        } catch (NumberFormatException a) {
                            JOptionPane.showMessageDialog(TeacherGUI, "Please enter valid teacher ID and teacher name to remove Tutor", "Alert", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                }
            }
        }
        
        //Checking if the user wants to display the tutor data
        else if(e.getSource() == t_Display){
            //Showing the tutor data
            if(teacherList.isEmpty()){
                JOptionPane.showMessageDialog(TeacherGUI,"No data to display","Alert",JOptionPane.WARNING_MESSAGE);
            }
            else {
                for (Teacher teacher : teacherList) {
                    if (teacher instanceof Tutor) {
                        //Taking teacher ID as Input using JOptionPane
                        try{
                            int teacherID = Integer.parseInt(JOptionPane.showInputDialog("Enter Teacher ID"));
                            //Checking if the teacher ID is available in the ArrayList
                            if(teacherID == teacher.getTeacherID()){
                                //Downcasting
                                Tutor tutor = (Tutor) teacher;
                                //Creating a StringBuilder object to store the message to display in the JOptionPane
                                StringBuilder displayMessage = new StringBuilder();
                                // Construct a string containing the tutor's information
                                displayMessage.append("Teacher ID: ").append(tutor.getTeacherID()).append("\n");
                                displayMessage.append("Name: ").append(tutor.getTeacherName()).append("\n");
                                displayMessage.append("Address: ").append(tutor.getAddress()).append("\n");
                                displayMessage.append("Working Type: ").append(tutor.getWorkingType()).append("\n");
                                displayMessage.append("Working Hour: ").append(tutor.getWorkingHours()).append("\n");
                                displayMessage.append("Employment Status: ").append(tutor.getEmploymentStatus()).append("\n");
                                displayMessage.append("Specialization: ").append(tutor.getSpecialization()).append("\n");
                                displayMessage.append("Academic Qualifications: ").append(tutor.getAcademicQualifications()).append("\n");
                                displayMessage.append("Performance Index: ").append(tutor.getPerformanceIndex()).append("\n");
                                displayMessage.append("Salary: ").append(tutor.getSalary()).append("\n");
                                displayMessage.append("\n"); // Add a separator between each tutor's information
                                // Display the message in a JOptionPane
                                JOptionPane.showMessageDialog(TeacherGUI, displayMessage.toString(), "Tutor Information", JOptionPane.INFORMATION_MESSAGE);
                            }else{
                                JOptionPane.showMessageDialog(TeacherGUI,"Teacher ID is not available","Alert",JOptionPane.WARNING_MESSAGE);
                            }
                        }catch(NumberFormatException a){
                            JOptionPane.showMessageDialog(TeacherGUI,"Please enter valid Teacher ID","Alert",JOptionPane.WARNING_MESSAGE);
                        }
                        
                    }
                }
            }
            
        }
        else if(e.getSource() == t_Clear){
            //Setting the textfield to empty 
            t_forteacherID.setText("");
            t_forteacherName.setText("");
            t_foraddress.setText("");
            t_forWorkingHour.setText("");
            t_forWorkingType.setText("");
            t_foremploymentstatus.setText("");
            t_forspecialization.setText("");
            t_forsetSalary.setText("");
            t_foracademicQualifications.setText("");
            t_forperformanceIndex.setText("");
        }
        else if(e.getSource() == t_Previous){
            t_panel.setVisible(false);
            select.setVisible(true);
        }
        else if(e.getSource() == t_Back){
            TeacherGUI.dispose();
        }
    }
}


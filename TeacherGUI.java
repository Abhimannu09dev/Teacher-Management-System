import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TeacherGUI implements ActionListener{
    JFrame TeacherGUI;
    JLabel background,heading,Logo_,paragraph,try_,teacherID,teacherName,department,WorkingType;
    JPanel select,p_Lecturer;
    ImageIcon back,Logo,try_1;
    JButton Lecturer,Tutor,Quit;
    
    //Creating constructor
    public TeacherGUI(){
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
        
        //Creating JLabel for Lecturer
        teacherID = new JLabel("Teacher ID:");
        teacherID.setBounds(23,26,149,33);
        
        //Creacting JLabel for Lecturer
        teacherName = new JLabel("Teacher name:");
        teacherName.setBounds(23,91,163,50);
        
        
        //Creacting JLabel for Lecturer
        department = new JLabel("Department:");
        department.setBounds(497,91,163,50);
        
        //Creacting JLabel for Lecturer
        WorkingType = new JLabel("Working Type:");
        WorkingType.setBounds(497,91,163,50);
        
        
        //Declaring font for all JLabel in Lecturer and Tutor
        Font label = new Font("inter", Font.PLAIN, 20);//Declaring the font for buttons
        teacherID.setFont(label);
        teacherName.setFont(label);
        department.setFont(label);
        WorkingType.setFont(label);
        
        //Adding all the lecturer components to lecturer panel
        p_Lecturer.add(teacherID);
        p_Lecturer.add(teacherName);
        p_Lecturer.add(department);
        
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
    
    //Adding different EventHandeling functions in the buttons
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == Quit){
            TeacherGUI.dispose();
        }
        else if(e.getSource() == Lecturer){
            //select.dispose();
            select.setVisible(false);
            
        }
        else if(e.getSource() == Tutor){
            
        }
    }

    public static void main(String[] args){
        new TeacherGUI();
    }
}
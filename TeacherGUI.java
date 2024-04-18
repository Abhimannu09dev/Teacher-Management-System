import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.Font;

public class TeacherGUI{
    JFrame TeacherGUI;
    JLabel background,heading,Logo_,paragraph;
    JPanel select;
    ImageIcon back,Logo;
    JButton Lecturer,Tutor,Quit;
    
    //Creating constructor
    public TeacherGUI(){
        TeacherGUI = new JFrame();
        
        //Heading of JFrame
        heading = new JLabel("Teacher Management System");// Creating the label for heading 
        Font fhead = new Font("inter", Font.PLAIN, 32);//Declaring the font for heading
        heading.setFont(fhead);//Setting the font of heading
        heading.setBounds(410,71,477,47);//Setting the size of heading
        TeacherGUI.add(heading);//adding the heading to teacherGUI
        
        //Creating ImageIcon and JLabel for Logo of college
        Logo = new ImageIcon(getClass().getResource("/logo.png"));
        Logo_ = new JLabel(Logo);
        Logo_.setBounds(979,6,182,182);//Setting the size of logo
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
       
       Quit = new JButton("Close");//Setting size of Quit
       Quit.setBounds(237,484,219,72);
       select.add(Quit);//Adding quit to panel
       
       select.setLayout(null);//Seting the layout of panel null

        
        
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
    public static void main(String[] args){
        new TeacherGUI();
    }
}
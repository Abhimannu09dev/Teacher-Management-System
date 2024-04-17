import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

public class TeacherGUI{
    JFrame frame;
    
    public TeacherGUI(){
        frame= new JFrame("Teacher");
        frame.setSize(1280, 823);
        frame.setVisible(true);
        frame.setLayout(null);
        

        JPanel panel = new JPanel();
        frame.add(panel);
        
        placeComponents(panel);
    }

    public static void main(String[] args){
        new TeacherGUI();
    }
}
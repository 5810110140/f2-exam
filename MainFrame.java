import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.awt.BorderLayout;
import java.awt.GridLayout;
class MainFrame extends JFrame  {
    private JTextField textField;

    public static void main(String[] args){
        JFrame frame =  new JFrame("CalcuApp");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);
        

        JPanel panel = new JPanel();
        GridLayout layout = new GridLayout(0,3);

        JButton btn_2d = new JButton("2D");
        frame.add(btn_2d);
        btn_2d.setBounds(50, 100, 95, 30);

        JButton btn_3d = new JButton("3D");
        frame.add(btn_3d);
        btn_3d.setBounds(50, 150, 95, 30);

        JButton btn_all = new JButton("All");
        frame.add(btn_all);
        btn_all.setBounds(50, 200, 95, 30);

        frame.getContentPane().setLayout(new BorderLayout());

        JTextField textField = new JTextField();

        textField.setFont(textField.getFont().deriveFont(30.0f));
        frame.add(textField,BorderLayout.PAGE_END);

        frame.setVisible(true);

        ArrayList<Sprite> sprites = new ArrayList<Sprite>();
         sprites.add(new Circle("A", 3.0));
         sprites.add(new Rectangle("B", 2.0, 8.0));
         sprites.add(new Sphere("C", 3.0));
         sprites.add(new Cylinder("D", 3.0, 2.0));
         sprites.add(new Cuboid("E", 2.0, 8.0, 3.0));


    }
    
    
    
    
}
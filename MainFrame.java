import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Scanner;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.io.File;
import java.io.FileNotFoundException;

class MainFrame extends JFrame  {
    private JTextField textField;

    public static void main(String[] args){

        try{
            File textfile = new File("data.txt");
            Scanner s = new Scanner(textfile);
            while (s.hasNextLine()){
                String data = s.nextLine();
                System.out.println(data);
            }
            s.close();
        }catch(FileNotFoundException e){
            System.out.println("Can't Read file");
            e.printStackTrace();
        }



        JFrame frame =  new JFrame("CalcuApp");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);
        

        JPanel panel = new JPanel();
        GridLayout layout = new GridLayout(0,3);

        panel.setLayout(layout);

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

    


    }
    
    
    
    
    
}
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import java.util.Scanner;
import java.awt.GridLayout;
import java.io.File;
import java.io.FileNotFoundException;

public class MainFrame    {
   // private JTextField textField;
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

        MyFrame frame = new MyFrame("MyProgram");
         frame.setSize(800,600);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);}

    }
    
class MyFrame extends JFrame{
    private JLabel label;

    public MyFrame(String title){
        super(title);

        GridLayout layout = new GridLayout(3,3);
        //layout.setHgap(5);
       // layout.setVgap(2);

   
        JButton btn_1 = new JButton("2D");
        this.add(btn_1,BorderLayout.EAST);
        btn_1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
              
            }
        });

        JButton btn_2 = new JButton("3D");
        btn_2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
            
            }
        });

        JButton btn_3 = new JButton("All ");
        btn_3.setSize(50, 50);
        btn_3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
              
            }
        });

        JTextField textField = new JTextField();
        textField.setFont(textField.getFont().deriveFont(20.0f));
        this.add(textField,BorderLayout.PAGE_START);
        this.getContentPane().setLayout(layout);

        this.add(btn_1);
        this.add(btn_2);
        this.add(btn_3);
        
    }    
}

   

    
    
    
    
    

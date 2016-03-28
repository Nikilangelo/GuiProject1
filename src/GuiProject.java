import java.awt.*;
import javax.swing.*;

public class GuiProject {
     
public static void createGUI(){
		  String[] columnNames = {"Job","Work period","Reason for dismissal"}; 
		  String[][] data = {{"Beeline", "02.11.2006-03.02.2007", "Boring"}};
          JFrame.setDefaultLookAndFeelDecorated(true);
          JFrame frame = new JFrame("Resume editor");
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          
          JPanel mainpanel = new JPanel();
          mainpanel.setLayout(new GridLayout(7, 1, 0, 10));
          JPanel p1 = new JPanel();
          p1.setLayout(new FlowLayout());          
          JLabel label = new JLabel("Resume Editor");
          p1.add(label);
          mainpanel.add(p1);
          JPanel p2 = new JPanel();
          p2.setLayout(new GridLayout(5, 2));
          p2.add(new JLabel ("Full Name:"));
          p2.add(new JTextField());
          p2.add(new JLabel ("Birthday date:"));
          p2.add(new JTextField());
          p2.add(new JLabel ("Education:"));
          p2.add(new JComboBox(Educ.values()));
          p2.add(new JLabel ("Name of University:"));
          p2.add(new JTextField());
          p2.add(new JLabel ("E-mail:"));
          p2.add(new JTextField());
          
          mainpanel.add(p2);
          JPanel p3 = new JPanel();
          p3.setLayout(new GridLayout(2, 4));
          p3.add(new JLabel("Programming Languages:"));
          p3.add(new JCheckBox("C"));
          p3.add(new JCheckBox("Java"));
          p3.add(new JCheckBox("Ñ#"));
          p3.add(new JLabel("Other sections of Programming:"));
          p3.add(new JCheckBox("SQL"));
          p3.add(new JCheckBox("OOP"));
          p3.add(new JCheckBox("WEB(HTML,CSS)"));
          mainpanel.add(p3);
          JPanel p4 = new JPanel();
          p4.setLayout(new GridLayout(1, 5));
          p4.add(new JLabel("Foreign language knowledge level:"));
          p4.add(new JRadioButton("Beginner"));
          p4.add(new JRadioButton("Pre-Intermediate"));
          p4.add(new JRadioButton("Intermediate"));          
          p4.add(new JRadioButton("Advanced"));
          mainpanel.add(p4);
          JPanel p5 = new JPanel();
          p5.setLayout(new GridLayout(1, 2));
          p5.add(new JLabel ("Tell about you:"));
          p5.add(new JTextArea());
          mainpanel.add(p5);
          JTable table = new JTable(data, columnNames);
          JScrollPane scrollPane = new JScrollPane(table);
          mainpanel.add(scrollPane);
          JPanel buttons = new JPanel(new FlowLayout(FlowLayout.RIGHT));
          buttons.add(new JButton("Save"));
          buttons.add(new JButton("Load"));
          mainpanel.add(buttons);
       
          
                  
          frame.getContentPane().add(mainpanel);  
          frame.setPreferredSize(new Dimension(1000, 1000));          
          frame.pack();
          frame.setVisible(true);          
     }
     
     public static void main(String[] args) {
          javax.swing.SwingUtilities.invokeLater(new Runnable() {
               public void run() {
                    createGUI();
               }
          });
     }
}
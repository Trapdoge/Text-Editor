import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextEditor extends JFrame implements ActionListener {

    JTextArea textArea;
    TextEditor(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Wordix Text Editor");
        this.setSize(600, 600);
        this.setLayout(new FlowLayout());
        this.setLocationRelativeTo(null);

        textArea = new JTextArea();
        textArea.setPreferredSize(new Dimension(450, 550));
        this.add(textArea);
        this.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){

    }
}

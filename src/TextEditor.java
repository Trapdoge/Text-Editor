import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextEditor extends JFrame implements ActionListener {

    JTextArea textArea;
    JScrollPane scrollPane;
    TextEditor(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Wordix Text Editor");
        this.setSize(500, 500);
        this.setLayout(new FlowLayout());
        this.setLocationRelativeTo(null);

        textArea = new JTextArea();
        textArea.setPreferredSize(new Dimension(450, 450));
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setFont(new Font("Calibri", Font.PLAIN, 50));

        scrollPane = new JScrollPane(textArea);
        scrollPane.setPreferredSize(new Dimension(450, 450));
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);


        this.add(scrollPane);
        this.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){

    }
}

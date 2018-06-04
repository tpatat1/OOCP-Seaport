package GUI_elements;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FilePickerPanel extends JPanel {
    JFileChooser filechooser ; 
    JButton addFileButton; 
    JFrame frame; 

    public FilePickerPanel(){
        super();
        frame= new JFrame();
        addFileButton = new JButton();
        addFileButton.addActionListener(new ActionListener()
        {
          public void actionPerformed(ActionEvent e)
          {
            // display/center the jdialog when the button is pressed
            JDialog d = new JDialog(frame,"Hello", true);
            d.setLocationRelativeTo(frame);
            d.setVisible(true);
          }
        });
        this.add(addFileButton);
    }
}

package GUI_elements;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JPanel;

public class FilePickerPanel extends JPanel {
    JFileChooser filechooser ; 
    JButton addFileButton; 
    public FilePickerPanel(){
        super();
        addFileButton = new JButton();
        this.add(addFileButton);
    }
}

import java.awt.Dimension;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import utils.*;
import javax.swing.JFrame;
import Objects.*;
import GUI_elements.FilePickerPanel;

public class SeaPortProgram extends JFrame {
	public String iconFileLoc;
	public World world= new World("This World", 0, 0);
	private ContentParser cp;
	FilePickerPanel fpp; 
	public void parseFile(String fileLoc){
		try {
			FileReader fr= new FileReader(new File(fileLoc));
			BufferedReader br = new BufferedReader(fr);
			String line;
			String[] inputArr; 
			while((line = br.readLine()) != null){
				inputArr = cp.parseFileLine(line);
				
				if(inputArr[0].equals("dock")){
					Dock tempDock = cp.makeDock(inputArr);
					this.world.addDock(tempDock);
				}
				else if(inputArr[0].equals("port")){
					SeaPort tempPort = cp.makePort(inputArr);
					world.addPort(tempPort);
				}
				else if(inputArr[0].equals("ship")){
					Ship tempShip = cp.makeShip(inputArr);
					world.addShip(tempShip);
				}
				else if(inputArr[0].equals("cship")){
					CargoShip tempShip= cp.makeCargoShip(inputArr);
					world.addShip(tempShip);
				}
				else if(inputArr[0].equals("pship")){
					PassengerShip tempShip=cp.makePassengerShip(inputArr);
					world.addShip(tempShip);
				}
				else if(inputArr[0].equals("person")){
					Person tempPerson = cp.makePerson(inputArr);
					world.addPerson(tempPerson);
				}
				else if(inputArr[0].equals("job")){
					Job tempJob = cp.makeJob(inputArr);
					world.addJob(tempJob);
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	private SeaPortProgram(){
		// TODO Add GUI Elements
		super("Sea Port Program");
		fpp= new FilePickerPanel();
		this.add(fpp);
		this.setSize(new Dimension(1000, 1000));
	}
	public static void main(String[] args){
		new SeaPortProgram().setVisible(true);
	}
}

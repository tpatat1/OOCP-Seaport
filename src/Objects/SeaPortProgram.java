package Objects;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import utils.*;
import javax.swing.JFrame;

public class SeaPortProgram<T> extends JFrame {
	public String iconFileLoc;
	private ContentParser cp;
	
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
				}
				else if(inputArr[0].equals("port")){
					SeaPort tempPort = cp.makePort(inputArr);
				}
				else if(inputArr[0].equals("ship")){
					Ship tempShip = cp.makeShip(inputArr);
				}
				else if(inputArr[0].equals("cship")){
					CargoShip tempShip= cp.makeCargoShip(inputArr);
				}
				else if(inputArr[0].equals("pship")){
					PassengerShip tempShip=cp.makePassengerShip(inputArr);
				}
				else if(inputArr[0].equals("person")){
					Person tempPerson = cp.makePerson(inputArr);
				}
				else if(inputArr[0].equals("job")){
					Job tempJob = cp.makeJob(inputArr);
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args){
		
	}
}

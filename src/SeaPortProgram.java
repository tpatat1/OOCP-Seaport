import java.util.StringTokenizer;

import javax.swing.JFrame;

public class SeaPortProgram<T> extends JFrame {
	
	public static Thing parseFileLine(String line){
		StringTokenizer st;
		if(line.startsWith("//")){
			return null;
		} else if(line.startsWith("dock")){
			String[] input = line.split(" ");
			try{
				String dockName = input[1];
				int dockIndex = Integer.parseInt(input[2]);
				int dockPort= Integer.parseInt(input[3]);
				return new Dock(dockName, dockIndex, dockPort);
			} finally {
				System.out.println("Invalid Line arugment");
			}
		}
		
		return null;
	}
	public static int main(int argv, String[] args){
		return 1;
	}
}

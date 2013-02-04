import java.io.File;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class cat{
	private String fileName;
	
	

	public static void main(String[] args){
		cat aCat = new cat();
		aCat.setFileName(args);
		File file = new File("./" + aCat.getFileName());
		BufferedReader in = null;
		try{
			in = new BufferedReader(new FileReader(file));
			String line;
			while((line = in.readLine()) != null){
				System.out.println(line);
			}
		}catch(FileNotFoundException fnf){
			System.out.println("File not found");
		}catch(IOException io){
			io.printStackTrace();
		}finally{
			
				aCat.closeReader(in);
			
		}
	}

	private void setFileName(String[] args){
		String Name = "";
		String space = "";
		for(int c=0;c<args.length;c++){
			if(c>0)	space = " ";
			Name = Name + space + args[c];
		}
		this.fileName = Name;
	}

	public String getFileName(){
		return this.fileName;
	}

	private void closeReader(Reader reader){
		try{
			if(reader != null){
				reader.close();
			}
		}catch(IOException io){
			io.printStackTrace();
		}
	}
}

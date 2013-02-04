import java.io.File;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class cp{

	public static void main(String[] args){

		if(args.length != 2){
			throw new IllegalArgumentException("Supply only a source file and destination file");
		}
		cp aCp = new cp();

		File sourceFile = new File(args[0]);
		File destFile = new File(args[1]);
		String str = null;
		if(destFile.exists()){
			do{
				System.out.println("File already exists. Overwrite? (y/n)");
				str = System.console().readLine();
				if(str.equals("n")){
					return;
				}
			}while(!str.equals("y") && !str.equals("n"));
		}
		BufferedReader in = null;
		PrintWriter out = null;
		try{
			out = new PrintWriter(destFile);
			in = new BufferedReader(new FileReader(sourceFile));
			String line;
			while((line = in.readLine()) != null){
				out.println(line);
				//System.out.println(line);

			}
			System.out.println("File has been copied");
		}catch(FileNotFoundException fnf){
			System.out.println("File not found");
		}catch(IOException io){
			io.printStackTrace();
		}finally{

			aCp.closeReader(in);
			out.close();

		}






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

import java.io.File;

public class mkdir{
	
	public static void main(String[] args){
		try{
			
			String dirName = "";
			String space = "";
			for(int c=0;c<args.length;c++){
				if(c>0)	space = " ";
			dirName = dirName + space + args[c];
			}
			File file = new File("./" + dirName);
			String article = "not ";
			if (file.mkdir()){
				article = "";
			}
				System.out.println("Folder has " + article + "been succesfully created.");
			
		}catch(NullPointerException np){
			np.printStackTrace();
		}catch(SecurityException se){
			se.printStackTrace();
		}
	}
}
		

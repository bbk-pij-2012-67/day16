
import java.io.File;

public class ls{
	
	public static void main(String[] args){
		try{
		File file = new File(".");
		String[] list = file.list();
		for (int c=0;c<list.length;c++)
			System.out.println(list[c]);
		}catch(NullPointerException np){
			np.printStackTrace();
		}catch(SecurityException se){
			se.printStackTrace();
		}
	}
}
		

public class Temperature{

	private int sum = 0;

	public static void main(String[] args){

		Temperature tp = new Temperature();

		if(args.length == 1){
			File file = new File(args[0]);
			BufferedReader in = null;
			try{
				in = new BufferedReader(new FileReader(file));
				String line;
				while((line = in.readLine()) != null){
					tp.calcSum(line);
				}
			}catch(FileNotFoundException fnf){
				System.out.println("File not found");
			}catch(IOException io){
				io.printStackTrace();
			}finally{

				aCat.closeReader(in);

			}
		}
	}
	
	private void calcSum(String line){
		//scan for numbers.
	}
}

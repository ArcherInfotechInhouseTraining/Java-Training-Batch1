import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFileExample {

	public static void main(String[] args) throws FileNotFoundException, IOException 
	{
		String inputFile = "source.txt";
		String outputFile = "destination.txt";
		
		try( BufferedReader br = new BufferedReader(new FileReader(inputFile));
			 BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile)))
		{
			String line;
			while( (line = br.readLine()) != null)
			{
				bw.write(line);
				bw.newLine();
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

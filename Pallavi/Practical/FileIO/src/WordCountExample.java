import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class WordCountExample {

	public static void main(String[] args) throws FileNotFoundException, IOException 
	{
		
		String filepath = "source.txt";
		int wordcnt = 0;
		
		try(BufferedReader br = new BufferedReader(new FileReader(filepath)))
		{
			String line;
			while( (line = br.readLine()) != null)
			{
				String []word = line.split("\\s+");
				wordcnt+=word.length;
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		System.out.println("Word count is: "+wordcnt);
	}
}

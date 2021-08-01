import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.ParseException;
    
public class Main {
	
	
	public String readFile(String fileName)
	{
		try  
		{  
			File file = new File(fileName); 
			FileReader fr = new FileReader(file);  
			BufferedReader br = new BufferedReader(fr); 
			StringBuffer sb = new StringBuffer(); 
			
			String line;  
		while((line=br.readLine())!=null)  
		{  
		   
		}  
		fr.close();    //closes the stream and release the resources  
		
		}  
		catch(IOException e)  
		{  
		e.printStackTrace();  
		}  

		return null;
	}

	public static void main(String[] args) throws Exception {
		
		Options options = new Options();
		
        Option forXmlFile = new Option("f", "inputFile", true, "Input File");
        forXmlFile.setRequired(true);
        options.addOption(forXmlFile);
        
        Option outputFile = new Option("o", "outputFile", true, "Output File");
        outputFile.setRequired(false);
        options.addOption(outputFile);
        
        Option lexicalOutput = new Option("l", "lexical", false, "Lexical Output File");
        lexicalOutput.setRequired(false);
        options.addOption(lexicalOutput);
        
        Option symbolTableOutput = new Option("t", "symbolTable", false, "Symbol Table Output File");
        symbolTableOutput.setRequired(false);
        options.addOption(symbolTableOutput);
        
        HelpFormatter formatter = new HelpFormatter();
        CommandLineParser parser = new DefaultParser();
        CommandLine cmd;
        
        try {
            cmd = parser.parse(options, args);
        } catch (ParseException e) {
            System.out.println(e.getMessage());
            formatter.printHelp("User Profile Info", options);
            System.exit(1);
            return;
        }
        
        /*System.out.println("User First Name is: " + cmd.getOptionValue("name"));
        System.out.println("User Last Name is: " + cmd.getOptionValue("lastname"));
        System.out.println("User Email is: " + cmd.getOptionValue("email"));
        if (cmd.hasOption("m")) {
            System.out.println("User Mobile Number is: " + cmd.getOptionValue("mobilenumber"));
        }*/
	}
}

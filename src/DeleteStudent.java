import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedReader;

public class DeleteStudent {
	
	public static String findString() throws IOException {
		Scanner list = new Scanner(new File("StudentList.txt"));
		String in;
		Scanner userInput = new Scanner(System.in);
		System.out.println("Find the Student you would like to delete");
		System.out.println("Please enter the first and last name of the student you would like to delete, separated by a space:");
		in = userInput.nextLine();
		while(list.hasNext()) {
			String line = list.nextLine();
			if(line.contains(in)) {
				return line;
			}
			else {
				System.out.println("There is no name that matches.");
			}
		}
		return null;
	}
	
	public static void deleteLine(String str) throws IOException {
		File inputFile = new File("StudentList.txt");
		File tempFile = new File("TempStudentList.text");
		BufferedReader reader = new BufferedReader(new FileReader(inputFile));
		BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));
		
		String lineToRemove = str;
		String currentLine;
		
		while((currentLine = reader.readLine()) != null){
			String trimmedLine = currentLine.trim();
			if(trimmedLine.equals(lineToRemove)) continue;
			writer.write(currentLine + System.getProperty("line.separator"));
		}
		writer.close();
		reader.close();
		boolean success = tempFile.renameTo(inputFile);
	}
}

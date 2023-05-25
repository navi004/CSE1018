import java.io.*;

class FileRead {
	public static void main(String[] args) {
		File file = new File("/home/student/22mia1049/Java1049/naveen1.txt");
		
		try {
			FileReader reader = new FileReader(file);
			
			int output = reader.read();
			//read() method is used to read the contents in 
			
			while(output != -1) { //index = -1 which means it reached the emd of the file
				System.out.println((char)output);    //print one character that it read
			    output = reader.read();
            }
		}
        catch(IOException e) {
            e.printStackTrace();
        }
	}
}

import java.io.*;

class FileWrite {
	public static void main(String[] args) {
		File file = new File("/home/student/22mia1049/Java1049/naveen1.txt");
	try {
		file.createNewFile();
		FileWriter writer = new FileWriter(file);
		//ASCII
		writer.write(98);  //prints ASCII value 98 = b
		
        //write() method is used to write contents in the file
		writer.write("Naveen");

		writer.flush();
        //flush method will pass all the contents to the file

		writer.close();
        //close your file
	}

	catch(IOException e) {
	    e.printStackTrace();
	}
	
		
	}
}

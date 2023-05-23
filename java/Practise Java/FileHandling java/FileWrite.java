import java.io.*;

class FileWrite {
	public static void main(String[] args) {
		File file = new File("/home/student/22mia1049/Java1049/naveen1.txt");
		if(!file.exists()) {
			try {
				file.createNewFile();
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
		FileWriter writer = new FileWriter(file);
		//ASCII
		Writer.write(98);
		
		Writer.write("Naveen");
		writer.flush();
		writer.close();
		
	}
}


import java.io.*;

class FileWrite {
	public static void main(String[] args) {
	try {
		File file = new File("/home/student/22mia1049/Java1049/naveen1.txt");
		
		file.createNewFile();
		FileWriter writer = new FileWriter(file);
		//ASCII
		Writer.write(98);
		
		Writer.write("Naveen");
		writer.flush();
		writer.close();
	}
	catch(IOException e) {
	e.printStackTrace();
	}
	
		
	}
}

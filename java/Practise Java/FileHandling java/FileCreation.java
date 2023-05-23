import java.io.*;

class FileCreation {
	public static void main(String[] args) {

		File file = new File("/home/student/22mia1049/Java1049/nnaveen.txt");
		if(!file.exists()) {
			try {
				file.createNewFile();
				System.out.println("File is created");	
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}

import java.io.*;

class FileDeletion {
	public static void main(String[] args) {
		File file = new File("/home/student/22mia1049/NewFolder/SubFolder/program.txt");
		file.delete();
		if(!file.exists())
			System.out.println("File Deleted Successfully");
 
	}
}

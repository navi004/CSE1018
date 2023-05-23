import java.io.*;

class SubFolder {
	public static void main(String[] args) {
	File file = new File("/home/student/22mia1049/NewFolder/SubFolder");
	System.out.println(file.exists());
	if(!file.exists()) {
		file.mkdirs();
	}
	System.out.println(file.exists());
	}
}

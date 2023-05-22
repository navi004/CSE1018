import java.io.*;

class Main1049 {
	public static void main(String[] args) {
	File file = new File("/home/student/22mia1049/Java1049");
	System.out.println(file.exits());
	if(!file.exits()) {
		file.mkdir();
		}
	System.out.println(file.exists());
	}
}

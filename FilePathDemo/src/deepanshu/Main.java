package deepanshu;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		File path = new File(Main.class.getProtectionDomain().getCodeSource().getLocation().getPath());
		path=path.getParentFile();
		System.out.println("Parent Directory of jar: " +path);
		File currDirFile= new File(".");
		System.out.println("Current Dir: " +currDirFile.getAbsolutePath());
	}
}

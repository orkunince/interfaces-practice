package interfacesPractice;

public class FileLogger implements Logger {

	@Override
	public void log(String mesaj) {
		System.out.println("Dosya g�nderildi: "+ mesaj);
		
	}



}

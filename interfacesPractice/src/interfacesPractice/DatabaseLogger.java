package interfacesPractice;

public class DatabaseLogger implements Logger {

	@Override
	public void log(String mesaj) {
		System.out.println("Veritabanına loglandı: "+ mesaj);
		
	}

	

}

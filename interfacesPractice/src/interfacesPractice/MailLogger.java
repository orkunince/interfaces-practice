package interfacesPractice;

public class MailLogger implements Logger {

	@Override
	public void log(String mesaj) {
		System.out.println("Mail gönderildi: " +mesaj);
		
	}



}

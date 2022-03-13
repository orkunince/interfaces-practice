package interfacesPractice;

public class SmsLogger implements Logger {

	@Override
	public void log(String mesaj) {
		System.out.println("Sms gönderildi: "+ mesaj);
		
	}

}

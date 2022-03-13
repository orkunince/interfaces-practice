package interfacesPractice;

public class Main {

	public static void main(String[] args) {
		Customer customer=new Customer(1,"Orkun","orkun@gmail.com");
		
		Logger[] loggers= {new SmsLogger(),new MailLogger(), new FileLogger()};
		
		CustomerManager customerManager=new CustomerManager(loggers);
		customerManager.add(customer);

	}

}

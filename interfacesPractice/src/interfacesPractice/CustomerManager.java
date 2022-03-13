package interfacesPractice;

public class CustomerManager {

	private Logger[] loggers;

	public CustomerManager(Logger[] loggers) {
		this.loggers = loggers;
	}

	public void add(Customer customer) {
		System.out.println("Müþteri eklendi: " + customer.getName());

		Utils.runLoggers(loggers, customer.getName());
	}

	public void update(Customer customer) {
		System.out.println("Müþteri güncellendi: " + customer.getName());

		Utils.runLoggers(loggers, customer.getName());
	}

}

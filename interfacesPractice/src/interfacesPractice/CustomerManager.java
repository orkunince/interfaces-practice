package interfacesPractice;

public class CustomerManager {

	private Logger[] loggers;

	public CustomerManager(Logger[] loggers) {
		this.loggers = loggers;
	}

	public void add(Customer customer) {
		System.out.println("M��teri eklendi: " + customer.getName());

		Utils.runLoggers(loggers, customer.getName());
	}

	public void update(Customer customer) {
		System.out.println("M��teri g�ncellendi: " + customer.getName());

		Utils.runLoggers(loggers, customer.getName());
	}

}

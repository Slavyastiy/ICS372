import java.util.Date;

public class AdvanceTicket extends Ticket{
	
	public AdvanceTicket (int quantity, String customerID, String cardNumber, Date ticketDate, double price) {
		super();
		this.quantity = quantity;
		this.customerID = customerID;
		this.cardNumber = cardNumber;
		this.ticketDate = ticketDate;
		this.price = setPrice(price);
	}
	
	
	@Override
	protected double setPrice(double ticketPrice) {
		return price;
	}
	
	@Override
	public String toString() {
		return "test";
	}
}

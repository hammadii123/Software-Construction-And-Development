import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Instantiate Customer
        Customer customer = new Customer();
        customer.setCustomerId('C');
        customer.setName('A');
        customer.setAddress('B');
        customer.setPhoneNo(1234567890);
        customer.setAge(30);
        customer.addDetails();
        
        // Instantiate Agent
        Agent agent = new Agent();
        agent.setId(1);
        agent.setName('D');
        agent.searchTicket();
        agent.bookTicket();
        agent.makePayment();

        // Instantiate Ticket
        Ticket ticket = new Ticket();
        ticket.setSource('X');
        ticket.setDestination('Y');
        ticket.setDateOfJourney(new Date());
        ticket.setTime(new Date());
        ticket.setBusNo('Z');
        ticket.setSeatNo('A');

        // Instantiate Booking Counter
        BookingCounter bookingCounter = new BookingCounter();
        bookingCounter.processBooking();

        // Instantiate Refund
        Refund refund = new Refund();
        refund.setAmount(100.0f);
        refund.setCustomerId('C');
        refund.refundAmount();
    }
}

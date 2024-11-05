class Agent implements CommonFunctions {
    private int id;
    private char name;

    @Override
    public void searchTicket() {
        System.out.println("Ticket searched by Agent.");
    }

    @Override
    public void bookTicket() {
        System.out.println("Ticket booked by Agent.");
    }

    @Override
    public void cancelTicket() {
        System.out.println("Ticket canceled by Agent.");
    }

    @Override
    public void makePayment() {
        System.out.println("Payment made by Agent.");
    }

    @Override
    public void fillDetails() {
        System.out.println("Details filled by Agent.");
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getName() {
        return name;
    }

    public void setName(char name) {
        this.name = name;
    }
}

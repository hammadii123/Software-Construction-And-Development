class Refund {
    private float amount;
    private char customerId;

    public void refundAmount() {
        System.out.println("Refund processed.");
    }

    // Getters and setters
    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public char getCustomerId() {
        return customerId;
    }

    public void setCustomerId(char customerId) {
        this.customerId = customerId;
    }
}

class Customer {
    private char customerId;
    private char name;
    private char address;
    private int phoneNo;
    private int age;

    public void addDetails() {
        System.out.println("Customer details added.");
    }

    public void modifyDetails() {
        System.out.println("Customer details modified.");
    }

    // Getters and setters
    public char getCustomerId() {
        return customerId;
    }

    public void setCustomerId(char customerId) {
        this.customerId = customerId;
    }

    public char getName() {
        return name;
    }

    public void setName(char name) {
        this.name = name;
    }

    public char getAddress() {
        return address;
    }

    public void setAddress(char address) {
        this.address = address;
    }

    public int getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

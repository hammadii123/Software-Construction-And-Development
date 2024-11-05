import java.util.Date;

class Ticket {
    private char source;
    private char destination;
    private Date dateOfJourney;
    private Date time;
    private char busNo;
    private char seatNo;

    // Getters and setters
    public char getSource() {
        return source;
    }

    public void setSource(char source) {
        this.source = source;
    }

    public char getDestination() {
        return destination;
    }

    public void setDestination(char destination) {
        this.destination = destination;
    }

    public Date getDateOfJourney() {
        return dateOfJourney;
    }

    public void setDateOfJourney(Date dateOfJourney) {
        this.dateOfJourney = dateOfJourney;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public char getBusNo() {
        return busNo;
    }

    public void setBusNo(char busNo) {
        this.busNo = busNo;
    }

    public char getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(char seatNo) {
        this.seatNo = seatNo;
    }
}

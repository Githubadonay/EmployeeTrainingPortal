//Implemention of Class, Class name is trainingSession.
public class trainingPortal {
    // Instance
    private String sessionId;
    private String sessionTitle;
    private double totalDuration;
    private int currentNumOfParticipants;
    public static int maximumParticipant = 30;

    // Constructors
    trainingPortal() {
        this.sessionId = "";
        this.sessionTitle = "";
        this.totalDuration = 0;
        this.currentNumOfParticipants = 0;
    }

    trainingPortal(String sessionId, String sessionTitle, double totalDuration, int currentNumOfParticipants) {
        this.sessionId = sessionId;
        this.sessionTitle = sessionTitle;
        this.totalDuration = totalDuration;
        this.currentNumOfParticipants = currentNumOfParticipants;
    }

    // Mutators using set
    public void setSessionId(String sessionId) {
        if (!sessionId.equals(""))
            this.sessionId = sessionId;
    }

    public void setSessionTitle(String sessionTitle) {
        if (!sessionTitle.equals(""))
            this.sessionTitle = sessionTitle;
    }

    public void setTotalDuration(double totalDuration) {
        if (totalDuration > 0)
            this.totalDuration = totalDuration;
    }

    public void setCurrentNumOfParticipants(int currentNumOfParticipants) {
        if (currentNumOfParticipants > 0)
            this.currentNumOfParticipants = currentNumOfParticipants;
    }

    // Accessors using get
    public String getSessionId() {
        return sessionId;
    }

    public String getSessionTitle() {
        return sessionTitle;
    }

    public double getTotalDuration() {
        return totalDuration;
    }

    public int getCurrentNumOfParticipants() {
        return currentNumOfParticipants;
    }

    // Method to calculate remaining seats( maximum participant - current
    // participant)
    public int remainingSeats() {
        return maximumParticipant - currentNumOfParticipants;
    };

    // toString method
    public String toString() {
        return "Session Code: " + this.getSessionId() + " | "
                + "Title: " + this.getSessionTitle() + " | "
                + "Duration: " + this.getTotalDuration() + " | "
                + "Participants: " + this.getCurrentNumOfParticipants() + " | "
                + "Available Spots: " + this.remainingSeats();
    }

}

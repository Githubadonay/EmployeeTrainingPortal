//Implemention of Class, Class name is trainingSession.
public class trainingSession {
    //Instance 
    private String sessionId;
    private String sessionTitle;
    private double totalDuration;
    private double currentNumOfParticipants;

    //Constructors 
    trainingSession(){
        this.sessionId = "";
        this.sessionTitle = "";
        this.totalDuration = 10;
        this.currentNumOfParticipants = 30;
    }


    

    //Accessors using set
    public void setSessionId(String sessionId){
        if( !sessionId.equals("") )
            this.sessionId = sessionId;
    }

    public void setSessionTitle(String sessionTitle){
        if (!sessionTitle.equals(""))
            this.sessionTitle = sessionTitle;
    }

    public void setTotalDuration(double totalDuration){
        if(totalDuration < 10 )
        this.totalDuration = totalDuration;
    }

    public void setCurrentNumOfParticipants(double currentNumOfParticipants){
        if( currentNumOfParticipants < 30)
        this.currentNumOfParticipants = currentNumOfParticipants;
    }
    

    //Mutators using get
    public String getSessionId(){
        return sessionId;
    }

    public String getSessionTitle(){
        return sessionTitle;
    }

    public double getTotalDuration(){
        return totalDuration;
    }

    public double getCurrentNumOfParticipants(){
        return currentNumOfParticipants;
    }

    //Method to calculate remaining seats( maximum participant - current participant) 



    //toString method 
    
}

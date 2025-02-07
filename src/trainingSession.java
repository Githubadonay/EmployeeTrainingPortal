//Implemention of Class, Class name is trainingSession.
public class trainingSession {
    //Instance 
    private String sessionId;
    private String sessionTitle;
    private double totalDuration;
    private double currentNumOfParticipants;
    private double maxNumOfParticipants;

    //Constructors 
    trainingSession(){
        this.sessionId = "";
        this.sessionTitle = "";
        this.totalDuration = 0;
        this.currentNumOfParticipants = 0;
        this.maxNumOfParticipants = 0;

    }
    

    //Accessors using set
    public void setSessionId(String sessionId){
        if( !sessionId.equals("") )
            this.sessionId = sessionId;
    }
    
    //Mutators using get
    public String getSessionId(){
        return sessionId;
    }


    //Method to calculate remaining seats( maximum participant - current participant) 

    //toString method 
    
}

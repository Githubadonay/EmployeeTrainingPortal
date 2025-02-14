import javax.swing.JOptionPane;

public class trainingPortalImp {
    public static void main(String[] args) {
        int totalSessions = 4;
        int totalParticipant = 0;

        // input one
        trainingPortal trainingInput1 = new trainingPortal();
        // session id
        String sessionIdOne = JOptionPane.showInputDialog("Input course ID");
        trainingInput1.setSessionId(sessionIdOne);

        // session title
        String sessionTitleOne = JOptionPane.showInputDialog("Enter the title of the class");
        trainingInput1.setSessionTitle(sessionTitleOne);

        // total session duration
        double totalDurationOne = Double.parseDouble(JOptionPane.showInputDialog("Enter the session Duration"));
        trainingInput1.setTotalDuration(totalDurationOne);

        // number of participants
        int currentNumOfParticipantsOne = Integer
                .parseInt(JOptionPane.showInputDialog("How many number of participants are there"));
        trainingInput1.setCurrentNumOfParticipants(currentNumOfParticipantsOne);

        // remaining seats
        totalParticipant += trainingInput1.getCurrentNumOfParticipants();

        // input 2
        trainingPortal trainingInput2 = new trainingPortal();
        // session id
        String sessionIdTwo = JOptionPane.showInputDialog("Input course ID");
        trainingInput2.setSessionId(sessionIdTwo);

        // session title
        String sessionTitleTwo = JOptionPane.showInputDialog("Enter the title of the class");
        trainingInput2.setSessionTitle(sessionTitleTwo);

        // total session duration
        double totalDurationTwo = Double.parseDouble(JOptionPane.showInputDialog("Enter the session Duration"));
        trainingInput2.setTotalDuration(totalDurationTwo);

        // number of participants
        int currentNumOfParticipantsTwo = Integer
                .parseInt(JOptionPane.showInputDialog("How many number of participants are there"));
        trainingInput2.setCurrentNumOfParticipants(currentNumOfParticipantsTwo);

        // remaining seats
        totalParticipant += trainingInput2.getCurrentNumOfParticipants();

        // input 3
        trainingPortal trainingInput3 = new trainingPortal();
        // session id
        String sessionIdThree = JOptionPane.showInputDialog("Input course ID");
        trainingInput3.setSessionId(sessionIdThree);

        // session title
        String sessionTitleThree = JOptionPane.showInputDialog("Enter the title of the class");
        trainingInput3.setSessionTitle(sessionTitleThree);

        // total session duration
        double totalDurationThree = Double.parseDouble(JOptionPane.showInputDialog("Enter the session Duration"));
        trainingInput3.setTotalDuration(totalDurationThree);

        // number of participants
        int currentNumOfParticipantsThree = Integer
                .parseInt(JOptionPane.showInputDialog("How many number of participants are there"));
        trainingInput3.setCurrentNumOfParticipants(currentNumOfParticipantsThree);

        // remaining seats
        totalParticipant += trainingInput3.getCurrentNumOfParticipants();

        // input 4
        trainingPortal trainingInput4 = new trainingPortal();
        // session id
        String sessionIdFour = JOptionPane.showInputDialog("Input course ID");
        trainingInput4.setSessionId(sessionIdFour);

        // session title
        String sessionTitleFour = JOptionPane.showInputDialog("Enter the title of the class");
        trainingInput4.setSessionTitle(sessionTitleFour);

        // total session duration
        double totalDurationFour = Double.parseDouble(JOptionPane.showInputDialog("Enter the session Duration"));
        trainingInput4.setTotalDuration(totalDurationFour);

        // number of participants
        int currentNumOfParticipantsFour = Integer
                .parseInt(JOptionPane.showInputDialog("How many number of participants are there"));
        trainingInput4.setCurrentNumOfParticipants(currentNumOfParticipantsFour);

        // remaining seats
        totalParticipant += trainingInput4.getCurrentNumOfParticipants();
        JOptionPane.showMessageDialog(null,
                "Training Session Report \n \n"
                        + "Total number of sessions: " + totalSessions + "\n"
                        + "Total number of Participants: " + totalParticipant + "\n"
                        + "Average number of participants: " + (totalParticipant / totalSessions) + "\n"
                        + "Details of all Session: \n"
                        + trainingInput1 + "\n"
                        + trainingInput2 + "\n"
                        + trainingInput3 + "\n"
                        + trainingInput4.toString());

    }
}

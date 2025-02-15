import javax.swing.JOptionPane;

public class trainingPortalImp {
    public static void main(String[] args) {
        int totalSessions = 4;
        int totalParticipant = 0;

        // input one
        trainingPortal trainingInput1 = new trainingPortal();
        // session id
        try {
            String sessionIdOne = JOptionPane.showInputDialog("Input course ID");
            trainingInput1.setSessionId(sessionIdOne);
        } catch (IllegalArgumentException er) {
            JOptionPane.showMessageDialog(null, er.getMessage());
        }
        // session title
        try {
            String sessionTitleOne = JOptionPane.showInputDialog("Enter the title of the class");
            trainingInput1.setSessionTitle(sessionTitleOne);
        } catch (IllegalArgumentException er) {
            JOptionPane.showMessageDialog(null, er.getMessage());
        }
        // total session duration
        try {
            double totalDurationOne = Double.parseDouble(JOptionPane.showInputDialog("Enter the session Duration"));
            trainingInput1.setTotalDuration(totalDurationOne);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "The duration must be a positive number");
        } catch (IllegalArgumentException er) {
            JOptionPane.showMessageDialog(null, er.getMessage());
        }
        // number of participants
        try {
            int currentNumOfParticipantsOne = Integer
                    .parseInt(JOptionPane.showInputDialog("How many number of participants are there"));
            trainingInput1.setCurrentNumOfParticipants(currentNumOfParticipantsOne);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "The amount of paticipants must be a positive number");
        } catch (IllegalArgumentException er) {
            JOptionPane.showMessageDialog(null, er.getMessage());
        }
        // remaining seats
        totalParticipant += trainingInput1.getCurrentNumOfParticipants();

        // input 2
        trainingPortal trainingInput2 = new trainingPortal();
        // session id
        try {
            String sessionIdTwo = JOptionPane.showInputDialog("Input course ID");
            trainingInput2.setSessionId(sessionIdTwo);
        } catch (IllegalArgumentException er) {
            JOptionPane.showMessageDialog(null, er.getMessage());
        }
        // session title
        try {
            String sessionTitleTwo = JOptionPane.showInputDialog("Enter the title of the class");
            trainingInput2.setSessionTitle(sessionTitleTwo);
        } catch (IllegalArgumentException er) {
            JOptionPane.showMessageDialog(null, er.getMessage());
        }
        // total session duration
        try {
            double totalDurationTwo = Double.parseDouble(JOptionPane.showInputDialog("Enter the session Duration"));
            trainingInput2.setTotalDuration(totalDurationTwo);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "The duration must be a positive number");
        } catch (IllegalArgumentException er) {
            JOptionPane.showMessageDialog(null, er.getMessage());
        }
        // number of participants
        try {
            int currentNumOfParticipantsTwo = Integer
                    .parseInt(JOptionPane.showInputDialog("How many number of participants are there"));
            trainingInput2.setCurrentNumOfParticipants(currentNumOfParticipantsTwo);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "The amount of participants must be a positive number");
        } catch (IllegalArgumentException er) {
            JOptionPane.showMessageDialog(null, er.getMessage());
        }
        // remaining seats
        totalParticipant += trainingInput2.getCurrentNumOfParticipants();

        // input 3
        trainingPortal trainingInput3 = new trainingPortal();
        // session id
        try {
            String sessionIdThree = JOptionPane.showInputDialog("Input course ID");
            trainingInput3.setSessionId(sessionIdThree);
        } catch (IllegalArgumentException er) {
            JOptionPane.showMessageDialog(null, er.getMessage());
        }
        // session title
        try {
            String sessionTitleThree = JOptionPane.showInputDialog("Enter the title of the class");
            trainingInput3.setSessionTitle(sessionTitleThree);
        } catch (IllegalArgumentException er) {
            JOptionPane.showMessageDialog(null, er.getMessage());
        }
        // total session duration
        try {
            double totalDurationThree = Double.parseDouble(JOptionPane.showInputDialog("Enter the session Duration"));
            trainingInput3.setTotalDuration(totalDurationThree);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "The duration must be a positive number");
        } catch (IllegalArgumentException er) {
            JOptionPane.showMessageDialog(null, er.getMessage());
        }
        // number of participants
        try {
            int currentNumOfParticipantsThree = Integer
                    .parseInt(JOptionPane.showInputDialog("How many number of participants are there"));
            trainingInput3.setCurrentNumOfParticipants(currentNumOfParticipantsThree);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "The amount of participants must be a positive number");
        } catch (IllegalArgumentException er) {
            JOptionPane.showMessageDialog(null, er.getMessage());
        }
        // remaining seats
        totalParticipant += trainingInput3.getCurrentNumOfParticipants();

        // input 4
        trainingPortal trainingInput4 = new trainingPortal();
        // session id
        try {
            String sessionIdFour = JOptionPane.showInputDialog("Input course ID");
            trainingInput4.setSessionId(sessionIdFour);
        } catch (IllegalArgumentException er) {
            JOptionPane.showMessageDialog(null, er.getMessage());
        }
        // session title
        try {
            String sessionTitleFour = JOptionPane.showInputDialog("Enter the title of the class");
            trainingInput4.setSessionTitle(sessionTitleFour);
        } catch (IllegalArgumentException er) {
            JOptionPane.showMessageDialog(null, er.getMessage());
        }
        // total session duration
        try {
            double totalDurationFour = Double.parseDouble(JOptionPane.showInputDialog("Enter the session Duration"));
            trainingInput4.setTotalDuration(totalDurationFour);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "The duration must be a positive number");
        } catch (IllegalArgumentException er) {
            JOptionPane.showMessageDialog(null, er.getMessage());
        }
        // number of participants
        try {
            int currentNumOfParticipantsFour = Integer
                    .parseInt(JOptionPane.showInputDialog("How many number of participants are there"));
            trainingInput4.setCurrentNumOfParticipants(currentNumOfParticipantsFour);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "The amount of participants must be a positive number");
        } catch (IllegalArgumentException er) {
            JOptionPane.showMessageDialog(null, er.getMessage());
        }
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

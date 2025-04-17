import java.util.Random;

//backend
public class RockPaperScissorLogic {
    //all of the choices that a computer on choose
    private static final String[] computerChoices = {"Rock","Paper","Scissor"};

    public  String getComputerChoice() {
        return computerChoice;
    }

    public int getComputerScore() {
        return computerScore;
    }

    public int getPlayerScore() {
        return playerScore;
    }

    //stores computer score and player score
    private int computerScore,playerScore;
    //stores the computer choice which is generated randomly
    private String computerChoice;
    //use to generate a random number to randomly choose an option for the computer
    private Random random;

    public RockPaperScissorLogic(){
        random = new Random();
    }

    //call this method to begin playing rock paper scissor game
    //playerChoice - is the choice made by the player
    public String playRockPaperScissor(String playerChoice)
    {
        //generate computer choice
        computerChoice = computerChoices[random.nextInt(computerChoices.length)];

        //will contain the returning message indicating the result of the game
        String result;

        //evaluate the winner
        if(computerChoice.equals("Rock")){
            if(playerChoice.equals("Paper")) {
                result = "Player wins";
                playerScore++;
            }
            else if(playerChoice.equals("Scissor")){
                result = "Computer wins";
                computerScore++;
            }
            else{
                result="Draw";
            }
        }
        else if(computerChoice.equals("Paper")){
            if(playerChoice.equals("Rock")) {
                result = "Computer wins";
                computerScore++;
            }
            else if(playerChoice.equals("Scissor")){
                result = "Player wins";
                playerScore++;
            }
            else{
                result="Draw";
            }
        }
        else{
            if(playerChoice.equals("Rock")) {
                result = "Player wins";
                playerScore++;
            }
            else if(playerChoice.equals("Paper")){
                result = "Computer wins";
                computerScore++;
            }
            else{
                result="Draw";
            }
        }
        return result;
    }
}

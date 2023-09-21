public class Jengo {

    public static void main(String[] args) {
        //creazione degli oggetti
        Winner winner = new Winner();
        Player player1 = new Player("Bernardo",winner);
        Player player2 = new Player("Player2",winner);
        
        //inizio dei processi
        player1.start();
        player2.start();
    }
    
}

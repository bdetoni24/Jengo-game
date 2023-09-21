
import java.util.Random;

public class Player extends Thread{
    //attributi
    public String name="not_defined";
    private Random rnd = new Random();
    private Winner winner=null;
    private int total=0;
    
    //costruttori
    public Player(String name,Winner winner){
        this.name=name;
        this.winner=winner;
    }
    
    @Override
    public void run() {
        System.out.println("Giocatore "+name+" avviato.");
        
        int newNumber=0;
        while(!winner.isEnd()){
            newNumber = throwDice()*10+throwDice();
            total+=newNumber;
            System.out.println("-Giocatore "+name+" ha estratto "+newNumber+" (somma="+total+")");
            if(total>=500){
                System.out.println("GIOCATORE "+name.toUpperCase()+" HA VINTO!");
                winner.setEnd(this);
            }
        }
    }
    
    //funzioni
    private int throwDice(){
        return rnd.nextInt(6)+1;
    }
}

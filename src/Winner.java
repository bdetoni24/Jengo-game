public class Winner {
    //attributi
    private Player winner=null;
    
    //funzioni
    public boolean isEnd(){
        boolean ret=true;
        if(winner==null){
            ret=false;
        }
        return ret;
    }
    
    public void setEnd(Player player){
        winner = player;
    }
}

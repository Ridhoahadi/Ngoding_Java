import java.util.*; 

class BowlingGame {
    HashMap<String, Integer> players;
    BowlingGame() {
        players = new HashMap<String, Integer>();
    }
    public void addPlayer(String name, int p) {
        players.put(name, p);
    }
    //your code goes here
    public void getWinner(){
        String best="";
         Iterator<Map.Entry<String, Integer>>it =players.entrySet().iterator();
        int max=0;
        while(it.hasNext()){
            String playerName=it.next().getKey();
            Integer checkVal=players.get(playerName);
            if(checkVal>=max)
            {    
                max=checkVal;
                best=playerName;
            }
        }
        System.out.println(best);
    }
}
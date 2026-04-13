/*
The Java program below takes as input the names of cricket players in a team and the runs
scored by each of them in 3 consecutive matches. The program is supposed to print the
names of those players who have scored at least 80 runs in all the matches. Complete the
code to obtain the specified output.
Class Team has the following members:
• Instance variable Map<String, ArrayList<Integer>> playerMap (maps the player
name to the list of runs scored by him/her in each match).
• A constructor to initialize the instance variable.
• An accessor method to access the instance variable.
*/

package sep2024OPPE1revision;
import java.util.*;
class Team{
    private Map<String, ArrayList<Integer>> playerMap;
    public Team(Map <String, ArrayList<Integer>>m){
        playerMap = m;
    }
    public Map<String, ArrayList<Integer>> getPlayerMap(){
        return playerMap;
    }
}
public class typefour {
    public static ArrayList<String> getFinalList(Team t){
        //define the method getfinalist() here
        ArrayList<String>pList = new ArrayList<String>();
        Map<String, ArrayList<Integer>> pmap = t.getPlayerMap();
        for(String p: pmap.keySet()){
            boolean flag = true;
            for(Integer i : pmap.get(p)){
                if(i<80){
                    flag = false;
                    break;
                }
            }
            if(flag)
                pList.add(p);
        }
        return pList;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, ArrayList<Integer>> pmap = new LinkedHashMap<String, ArrayList<Integer>>();
        for (int i =0; i<3; i++){
            ArrayList<Integer> pruns = new ArrayList<Integer>();
            String name = sc.next();
            for (int j = 0; j< 3; j++){
                pruns.add(sc.nextInt());
            }
            pmap.put(name, pruns);
        }
        Team t = new Team (pmap);
        System.out.println(getFinalList(t));
    }
}

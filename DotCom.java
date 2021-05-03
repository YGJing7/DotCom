import java.util.*;

public class DotCom{
    private ArrayList<String> locationCells;
    private String name;

    public void setLocationCells(ArrayList<String> loc){
        locationCells = loc;
    }

    public void setName(String newname){
        name = newname;
    }

    public String checkYourself(String userguess){
        String result = "miss";
        int idx = locationCells.indexOf(userguess);
        if (idx >= 0){
            locationCells.remove(idx);
            if (locationCells.isEmpty()){
                result = "kill";
                System.out.println("Ouch! You sunk "+name+"   :(");
            }else{
                result = "hit";
            }
        }
        return result;
    }
}
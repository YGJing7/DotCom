import java.util.*;


class DotComBust{
    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComsList = new ArrayList<>();
    private int numOfGuesses;
    Scanner in = new Scanner(System.in);

    private void setUpGame(){
        DotCom one = new DotCom();
        one.setName("pets.com");
        DotCom two = new DotCom();
        two.setName("Go.com");
        DotCom three = new DotCom();
        three.setName("eToys.com");

        dotComsList.add(one);
        dotComsList.add(two);
        dotComsList.add(three);

        for (DotCom dotComToSet : dotComsList){
            ArrayList<String> locations = helper.placeDotCom(3);
            dotComToSet.setLocationCells(locations);
        }

        System.out.println("Your goal is to sink three dot coms");
        System.out.println("pets.com, Go.com, eToys.com");
        System.out.println("Try to sink them all in the fewest number of guesses!");
    }
	
	private void getLocations() {
		for (String item : locations) {
			System.out.print(item+" ");
		}
	}

    private void startePlaying(){
        while(!dotComsList.isEmpty()){
            String userguess = in.next();
            checkUserGuess(userguess);
        }
        finishGame();
    }

    private void checkUserGuess(String userguess){
        numOfGuesses++;
        String result = "miss";

        for (DotCom dotComToTest : dotComsList){
            result = dotComToTest.checkYourself(userguess);
            if (result.equals("hit")){
                break;
            }
            if (result.equals("kill")){
                dotComsList.remove(dotComToTest);
                break;
            }
        }
        System.out.println(result);
    }

    private void finishGame(){
        System.out.println("All Dot Com are dead! Your stock is not worthless.");
        if (numOfGuesses <= 18){
            System.out.println("It only took you "+numOfGuesses+" guesses.");
            System.out.println("You got out before your options sank.");
        }else{
            System.out.println("Took you loog enough. "+numOfGuesses+" guesses");
            System.out.println("Fish are dancing with your options.");
        }
    }

    public static void main(String[] agrs){
        DotComBust game = new DotComBust();
        game.setUpGame();
		
        game.startePlaying();
    }
}
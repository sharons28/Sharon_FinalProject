package animalpictionary;

public class AnimalPictionary {
    private String name;
    private int numberOfTries;
    private int score;

    public AnimalPictionary(String n, int nt, int s){
        this.name= n;
        this.numberOfTries= nt;
        this.score= s;
    }

    public void correctAnswer(String inputName) {
        while (numberOfTries <= 3) {
            if (name.equals(inputName)) {
                score += 2;
                numberOfTries--;
            }
        }
    }

    public void nextPicture(){

    }


}

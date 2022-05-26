package animalpictionary;

public class ScoreInformation {
    private String name;
    private int score;
    private int rank;

    public ScoreInformation(String n, int s){
        this.name=n;
        this.score=s;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Name:'" + name + '\'' +
                "Score: " + score + '\''+
                "Rank: " + rank + "\n";
    }
}

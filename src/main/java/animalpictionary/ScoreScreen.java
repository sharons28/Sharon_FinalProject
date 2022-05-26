package animalpictionary;

public class ScoreScreen {
    private ScoreInformation[] record;
    private int index;

    //constructor
    public ScoreScreen() {
        record = new ScoreInformation[10];
        index = 0;
    }
    public void addInfo(ScoreInformation ss) {
        if (index < record.length) {
            record[index] = ss;
            System.out.println("Information is successfully added!");
            index++;
        }
    }
    public String displayInfo(){
        String display= " ";
        for (int i = 0; i < record.length; i++) {
                display= record[i].toString();
            }
        return display;
        }
    public ScoreInformation getHighest(){
        ScoreInformation highest= record[0];
        for (int i = 0; i < record.length; i++) {
            if (record[i].getScore() > highest.getScore()) {
                highest = record[i];
            }
        }
        return highest;
    }


}

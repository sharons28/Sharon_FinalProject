package animalpictionary;

import javafx.scene.image.Image;

import java.io.File;

public class AnimalPictionary {
    private String name;
    private int numberOfTries;
    private int score;
    public File[] files;
    public Image[] images;
    private int index;
    private boolean play;


    public AnimalPictionary() {
        numberOfTries = 3;
        score = 0;
        index = 0;
        files = new File[3];
        images = new Image[3];
        play = true;
        setFilesAndImages();
    }

    public void setFilesAndImages() {
        files[0] = new File("src/main/resources/animalpictionary/SharkAndHorse.jpeg");
        files[1] = new File("src/main/resources/animalpictionary/PigAndDuck.jpeg");
        files[2] = new File("src/main/resources/animalpictionary/EagleAndDog.jpeg");
        files[3] = new File("src/main/resources/animalpictionary/PandaAndPenguin.jpeg");

        for (int i = 0; i < images.length; i++) {
            images[i] = new Image(files[i].toURI().toString());
        }
    }

    public boolean CorrectGuess(String inputName1, String inputName2) {
        play = true;
        while (numberOfTries > 0) {
            if (images[index] == images[0]) {
                if (inputName1.equals("Dog") && inputName2.equals("Horse") || inputName1.equals("Horse") && inputName2.equals("Dog")) {
                    score += 2;
                    numberOfTries--;
                } else if (inputName1.equals("Dog") || inputName2.equals("Horse") || inputName1.equals("Horse") || inputName2.equals("Dog")) {
                    score += 1;
                    numberOfTries--;
                }
            }
            if (images[index] == images[1]) {
                if (inputName1.equals("Pig") && inputName2.equals("Duck") || inputName1.equals("Duck") && inputName2.equals("Pig")) {
                    score += 2;
                    numberOfTries--;
                } else if (inputName1.equals("Pig") || inputName2.equals("Duck") || inputName1.equals("Duck") || inputName2.equals("Pig")) {
                    score += 1;
                    numberOfTries--;
                }
            }
            if (images[index] == images[2]) {
                if (inputName1.equals("Eagle") && inputName2.equals("Dog") || inputName1.equals("Dog") && inputName2.equals("Eagle")) {
                    score += 2;
                    numberOfTries--;
                } else if (inputName1.equals("Eagle") || inputName2.equals("Dog") || inputName1.equals("Dog") || inputName2.equals("Eagle")) {
                    score += 1;
                    numberOfTries--;
                }
            }
            if (images[index] == images[3]) {
                if (inputName1.equals("Panda") && inputName2.equals("Penguin") || inputName1.equals("Penguin") && inputName2.equals("Panda")) {
                    score += 2;
                    numberOfTries--;
                } else if (inputName1.equals("Panda") || inputName2.equals("Penguin") || inputName1.equals("Penguin") || inputName2.equals("Panda")) {
                    score += 1;
                    numberOfTries--;
                }
            } else {
                numberOfTries--;
            }
        }
        return false;
    }

    public Image nextPicture() {
        Image image = images[0];
        if (numberOfTries == 0) {
            if (index < images.length) {
                image = images[index];
                index++;
                if (index >= images.length) {
                    index = images.length - 1;
                }
            }
        }
        return image;
    }

    public String clues() {
        String display = " ";
        while (numberOfTries <= 3) {
            if (images[index] == images[0]) {
                display = "The first animal lives in the ocean, the second one eats grass.";
            } else if (images[index] == images[1]) {
                display = "The first animal likes mud, the second one is yellow.";
            } else if (images[index] == images[2]) {
                display = "The first animal flies, the second one is arguable the most popular pet.";
            } else if (images[index] == images[3]) {
                display = "The first animal eats bamboo, the second one lives on the ice.";
            }
        }
        return display;
    }
}

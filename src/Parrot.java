import java.util.Random;

public class Parrot extends Pet {

    public Parrot() { super(); setSoundBehavior(new TweetSound()); setMoveBehavior(new FlyBehavior());}

    public Parrot(String name, int age, Sex sex, Color color) {
        super(name, age, sex, color, new TweetSound(), new FlyBehavior());
    }

    void learnNewSound(SoundBehavior newSoundBehavior) {
        Random rand = new Random();
        if (rand.nextFloat() > 0.5) {
            super.setSoundBehavior(newSoundBehavior);
            System.out.println("Ваш попугай научился издавать новый звук!");
        }
        else
        {
            System.out.println("Ваш попугай ничему не научился...");
        }
    }

}



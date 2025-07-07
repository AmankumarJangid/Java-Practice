package Challenges.second;

public abstract class Bird implements Flyable{
    private final String breed;

    Bird(String breed){
        this.breed = breed;
    }

    public void getBreed() {
        System.out.println(this.breed);
    }
}

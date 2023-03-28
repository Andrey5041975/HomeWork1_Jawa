public class Planet {
    public int  numberOfMoons;
    public String name;
    public String namesOfMoons[];
    Planet(){}

    Planet (int numberOfMoons){
        this.numberOfMoons = numberOfMoons;
    }

    Planet (String name){
        this.name = name;
    }

    Planet (int numberOfMoons, String name){
        this.numberOfMoons = numberOfMoons;
        this.name = name;
    }
    Planet (int numberOfMoons, String name, String namesOfMoons[]){
        this.numberOfMoons = numberOfMoons;
        this.name = name;

    }
}

package dk.kea.models;

public class Character {

    private String name;

    public String getName() {
        return name;
    }

    public Character(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                '}';
    }

}

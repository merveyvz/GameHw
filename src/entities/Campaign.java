package entities;

public class Campaign {
    private String name;

    public Campaign(){

    }

    public Campaign(String name){
        this.setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

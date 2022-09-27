class Monster {
    private String name;
    private int hp=100;

    public Monster(String name, int hp){
        this.name= name;
        this.hp=hp;
    }

    public int punched(int damage){
        this.hp= this.hp -damage;
        return this.hp;
    }


    //Getters and Setters
    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public int getHp() {return hp;}

    public void setHp(int hp) {this.hp = hp;}
}
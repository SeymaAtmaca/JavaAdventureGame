package JavaOOPOyun;

public abstract class GameCharacters {
    private String name;
    private int Damage;
    private int Healthy;
    private int Money;
    private int id ;

    public GameCharacters(int id, String name, int Damage, int Healthy, int Money){
        this.id = id;
        this.name = name;
        this.Damage = Damage;
        this.Healthy = Healthy;
        this.Money = Money;
    }





    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public int getDamage() {
        return Damage;
    }

    public void setDamage(int damage) {
        Damage = damage;
    }
    
    public int getHealthy() {
        return Healthy;
    }

    public void setHealthy(int healthy) {
        Healthy = healthy;
    }

    public int getMoney() {
        return Money;
    }

    public void setMoney(int money) {
        Money = money;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
}

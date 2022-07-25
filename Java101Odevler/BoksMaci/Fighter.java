package BoksMaci;

public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    int dodge;

    Fighter(String name, int damage, int health, int weigh, int dodge) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weigh;
        this.dodge = dodge;

    }

    int hit(Fighter foe) {
        System.out.println(this.name + " => " + foe.name + " " + this.damage + " Hasar Vurdu..");
        if (foe.isDodge()) {
            System.out.println(foe.name + " Hasari Savusturdu.....");
            System.out.println("==================");
            return foe.health;
        }
        if (foe.health - this.damage < 0) {
            return 0;
        }
        return foe.health - this.damage;

    }

    boolean isDodge() {
        double randomnumber = Math.random() * 100;
        return randomnumber <= this.dodge;

    }

}
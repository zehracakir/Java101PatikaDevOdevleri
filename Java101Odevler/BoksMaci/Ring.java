package BoksMaci;

public class Ring {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;
    int counter;
    int coinflip;

    Ring(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.maxWeight = maxWeight;
        this.minWeight = minWeight;
    }

    void run() {
        if (isCheck()) {
            this.counter = 1;
            if (isCoinFlip()) {
                while (this.f1.health > 0 && this.f2.health > 0) {
                    System.out.println(
                            "========================*** " + "ROUND" + " " + counter + " ***========================");
                    this.f2.health = this.f1.hit(f2);
                    if (isWin()) {
                        break;
                    }
                    this.f1.health = this.f2.hit(f1);
                    if (isWin()) {
                        break;
                    }
                    System.out.println(this.f1.name + " Saglik : " + this.f1.health);
                    System.out.println(this.f2.name + " Saglik : " + this.f2.health);
                    this.counter++;
                }
            } else {
                while (this.f1.health > 0 && this.f2.health > 0) {
                    System.out.println(
                            "========================*** " + "ROUND" + " " + counter + " ***========================");
                    this.f1.health = this.f2.hit(f1);
                    if (isWin()) {
                        break;
                    }
                    this.f2.health = this.f1.hit(f2);
                    if (isWin()) {
                        break;
                    }
                    System.out.println(this.f1.name + " Saglik : " + this.f1.health);
                    System.out.println(this.f2.name + " Saglik : " + this.f2.health);
                    this.counter++;

                }
            }

        } else {
            System.out.println("Siklet Uyusmazligi Tespit Edildi...\nDovus Baslatilamiyor...");
        }

    }

    boolean isCheck() {
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight)
                && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);

    }

    boolean isWin() {
        if (this.f1.health == 0) {
            System.out.println("MACI KAZANAN" + "========**=" + this.f2.name + "=**========\n** IRON MIKE **");
            return true;
        }
        if (this.f2.health == 0) {
            System.out
                    .println("MACI KAZANAN ==>>>>" + "========**= " + this.f1.name + " =**========\n** THE BIGGEST **");
            return true;
        }
        return false;
    }

    boolean isCoinFlip() {
        double randomflip = Math.random() * 100; //
        return randomflip <= 50;
    }
}

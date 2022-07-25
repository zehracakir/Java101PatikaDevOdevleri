package BoksMaci;

/*
 * Boks Maçı *
Java Sınıflar ile boks maçını simüle eden programı yazıyoruz.
Projeye ilk kimin dövüşe başlayacağını %50 olasılık ile hesaplıyoruz.
 */
public class Main {
  // @zehracakir

  public static void main(String[] args) {

    Fighter f1 = new Fighter("Muhammed_Ali", 16, 141, 107, 80);
    Fighter f2 = new Fighter("Mike_Tyson", 15, 140, 100, 63);

    Ring bigmatch = new Ring(f1, f2, 90, 120);
    bigmatch.run();

  }
}
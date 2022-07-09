package ObserverDesignPattern;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
       /*
                                    OBSERVER
   Nesneler arasında birden çoka bağımlılık tanımla  ve bir nesne durum değiştirdiğinde bağımlı olanların
   otomatik güncellemesini sağlar.Davranışsal tasarım deseni.

   kullanıcılar observer gözlemci
   gözlemenen şey observable

        */
        BigDecimal minSicaklik = BigDecimal.valueOf(23);
        BigDecimal maxSicaklik = BigDecimal.valueOf(28);

        //termometre gözlemlenen şey. --observable--
        Termometre termometre = new Termometre(minSicaklik, maxSicaklik);

        Ebeveyn anne = new Ebeveyn("Anne");
        Ebeveyn baba = new Ebeveyn("Baba");

        //observable'ye anne ve babayı gözlemci olarak ekiyoruz
        //sıcaklık 28 i aştığında anne babayı uyarıyoruz.
        //sıcaklık 23 den aşağı düştüğünde anne babayı uyarıyoruz.
        //anne baba gözlemliyor.
        termometre.ekle(anne);
        termometre.ekle(baba);

        for (int i = termometre.getAnlikSicaklik().intValue(); i <= 30; i++){
            termometre.setAnlikSicaklik(BigDecimal.valueOf(i));
        }

        System.out.println("---------------------------------");
        for (int i = termometre.getAnlikSicaklik().intValue(); i >= 22; i--){
            termometre.setAnlikSicaklik(BigDecimal.valueOf(i));
        }

    }
}

package CommandDesignPattern;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        /*
        Command ( Komut ) tasarım deseni, bir isteği kendisi ile ilgili tüm bilgileri içeren bağımsız bir nesneye
         dönüştüren davranışsal bir tasarım desenidir. Bu dönüşüm, istekleri metot parametresi olarak göndermenize,
         işlenmelerini geciktirmenize ya da sıraya sokmanıza ve geri alınamaz işlemleri desteklemenize olanak verir.
         Command pattern ile bir isteği her bir işlemin karmaşıklığı kendi nesnesi içerisnide olur.
         Hepsi birbirinden bağımsız olarak istek gelirse üst alma coommand , bölme command , mod alma command gibi
         bir çok isteğide basit bir şekilde ekleyebiliriz.

         Davranışsal Tasarım deseni.
         */

        BigDecimal sayi1 = BigDecimal.TEN;
        BigDecimal sayi2 = BigDecimal.valueOf(2);

        BigDecimal toplam = HesapMakinesi.islem(new ToplamCommand(), sayi1, sayi2);
        BigDecimal cikarma = HesapMakinesi.islem(new CikarmaCommand(), sayi1, sayi2);
        BigDecimal carpma = HesapMakinesi.islem(new CarpmaCommand(), sayi1, sayi2);

        System.out.println("Toplam: " + toplam);
        System.out.println("Fark: " + cikarma);
        System.out.println("Çarpma: " + carpma);


    }
}

package IteratorDesignPattern;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        /*

        Iterator, bir koleksiyonun öğelerini tiplerinden bağımsız
        (list, stack, tree vb.) tarayarak tekrarlı bir işlem yapmak istediğiniz durumlarda kullanılır.

        Örneğimizde kitap soruları listelerden,fasikül soruları arraylardan oluşuyor.
        normalde bunları bi methoda veremeyiz çünkü farklı yapılar.
        Iterator sayesinde bunları verebiliyoruz.

        */

        Kitap kitap = new Kitap("Matematik");
        Fasikul fasikul = new Fasikul("Türkce");
        Iterator soruIteratorKitap = kitap.getSoruIterator();
        Iterator soruIteratorFasikul = fasikul.getSoruIterator();

        yazdir(soruIteratorKitap);
        yazdir(soruIteratorFasikul);
    }
    private static void yazdir(Iterator iterator) {
        while (iterator.hasNext()) {
            Soru soru = (Soru) iterator.next();

            Long soruNo = soru.getSoruNo();

            System.out.println("Soru No: " + soruNo);
        }
    }
}

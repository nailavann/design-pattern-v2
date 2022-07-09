package StateDesignPattern;

public class Main {
    public static void main(String[] args) {
        /*
        State design patterni, nesnenin iç durumundaki değişikliklere göre çalışma zamanında
         farklı davranışlar sergilemesini sağlayan tasarım kalıbıdır. Yani biraz daha açarsak
         nesne belli özelliklerindeki değişimlere göre farklı davranışlar,
         fonksiyonellikler sergilemesi gibi düşünebiliriz.
         Davranışsal tasarım deseni.

        */

        Oyun oyun = new Oyun();
        //oyun başlarken hücum durumu ile başlanıyor.
        oyun.x();
        oyun.ucgen();
        oyun.kare();
        oyun.topuKaptir(); // topu kaptırdık.burada durum değişiyor ve defans durumu devreye giriyor.

        oyun.x();
        oyun.kare();
        oyun.topuKap();
    }
}

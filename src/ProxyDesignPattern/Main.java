package ProxyDesignPattern;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
      /*

          Proxy başka bir nesne için bir yedek veya yer tutucu sağlamanıza olanak tanıyan yapısal bir tasarım desenidir.
          Bir proxy, orijinal nesneye erişimi kontrol ederek,
          istek orijinal nesneye ulaşmadan önce veya sonra bir şeyler gerçekleştirmenize izin verir.

          Yapısal tasarım deseni
       */

        YoneticiProxy yoneticiProxy = new YoneticiProxy("nail", "12345");

        try {
            BigDecimal ciro = yoneticiProxy.getCiro();
            System.out.println("Şirket Cirosu: " + ciro);
        } catch (IllegalAccessException e) {
            System.out.println("Hassas bilgilere erişiminiz yoktur!");
        }

    }
}

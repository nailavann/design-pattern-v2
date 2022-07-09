package StateDesignPattern;

public class Oyun {
    private Konsol konsol;

    public Oyun() {
        System.out.println("Oyun başladı.");

        konsol = new Hücum();
    }

    public void ucgen(){
        konsol.ucgenBas();
    }

    public void kare(){
        konsol.kareBas();
    }

    public void yuvarlak(){
        konsol.yuvarlakBas();
    }

    public void x(){
        konsol.xBas();
    }

    public void topuKap(){
        //durum değiştiriliyor.top kaptıysak hücuma çıkıcaz tuşlar değişcek.
        System.out.println("Top kapıldı. Hücuma çıkılıyor!");
        konsol = new Hücum();
    }

    public void topuKaptir(){
        //durum değiştiriliyor.topu kaptırdıysak defans yapıcaz çıkıcaz tuşlar değişcek.
        System.out.println("Top kaptırıldı! Allah'ını seven defansa gelsin :)");
        konsol = new Defans();
    }
}

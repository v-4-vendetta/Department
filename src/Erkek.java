import java.time.Year;
import java.util.Date;

public class Erkek extends Personel{
    private String ad;
    private String soyad;
    private int dogumtarihi;
    public Erkek(String adi,String soyadi, int dogumyili)
    {
        this.ad=adi;
        this.soyad=soyadi;
        this.dogumtarihi=dogumyili;
    }

    void emeklilikHesapla() {
        Date d=new Date();
        int year= Year.now().getValue();
        if(year-dogumtarihi >= 65)
            System.out.println(ad + " " + soyad + " isimli personel emekli olmuştur.");
        else
            System.out.println(ad + " " + soyad + " isimli personel henüz emekli olmamıştır.");
    }
}

import java.time.Year;
import java.util.Date;

public class Kadin extends Personel{
    private String ad;
    private String soyad;
    private int dogumtarihi;
    public Kadin(String adi,String soyadi, int dogumtarihi)
    {
        this.ad=adi;
        this.soyad=soyadi;
        this.dogumtarihi=dogumtarihi;
    }
    void emeklilikHesapla() {
        Date d=new Date();
        int year= Year.now().getValue();
        if(year-dogumtarihi >= 60)
            System.out.println(ad + " " + soyad + " isimli personel emekli olmuştur.");
        else
            System.out.println(ad + " " + soyad + " isimli personel henüz emekli olmamıştır.");
    }
}

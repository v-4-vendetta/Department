public class Personel {
    //Departman isminde sınıf oluşturun, bu sınıf özellikleri olarak [class team lead, personel list, assignment list] içermelidir. team lead olmadan bir ekip oluşturulamaz, sınıfın yöntemleri [teamlead değiştirme, personel ekleme/çıkarma/değiştirme, görev ekleme, görevi tamamlandı olarak işaretleme] olmalıdır, team lead ve personel Departman sınıfının örnekleri, görevler ise metin dizileri olarak oluşturulmalıdır. Erkek ve Kadın sınıflarını uygulayın; her ikisi de [ad, soyad, doğum tarihi] alanlarına sahiptir. Hem erkekler hem de kadınlar emekli olma zamanını hesaplayan bir yönteme sahiptir, ancak erkekler 65 yaşında emekli olurken kadınlar 60 yaşında emekli olur.
    private String ad;
    private String soyad;
    private int dogumtarihi;

    public String getAd() {
        return ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public int getDogumtarihi() {
        return dogumtarihi;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public void setDogumtarihi(int dogumtarihi) {
        this.dogumtarihi = dogumtarihi;
    }

}

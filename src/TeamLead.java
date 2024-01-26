public class TeamLead extends Personel{
    private String ad;
    private String soyad;
    private int dogumtarihi;

    @Override
    public String getAd() {
        return ad;
    }

    @Override
    public void setAd(String ad) {
        this.ad = ad;
    }

    @Override
    public String getSoyad() {
        return soyad;
    }

    @Override
    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    @Override
    public int getDogumtarihi() {
        return dogumtarihi;
    }

    @Override
    public void setDogumtarihi(int dogumtarihi) {
        this.dogumtarihi = dogumtarihi;
    }

}

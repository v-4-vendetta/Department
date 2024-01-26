//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private String isim;
    private String soyisim;
    private int dogumyili;

    public void main(String[] args) {

        Personel personel = new Personel();

        isim="Mahir";
        soyisim="Nazlı";
        dogumyili=1971;
        Erkek erkek = new Erkek(isim,soyisim,dogumyili);
        erkek.emeklilikHesapla();

        personel.setAd(isim);
        personel.setSoyad(soyisim);
        personel.setDogumtarihi(dogumyili);


        TeamLead teamLead = new TeamLead();
        teamLead.setAd(isim);
        teamLead.setSoyad(soyisim);
        teamLead.setDogumtarihi(dogumyili);

        String[] tasks = {"task1", "task2", "task3"};
        Departman dept = new Departman(teamLead,personel,tasks);
        dept.personelekleme(personel);
        dept.personelcikarma(personel);

        isim="Beste";
        soyisim="Nazlı";
        dogumyili=2008;
        Kadin kadin = new Kadin(isim,soyisim,dogumyili);
        kadin.emeklilikHesapla();
        personel.setAd(isim);
        personel.setSoyad(soyisim);
        personel.setDogumtarihi(dogumyili);
        dept.personeldegistirme(personel);

        Task task = new Task();
        task.setTasklist(tasks);
        dept.taskekleme(task);
        dept.taskguncelleme(task);

        dept.teamleadchange(isim,soyisim);
    }
}
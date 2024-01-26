public class Departman {
    private TeamLead teamlead;
    private Personel personel;
    private String[] tasklist;
    public Departman(TeamLead teamlead, Personel personel, String[] tasklist) {
        this.teamlead=teamlead;
        this.personel=personel;
        this.tasklist=tasklist;
    }

    public void teamleadchange(String ad, String soyad) {
        this.teamlead.setAd(ad);
        this.teamlead.setSoyad(soyad);
        System.out.println("Teamlead değiştirildi!");
    }

    public void personelekleme(Personel personel) {
        this.personel = personel;
        System.out.println("Yeni personel eklendi!");
    }

    public void personelcikarma(Personel personel) {
        System.out.println("Personel çıkarıldı!");
        this.personel = personel;
    }

    public void personeldegistirme(Personel personel) {
        this.personel = personel;
        System.out.println("Personel değiştirildi!");
    }

    public void taskekleme(Task task) {
        String[] tasks = {"task1", "task2","task3","task4" };
        task.setTasklist(tasks);
        System.out.println("Yeni task eklendi!");
    }

    public void taskguncelleme(Task task) {
        String[] tasks = task.getTasklist();
        String oldtask = tasks[0];
        tasks[0]="task1changed";
        this.tasklist=tasks;
        System.out.println(oldtask + " task'ı " + tasks[0] + " olarak  güncellendi!");
    }

}

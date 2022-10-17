package relasiclass.tugas;

public class MainPercobaan {
    public static void main(String[] args) {
        Peserta p = new Peserta("12345", "Daffa Maulana");
        Ujian u = new Ujian("ABC123", "Ujian Matematika");
        Gedung g = new Gedung("Gedung Kedokteran", 5);
        g.setPenumpang(p, 1);
        g.setUjian(u, 1);
        Peserta p1 = new Peserta("67891", "Akbar Maulana ");
        Ujian u1 = new Ujian("DEF456", "Ujian Matematika");
        g.setPenumpang(p1, 1);
        g.setUjian(u1, 1);
        System.out.println(g.info());
    }
}

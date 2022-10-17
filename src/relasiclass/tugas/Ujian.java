package relasiclass.tugas;

public class Ujian {
    private String noUjian;
    private String nama;

    Ujian(String noUjian, String nama) {
        this.noUjian = noUjian;
        this.nama = nama;
    }

    public void setNoUjian(String noUjian) {
        this.noUjian = noUjian;
    }

    public String getNoUjian() {
        return noUjian;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public String info() {
        String info = "";
        info += "No Ujian: " + noUjian + "\n";
        info += "Nama: " + nama + "\n";
        return info;
    }
}

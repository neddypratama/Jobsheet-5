package relasiclass.tugas;

public class Kursi {
    private String nomor;
    private Peserta peserta;
    private Ujian ujian;

    Kursi(String nomor) {
        this.nomor = nomor;
    }

    public void setNomor(String nomor) {
        this.nomor = nomor;
    }

    public String getNomor() {
        return nomor;
    }

    public void setPeserta(Peserta peserta) {
        this.peserta = peserta;
    }

    public Peserta getPeserta() {
        return peserta;
    }

    public void setUjian(Ujian ujian) {
        this.ujian = ujian;
    }

    public Ujian getUjian() {
        return ujian;
    }

    public String info() {
        String info = "";
        info += "Nomor: " + nomor + "\n";
        if (this.peserta != null && this.ujian != null) {
            info += "Ujian: " + "\n";
            info += ujian.info() + "\n";
            info += "Peserta: " + "\n";
            info += peserta.info() + "\n";
        }
        return info;
    }
}

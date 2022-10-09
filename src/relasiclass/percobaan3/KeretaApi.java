package relasiclass.percobaan3;

public class KeretaApi {
    private String nama;
    private String kelas;
    private Pegawai masinis;
    private Pegawai asisten;

    KeretaApi(String nama, String kelas, Pegawai masisnis) {
        this.nama = nama;
        this.kelas = kelas;
        this.masinis = masisnis;
    }

    KeretaApi(String nama, String kelas, Pegawai masisnis, Pegawai asisten) {
        this.nama = nama;
        this.kelas = kelas;
        this.masinis = masisnis;
        this.asisten = asisten;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public String getKelas() {
        return kelas;
    }

    public void setMasinis(Pegawai masinis) {
        this.masinis = masinis;
    }

    public Pegawai getMasinis() {
        return masinis;
    }

    public void setAsisten(Pegawai asisten) {
        this.asisten = asisten;
    }

    public Pegawai getAsisten() {
        return asisten;
    }

    public String info() {
        if (getAsisten() == null) {
            String info = "";
            info += "Nama: " + this.nama + "\n";
            info += "Kelas: " + this.kelas + "\n";
            info += "Masinis: " + this.masinis.info() + "\n";
            return info;
        } else {
            String info = "";
            info += "Nama: " + this.nama + "\n";
            info += "Kelas: " + this.kelas + "\n";
            info += "Masinis: " + this.masinis.info() + "\n";
            info += "Asisten: " + this.asisten.info() + "\n";
            return info;
        }
    }
}

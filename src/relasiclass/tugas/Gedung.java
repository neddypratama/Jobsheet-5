package relasiclass.tugas;

public class Gedung {
    private String NamaGedung;
    private Kursi arrayKursi[];

    private void initKursi() {
        for (int i = 0; i < arrayKursi.length; i++) {
            this.arrayKursi[i] = new Kursi(String.valueOf(i + 1));
        }
    }

    Gedung(String namaGedung, int jumlah) {
        this.NamaGedung = namaGedung;
        this.arrayKursi = new Kursi[jumlah];
        this.initKursi();
    }

    public void setNamaGedung(String namaGedung) {
        NamaGedung = namaGedung;
    }

    public String getNamaGedung() {
        return NamaGedung;
    }

    public void setUjian(Ujian ujian, int nomor) {
        Ujian u = arrayKursi[nomor - 1].getUjian();
        if (u != null) {
            this.arrayKursi[nomor].setUjian(ujian);
        } else {
            this.arrayKursi[nomor - 1].setUjian(ujian);
        }
    }

    public void setPenumpang(Peserta peserta, int nomor) {
        Peserta p = arrayKursi[nomor - 1].getPeserta();
        if (p != null) {
            this.arrayKursi[nomor].setPeserta(peserta);
        } else {
            this.arrayKursi[nomor - 1].setPeserta(peserta);
        }
    }

    public String info() {
        String info = "";
        info += "Nama Gedung: " + NamaGedung + "\n";
        for (Kursi kursi : arrayKursi) {
            info += kursi.info();
        }
        return info;
    }
}

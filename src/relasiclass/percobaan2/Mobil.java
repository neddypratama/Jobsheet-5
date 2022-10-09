package relasiclass.percobaan2;

public class Mobil {
    private String merk;
    private int biaya;

    Mobil() {

    }

    public void setMerk(String nama) {
        this.merk = nama;
    }

    public String getMerk() {
        return merk;
    }

    public void setBiaya(int biaya) {
        this.biaya = biaya;
    }

    public int getBiaya() {
        return biaya;
    }

    public int hitungBiayaMobil(int hari) {
        return biaya * hari;
    }
}

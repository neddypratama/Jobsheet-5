package relasiclass.percobaan3;

public class Pertanyaan {
    public static void main(String[] args) {
        Pegawai masinis = new Pegawai("1234", "Spongebob SquarePants");
        KeretaApi keretaApi = new KeretaApi("Gaya Baru", "Bisnis", masinis);

        System.out.println(keretaApi.info());
    }
}

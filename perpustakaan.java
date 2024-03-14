package tugasPemlan2;

public class perpustakaan {
    private String judul;
    private String penulis;
    private String tahunPembuatan;
    private String sinopsis;

    public perpustakaan(String judul, String penulis, String tahunPembuatan, String sinopsis) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunPembuatan = tahunPembuatan;
        this.sinopsis = sinopsis;
    }

    public int jumlahKataSipnosis() {
        String[] kataKata = sinopsis.split(" ");
        return kataKata.length;

    }

    public void displayBuku() {
        System.out.println(" 1. judul buku    :" + judul);
        System.out.println(" 2.penulis        :" + penulis);
        System.out.println(" 3. tahun pembuatan :" + tahunPembuatan);
        System.out.println(" 4. sinposis      :" + sinopsis);
        System.out.println(" 5. jumlahKata    :" + jumlahKataSipnosis());

    }

    public void displayBuku(perpustakaan[] perpustakaanArray) {
        int hitung = 0;
        for (perpustakaan perpus : perpustakaanArray) {
            hitung++;
            System.out.println("Buku ke-" + hitung);
            perpus.displayBuku();
            System.out.println();
        }
    }

}

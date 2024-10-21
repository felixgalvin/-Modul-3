abstract class Mahasiswa extends User {
    int NIM;
    String jurusan;

    public int getNIM() {
        return NIM;
    }

    public void setNIM(int NIM) {
        this.NIM = NIM;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public Mahasiswa(String nama, String alamat, String TTL, String telepon) {
        super(nama, alamat, TTL, telepon);
    }
}

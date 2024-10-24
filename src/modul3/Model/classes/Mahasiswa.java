package modul3.Model.classes;

abstract class Mahasiswa extends User {
    private int NIM;
    private String jurusan;

    public Mahasiswa(String nama, String alamat, String TTL, String telepon, int NIM, String jurusan) {
        super(nama, alamat, TTL, telepon);
        this.NIM = NIM;
        this.jurusan = jurusan;
    }

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

    @Override
    public String toString() {
        return super.toString() + ", NIM: " + getNIM() + ", Jurusan: " + getJurusan();
    }
}

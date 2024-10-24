package modul3.Model.classes;

public class Doktor extends Mahasiswa{
    private String judulTesis;
    private int nilaiS1;
    private int nilaiS2;
    private int nilaiS3;

    public Doktor(String nama, String alamat, String TTL, String telepon, int NIM, String jurusan, String judulTesis, int nilaiS1, int nilaiS2, int nilaiS3) {
        super(nama, alamat, TTL, telepon, NIM, jurusan);
        this.judulTesis = judulTesis;
        this.nilaiS1 = nilaiS1;
        this.nilaiS2 = nilaiS2;
        this.nilaiS3 = nilaiS3;
    }

    public String getJudulTesis() {
        return judulTesis;
    }

    public void setJudulTesis(String judulTesis) {
        this.judulTesis = judulTesis;
    }

    public int getNilaiS1() {
        return nilaiS1;
    }

    public void setNilaiS1(int nilaiS1) {
        this.nilaiS1 = nilaiS1;
    }

    public int getNilaiS2() {
        return nilaiS2;
    }

    public void setNilaiS2(int nilaiS2) {
        this.nilaiS2 = nilaiS2;
    }

    public int getNilaiS3() {
        return nilaiS3;
    }

    public void setNilaiS3(int nilaiS3) {
        this.nilaiS3 = nilaiS3;
    }

    @Override
    public String toString() {
        return super.toString() + ", Judul Tesis: " + getJudulTesis() + ", Nilai 1: " + getNilaiS1() + ", Nilai 2: " + getNilaiS2() + ", Nilai 3: " + getNilaiS3();
    }
}

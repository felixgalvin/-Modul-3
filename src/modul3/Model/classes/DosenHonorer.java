package modul3.Model.classes;

import java.util.ArrayList;

public class DosenHonorer extends Dosen{
    private int honorPerSKS;

    public DosenHonorer(String nama, String alamat, String TTL, String telepon, int NIK, String dapartemen, ArrayList<MatkulAjar> listMatkul, int honorPerSKS) {
        super(nama, alamat, TTL, telepon, NIK, dapartemen, listMatkul);
        this.honorPerSKS = honorPerSKS;
    }

    public int getHonorPerSKS() {
        return honorPerSKS;
    }

    public void getHonorPerSKS(int honorPerSKS) {
        this.honorPerSKS = honorPerSKS;
    }

    @Override
    public String toString() {
        return super.toString() + "Gaji per SKS: " + getHonorPerSKS();
    }
}

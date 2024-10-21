public class Staff extends User{
    int NIK;

    public int getNIK() {
        return NIK;
    }

    public void setNIM(int NIK) {
        this.NIK = NIK;
    }

    public Staff(String nama, String alamat, String TTL, String telepon) {
        super(nama, alamat, TTL, telepon);
    }
}

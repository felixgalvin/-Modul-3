abstract class User {
    protected String nama;
    protected String alamat;
    protected String TTL;
    protected String telepon;

    public User(String nama, String alamat, String TTL, String telepon) {
        this.nama = nama;
        this.alamat = alamat;
        this.TTL = TTL;
        this.telepon = telepon;
    }

    public String getName() {
        return nama;
    }

    public void setName(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTTL() {
        return TTL;
    }

    public void setTTL(String TTL) {
        this.TTL = TTL;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }
}

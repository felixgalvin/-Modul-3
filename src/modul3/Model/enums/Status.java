package modul3.Model.enums;

public enum Status {
    HADIR(0), ALPHA(1);

    private int value;

    public int getValue() {
        return value;
    }

    Status(int value) {
        this.value = value;
    }
}

package ngari.caroline;

public enum Option {
    encode(1),
    decode(2),
    exit(3);

    private int id;
    private Option(int id) {
        this.id = id;
    }
    public static Option fromId(int id) {
        for (Option type : values()) {
            if (type.getId() == id) {
                return type;
            }
        }
        return null;
    }
    public int getId() {
        return id;
    }
}

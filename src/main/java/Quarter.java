public enum Quarter {
    WINTER_20("20201"),
    FALL_19("20194"),
    ;

    private String quarterCode;

    Quarter(String quarterCode) {
        this.quarterCode = quarterCode;
    }

    public String getCode() {
        return quarterCode;
    }
}

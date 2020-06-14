enum DangerLevel {
    LOW,
    MEDIUM,
    HIGH;

    public int getLevel() {
        return ordinal() + 1;
    }
}
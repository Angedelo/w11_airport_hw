public enum Type {
    BOEING747(250),
    AIRBUSA380(200),
    DC9(175),
    HAIRDRYER(3);

    private final int capacity;
    Type(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return this.capacity;
    }

}


public enum Care {
    NOTHING(0),
    WATER(1),
    BROTH(2),
    FERTILIZER(3);

    private int care;

    Care(int care) {

        this.care = care;
    }

    public int getValue() {
        return care;
    }

    public static Care getEnum(int care) {
        for(Care c : values())
            if(c.getValue() == care) return c;
        throw new IllegalArgumentException();
    }
}

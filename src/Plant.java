public abstract class Plant {

    private String code;
    protected int size;
    private static final int sizeWhenWasted = 0;
    private int overGrowth;
    private boolean isAlive = true;

    public boolean isAlive() {
        return isAlive;
    }

    public Plant(String code, int size, int overGrowth) {
        this.code = code;
        this.size = size;
        this.overGrowth = overGrowth;
    }

    protected abstract void getCare(Care care);

    void grow(Care care) {
        if (isAlive) {
            getCare(care);
            checkHealth();
        }
    }

    void checkHealth() {
        if(size <= sizeWhenWasted){
            isAlive = false;
        }
    }

    public String getCode() {
        return code;
    }
}

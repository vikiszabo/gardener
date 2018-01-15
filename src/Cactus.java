public class Cactus extends Plant {

    public Cactus(String code, int size) {
        super(code, size, 4);

    }

    @Override
    protected void getCare(Care care){
        switch(care){
            case WATER: size -= 1;
                break;
            case BROTH: size -= 1;
                break;
            case FERTILIZER: size += 1;
                break;
        }
    }

}

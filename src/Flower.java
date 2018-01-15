public class Flower extends Plant {

    public Flower(String code, int size) {
        super(code, size, 6);

    }

    @Override
    protected void getCare(Care care){
        switch(care){
            case WATER: size += 3;
                break;
            case BROTH: size -= 1;
                break;
            case FERTILIZER: size -= 1;
                break;
        }
    }
}

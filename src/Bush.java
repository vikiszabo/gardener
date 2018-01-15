public class Bush extends Plant {

    public Bush(String code, int size) {
        super(code, size, 10);

    }

    @Override
    protected void getCare(Care care){
        switch(care){
            case WATER: size += 1;
                break;
            case BROTH: size += 1;
                break;
            case FERTILIZER: size -= 1;
                break;
        }
    }

}

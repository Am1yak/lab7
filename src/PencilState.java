public class PencilState implements State{
    private Selector selector;

    public PencilState(Selector selector){
        this.selector = selector;
    };

    @Override
    public void pressedD(){
        System.out.println("Already selected pencil");
    }

    @Override
    public void pressedE(){
        System.out.println("Selecting Eraser");
        selector.setState(selector.getEraserState());
    }

    @Override
    public void pressedF(){
        System.out.println("Selecting Bucket");
        selector.setState(selector.getBucketState());
    }

    @Override
    public void draw(){
        System.out.println("Drawing via pencil");
    }
}

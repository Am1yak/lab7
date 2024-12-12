public class BucketState implements State{
    private Selector selector;

    public BucketState(Selector selector){
        this.selector = selector;
    };

    @Override
    public void pressedD(){
        System.out.println("Selecting Pencil");
        selector.setState(selector.getPencilState());
    }

    @Override
    public void pressedE(){
        System.out.println("Selecting Eraser");
        selector.setState(selector.getEraserState());
    }

    @Override
    public void pressedF(){
        System.out.println("Already selecting Bucket");
    }

    @Override
    public void draw(){
        System.out.println("Drawing via Bucket");
    }
}

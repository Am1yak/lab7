public class EraserState implements State{
    private Selector selector;

    public EraserState(Selector selector){
        this.selector = selector;
    };

    @Override
    public void pressedD(){
        System.out.println("Selecting Pencil");
        selector.setState(selector.getPencilState());
    }

    @Override
    public void pressedE(){
        System.out.println("Already selected Eraser");
    }

    @Override
    public void pressedF(){
        System.out.println("Selecting Bucket");
        selector.setState(selector.getBucketState());
    }

    @Override
    public void draw(){
        System.out.println("Drawing via Eraser");
    }
}

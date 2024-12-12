public class Selector {
    private State PencilState;
    private State EraserState;
    private State BucketState;
    private State currentState;

    public Selector(){
        this.PencilState = new PencilState(this);
        this.EraserState = new EraserState(this);
        this.BucketState = new BucketState(this);
        currentState = PencilState;
    }

    public State getPencilState(){
        return PencilState;
    }

    public State getEraserState(){
        return EraserState;
    }

    public State getBucketState(){
        return BucketState;
    }

    public void setState(State state){
        currentState = state;
    }

    public void pressedD(){
        currentState.pressedD();
    }

    public void pressedE(){
        currentState.pressedE();
    }

    public void pressedF(){
        currentState.pressedF();
    }

    public void draw(){
        currentState.draw();
    }
}

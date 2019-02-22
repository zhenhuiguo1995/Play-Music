import marlin.Sandbox.Music1;
import marlin.Sandbox.Music2;
import marlin.graphicsLib.Window;

public class Main {
    public static void main(String[] args){
//        Window.PANEL = new Squares();
//        Window.PANEL = new PaintInk();
//        Window.PANEL = new ShapeTrainer();
//        Window.PANEL = new SimpleReaction();
        Window.PANEL = new Music2();
        Window.launch();

    }
}

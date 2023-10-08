package patterns.method_factory;


public class FiguresManager {

    private Figure figure;
    private FigureType type;

    public FiguresManager(FigureType type) {
        this.type = type;
    }

    public Figure getFigure() {
        return figure;
    }

    public FigureType getType() {
        return type;
    }

    public void createFigure() {
        this.figure = this.type.createFigure();
    }

    @Override
    public String toString() {
        return "FiguresManager{" +
                "figure=" + figure +
                ", type=" + type +
                '}';
    }
}
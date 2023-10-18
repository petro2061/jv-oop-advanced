package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        int arraySize = 6;
        Figure [] figures = new Figure[arraySize];
        FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 0; i < arraySize; i++) {
            if (i < arraySize / 2) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
        }

        for (Figure figure: figures) {
            figure.draw();
        }
    }
}
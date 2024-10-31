public class TestTetris {

    public static void main(String[] args) {
        Main[] Figures = new Main[3];
        Figures[0] = new Line();
        Figures[1] = new Square();
        Figures[2] = new Flash();

        for (int i = 0; i < Figures.length; i++) {
            Figures[i].Left();
            Figures[i].Right();
            Figures[i].Rotate();
            Figures[i].Down();
        }
    }
}


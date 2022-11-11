package KyborgProgram;

public class Program {
    private int parser;

    public Program () {
        parser = new Parser().getReader();
        new Functions(parser);
    }
}

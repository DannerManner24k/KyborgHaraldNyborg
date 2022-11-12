package KyborgProgram;

public class Functions {
    private int parserFunction;
    private Storage storage;

    public Functions () {
        this.parserFunction = parserFunction;
    }

    public int getParserFunction(int parserFunction) {
        switch (parserFunction) {
            case 10:
                System.out.println("Running searchItem function:");
                System.out.println("...");

                storage = new Storage();
                storage.addStorage();
                break;
            case 2:
                System.out.println("Incoming searchItemFunction");
        }
        return parserFunction;
    }
}

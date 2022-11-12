package KyborgProgram;

public class Functions {
    private int parserFunction;

    public Functions (int parserFunction) {
        this.parserFunction = parserFunction;

        if (parserFunction == 2) {
            System.out.println("Running searchItem function:");
            System.out.println("...");

            Storage storage = new Storage();
            storage.addStorage();

        }
    }

}

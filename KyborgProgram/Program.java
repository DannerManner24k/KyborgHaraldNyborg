package KyborgProgram;

public class Program {
    private Parser parser;
    private int parserInput;
    private Functions functions;

    public Program () {
        parser = new Parser();
        functions = new Functions();
    }

    public void start () {
        System.out.println("Welcome, this is Harald Nyborg A/S internal system, Kyborg. \nThis is a prototype made by DannerManner24k");

        boolean turnOff = false;
        while (!turnOff) {
            System.out.println("\nHere are the functions of the program: \n2. Search for an item by item ID \n10. Add an item to the storage");
            functions.getParserFunction(parser.getReader());
        }
    }
}

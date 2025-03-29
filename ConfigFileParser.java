public class ConfigFileParser {
    // Variables
    private int nrows = 0;
    private int ncols = 0;
    private int npieces = 0;
    private Vector<Pieces> piecesConfig = new Vector<>;
    private String filePath = "";

    // Constructor
    public ConfigFileParser(String filePath) {
        
    }

    public static void main(String[] args){
        ConfigFileParser parser = new ConfigFileParser();
        System.out.println(parser.nrows);
    }
}
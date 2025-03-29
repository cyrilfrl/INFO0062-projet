import java.util.Vector;

public class SlidingPuzzle {
    public static void main(String[] args) {
        FileReader fr = new FileReader("C:\\Users\\Cyril\\Desktop\\syllabus\\OOP\\projet\\klotzi.txt");
        Vector <String> lines = fr.readFile();
        for (String el : lines){
            System.out.println(el);
        }

        lines = fr.readFile();
        for (String el : lines){
            System.out.println(el);
        }

        lines = fr.readFile();
        for (String el : lines){
            System.out.println(el);
        }
    }
}


// https://stackoverflow.com/questions/4716503/reading-a-plain-text-file-in-java?page=1&tab=scoredesc#tab-top
// https://en.wikibooks.org/wiki/Java_Programming/Primitive_Types#:~:text=Primitive%20types%20are%20the%20most,of%20data%20manipulation%20in%20Java.
// https://docs.oracle.com/javase/8/docs/api/java/util/Vector.html
// https://www.geeksforgeeks.org/java-util-vector-class-java/
// https://docs.oracle.com/javase/8/docs/api/java/io/BufferedReader.html
// https://www.baeldung.com/java-buffered-reader
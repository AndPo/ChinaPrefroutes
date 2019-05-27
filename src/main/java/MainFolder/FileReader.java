package MainFolder;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileReader {

    public ArrayList readFromFile(String filePath){
        ArrayList lines = new ArrayList();
        try (Stream<String> stream = Files.lines(Paths.get(filePath))) {
            List list = stream.collect(Collectors.toList());
            lines = new ArrayList(list);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }
}

package T19_FunctionalStyle_andMore.Task1;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
public class Task1{public List<String> processFilePaths(List<String> paths) {
    List<String> result = new ArrayList<>(); //проходим циклом по всем путям файлов
    for (String path: paths) {
//для каждого пути получаем имя файла и добавляем его в итоговый список
        String fileName = Paths.get(path).getFileName().toString(); result.add(fileName);
    }
    return result;
}
    public static void main(String[] args) {
        List<String> paths = new ArrayList<>();
        paths.add("/home/bigbrother/docs/hide.txt");
        paths.add("hide.txt");
        paths.add("file3.tmp");
        paths.add("/home/bigbrother/downloads/movie.mp4");
        paths.add("/home/bigbrother/downloads/java_book.pdf");
        FilePathProcessor processor = new FilePathProcessor();
        List<String> processedPaths = processor.processFilePaths(paths);
        for (String newPath: processedPaths) {
            System.out.println(newPath); }
    }
}



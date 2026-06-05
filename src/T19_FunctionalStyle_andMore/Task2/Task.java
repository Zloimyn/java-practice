//package T19_FunctionalStyle_andMore.Task2;
//
//import java.nio.file.Paths;
//import java.util.ArrayList;
//import java.util.List;
//
//public class Task2 {
//    public List<String> Task2(List<String> paths) {
//        List<String> result = new ArrayList<>(); //проходим циклом по всем путям файлов for (String path: paths) {
//        //проверяем, что файл не имеет расширения .tmp
//        if (!isTempFile(path)) {
////получаем имя файла из его пути
//            String fileName = getFileName(path); //переименовываем файлы с именем hide
//            fileName = renameSecretFiles(fileName);
//            result.add(fileName);
//        } }
//        return result;
//}
//private String getFileName(String filePath) {
//    return Paths.get(filePath).getFileName().toString(); }
//
//private String renameSecretFiles(String fileName) {
//    if (fileName.startsWith("hide")) {
//        return fileName.replace("hide", "very_secret_file");
//    } else {
//        return fileName;
//    }
//}
//private boolean isTempFile(String fileName) {
//    return fileName.endsWith(".tmp");
//}
//public static void main(String[] args) {
//    List<String> paths = new ArrayList<>();
//    paths.add("/home/bigbrother/docs/hide.txt");
//    paths.add("hide.txt");
//    paths.add("file3.tmp");
//    paths.add("/home/bigbrother/downloads/movie.mp4");
//    paths.add("/home/bigbrother/downloads/java_book.pdf");
//    FilePathProcessor processor = new FilePathProcessor();
//    List<String> processedPaths = processor.processFilePaths(paths);
//    for (String newPath: processedPaths) {
//        System.out.println(newPath); }
//} }

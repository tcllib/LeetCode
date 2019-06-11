package interview;

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FileSize {
    public String solution(String S) {
        if(S == null || S.isEmpty()) {
            return S;
        }

        String[] fileList = getFileList(S);

        Map<String, Integer> resultMap = new HashMap<>();
        initMap(resultMap);

        for(String file: fileList) {
            String[] fileInfo = file.split(" ");
            String fileName = fileInfo[0];
            Integer fileSize = getFileSize(fileInfo[1]);
            String type = getFileType(fileName);

            Integer size = resultMap.get(type);
            size += fileSize;
            resultMap.put(type, size);
        }

        return getReport(resultMap);
    }

    private void initMap(Map<String, Integer> resultMap) {
        Arrays.stream(FileType.values())
              .map(Enum::toString)
              .forEach(type -> resultMap.put(type, 0));
    }

    public String getReport(Map<String, Integer> resultMap) {
        return resultMap.entrySet()
                        .stream()
                        .sorted(Comparator.comparing(entry -> FileType.valueOf(entry.getKey())))
                        .map(entry -> String.format("%s %sb", entry.getKey(), entry.getValue()))
                        .collect(Collectors.joining("\n"));
    }

    public Integer getFileSize(String s) {
        return Integer.valueOf(s.substring(0, s.length()-1));
    }

    public String getFileType(String fileName) {
        String[] split = fileName.split("\\.");
        String extension = split[split.length - 1];
        switch (extension) {
            case "mp3": case "aac": case "flac":
                return FileType.music.toString();

            case "jpg": case "bmp": case "gif":
                return FileType.images.toString();

            case "mp4": case "avi": case "mkv":
                return FileType.movies.toString();

            default:
                return FileType.other.toString();
        }
    }

    public String[] getFileList(String s) {
        return s.split("\\r?\\n");
    }

    public enum FileType{
        music, images, movies, other;
    }
}

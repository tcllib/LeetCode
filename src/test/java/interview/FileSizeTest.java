package interview;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FileSizeTest {
    private FileSize fileSize;

    @BeforeEach
    void setUp() {
        fileSize = new FileSize();
    }

    @Test
    void test_solution() {
        System.out.println(fileSize.solution("my.song.mp3 11b\n" +
                                                     "greatSong.flac 1000b\n" +
                                                     "not3.txt 5b\n" +
                                                     "video.mp4 200b\n" +
                                                     "game.exe 100b\n" +
                                                     "mov!e.mkv 10000b"));
    }

    @Test
    void test_split() {
        String[] fileList = fileSize.getFileList("my.song.mp3 11b\n" +
                                                         "greatSong.flac 1000b\n" +
                                                         "not3.txt 5b\n" +
                                                         "video.mp4 200b\n" +
                                                         "game.exe 100b\n" +
                                                         "mov!e.mkv 10000b");
        System.out.println(fileList);
    }

    @Test
    void test_get_extension() {
        String fileType = fileSize.getFileType("not3.txt");

        System.out.println(fileType);
    }

    @Test
    void test_file_size() {
        System.out.println(fileSize.getFileSize("1000b"));
    }
}
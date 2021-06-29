package tests;

import net.lingala.zip4j.exception.ZipException;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static utils.Files.readTextFromPath;
import static utils.Zip.unzip;

public class ZipFile {

    @Test
    void zipTest () throws IOException, ZipException {
        String zipFilePath = "src/test/resources/files/1.zip";
        String UnzipFolderPath = "src/test/resources/files/unzip";
        String password = "";
        String UnzipTextFilePath = "src/test/resources/files/unzip/1.txt";
        String expectedData = "Лучше нет поры, чем лето ";


        unzip(zipFilePath, UnzipFolderPath, password);
        String actualData = readTextFromPath(UnzipTextFilePath);
        assertThat(actualData, containsString(expectedData));

    }
}

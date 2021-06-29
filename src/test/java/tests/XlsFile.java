package tests;
import com.codeborne.xlstest.XLS;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static utils.Files.getXls;

public class XlsFile {
    @Test
    void txtTest () throws IOException {
        String xlsFilePath = "src/test/resources/files/1.xls";
        String expectedData = "Какой-то";

        XLS xls = getXls(xlsFilePath);
        assertThat(xls, XLS.containsText(expectedData));
    }
}

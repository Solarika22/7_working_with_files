package tests;

import com.codeborne.pdftest.PDF;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;
import static utils.Files.getPdf;
import static utils.Files.readTextFromPath;

public class PdfFile {
    @Test
    void txtTest () throws IOException {
        //Путь до файла
        String pdfPath = "src/test/resources/files/1.pdf";
        //Текст который ищем в файле
        String expectedData = "Как я могу скачать файл в моём тесте?";
        //Читаем путь
        PDF pdf = getPdf(pdfPath);
        assertThat(pdf, PDF.containsText(expectedData));
    }
}

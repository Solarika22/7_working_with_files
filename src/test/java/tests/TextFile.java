package tests;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;
import static utils.Files.readTextFromPath;

public class TextFile {
    @Test
  void txtTest () throws IOException {
      //Путь до файла
      String txtPath = "src/test/resources/files/1.txt";
      //Текст который ищем в файле
      String expectedData = "Я вам точно говорю.";
      //Читаем путь
      String actualData = readTextFromPath (txtPath);
      //Проверяем содержание текстового файла
      assertThat(actualData, containsString(expectedData));
  }
}

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTest {
    @BeforeAll
    static void setup() {
        // Автоматическая настройка ChromeDriver
        WebDriverManager.chromedriver().setup();

        // Настройки Selenide
        Configuration.browser = "chrome";
        Configuration.browserSize = "1366x768";
    }





    @Test
    void fillFromTest() {
        Configuration.holdBrowserOpen = true;
        open("https://demoqa.com/text-box");
//        $("[id=userName]").setValue("Misha Yag");
        // Заполнение полей
        $("#userName").setValue("Misha Yag");
        $("#userEmail").setValue("Misha@mail.ru");
        $("#currentAddress").setValue("Misha@gmail.ru");
        $("#permanentAddress").setValue("Misha112");
        // Нажатие на кнопку Submit
        $("#submit").click();
        // Проверка вывода данных
        $("#output").shouldHave(
                text("Misha Yag"),
                text("Misha@mail.ru"),
                text("Misha@gmail.ru"),
                text("Misha112")
        );

    }
}

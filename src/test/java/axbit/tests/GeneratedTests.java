package axbit.tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import axbit.helpers.DriverUtils;
import com.codeborne.selenide.Condition;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class GeneratedTests extends TestBase {

    String phone = "+74954141404",
            devType1 = "Web-разработка",
            devType2 = "Мобильная разработка",
            devType3 = "Техническая поддержка",
            devType4 = "Битрикс24",
            devType5 = "Заказная разработка",
            devType6 = "SharePoint";


    static final String BASE_URL = "https://axbit.ru/";

    @Test
    @DisplayName("Открытие главной страницы")
    void generatedTest00() {
        step("Открыть главную страницу 'https://axbit.ru/'", () -> {
            open(BASE_URL);
        });

        step("Проверить наличие контактного телефона", () -> {
            $(".phone-block").shouldHave(text(phone));
        });
    }

    @Test
    @DisplayName("Поиск раздела Web-разработка")
    void generatedTest01() {
        step("Открыть главную страницу 'https://axbit.ru/'", () -> {
            open(BASE_URL);
        });

        step("Проверить наличие раздела Web-разработка", () -> {
            $(".col-md-9").shouldHave(text(devType1));
        });
    }

    @Test
    @DisplayName("Поиск раздела Мобильная разработка")
    void generatedTest02() {
        step("Открыть главную страницу 'https://axbit.ru/'", () -> {
            open(BASE_URL);
        });

        step("Проверить наличие раздела Мобильная-разработка", () -> {
            $(".col-md-9").shouldHave(text(devType2));
        });
    }

    @Test
    @DisplayName("Поиск раздела Техническая поддержка")
    void generatedTest03() {
        step("Открыть главную страницу 'https://axbit.ru/'", () -> {
            open(BASE_URL);
        });

        step("Проверить наличие раздела Техническая поддержка", () -> {
            $(".col-md-9").shouldHave(text(devType3));
        });
    }

    @Test
    @DisplayName("Поиск раздела Битрикс24")
    void generatedTest04() {
        step("Открыть главную страницу 'https://axbit.ru/'", () -> {
            open(BASE_URL);
        });

        step("Проверить наличие раздела Битрикс24", () -> {
            $(".col-md-9").shouldHave(text(devType4));
        });
    }

    @Test
    @DisplayName("Поиск раздела Заказная разработка")
    void generatedTest05() {
        step("Открыть главную страницу 'https://axbit.ru/'", () -> {
            open(BASE_URL);
        });

        step("Проверить наличие раздела Заказная разработка", () -> {
            $(".col-md-9").shouldHave(text(devType5));
        });
    }

    @Test
    @DisplayName("Поиск раздела SharePoint")
    void generatedTest06() {
        step("Открыть главную страницу 'https://axbit.ru/'", () -> {
            open(BASE_URL);
        });

        step("Проверить наличие раздела SharePoint", () -> {
            $(".col-md-9").shouldHave(text(devType6));
        });
    }
}
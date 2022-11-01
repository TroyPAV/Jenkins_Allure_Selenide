/**
 * Главная страница сайта stellarburgers
 */
package page_object;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class MainPage {

    private final String MAIN_PAGE_URL = "https://stellarburgers.nomoreparties.site/";
    private final SelenideElement sauceButton = $x("//div[@style = 'display: flex;']//div[2]");
    private final SelenideElement fillingButton = $x("//div[@style = 'display: flex;']//div[3]");
    private final SelenideElement profileButton = $(By.linkText("Личный Кабинет"));

    @Step("Открыть главную страницу StellarBurgers")
    public MainPage getMainPage(){
        Selenide.open(MAIN_PAGE_URL);
        profileButton.shouldBe(Condition.exist);
        return this;
    }

    @Step("Клик на таб \"Соусы\"")
    public MainPage sauceButtonClick() {
        sauceButton.click();
        return this;
    }

    @Step("Клик на таб \"Начинки\"")
    public MainPage fillingButtonClick() {
        fillingButton.click();
        return this;
    }

    @Step("Проверка изменения класса у активного элемнта \"Соусы\"")
    public MainPage sauceScrollCheck() {
        sauceButtonClick()
                .sauceButton
                .has(Condition.cssClass("tab_tab_type_current__2BEPc"));
        return this;
    }

    @Step("Проверка изменения класса у активного элемнта \"Начинки\"")
    public MainPage fillingScrollCheck() {
        fillingButtonClick()
                .fillingButton
                .has(Condition.cssClass("tab_tab_type_current__2BEPc"));
        return this;
    }
}

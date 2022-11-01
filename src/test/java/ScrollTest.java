import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import page_object.MainPage;

public class ScrollTest extends BaseTest{

    @Test
    @DisplayName("Переход к разделу Соусы в конструкторе")
    @Description("Проверка перехода на раздел Соусы при нажатии названия раздела в конструкторе")
    public void checkSauceSection() {
        new MainPage()
                .getMainPage()
                .sauceScrollCheck();
    }

    @Test
    @DisplayName("Переход к разделу Начинки в конструкторе")
    @Description("Проверка перехода на раздел Начинки при нажатии названия раздела в конструкторе")
    public void checkFillingSection() {
        new MainPage()
                .getMainPage()
                .fillingScrollCheck();
    }
}

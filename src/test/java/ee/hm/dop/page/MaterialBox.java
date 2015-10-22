package ee.hm.dop.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MaterialBox {

    private WebElement materialElement;

    public MaterialBox(WebElement materialElement) {
        this.materialElement = materialElement;
    }

    public int getMaterialId() {
        String href = materialElement.findElement(By.xpath(".//a")).getAttribute("href");
        String id = href.split("=")[1];
        return Integer.parseInt(id);
    }

}

package ee.hm.dop.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import ee.hm.dop.page.MaterialPage;
import ee.hm.dop.page.PortfolioPage;

public class MaterialBox {

    private WebElement materialElement;
    private By materialHref = By.xpath("//md-card[contains(@id,'material-card')]");

    // opens a specific material(can be used anywhere where there are material
    // boxes)
    public MaterialPage openMaterial() {
        materialElement.findElement(materialHref).click();
        return new MaterialPage();
    }

    public PortfolioPage openPortfolio() {
        materialElement.findElement(materialHref).click();
        return new PortfolioPage();
    }

    // material box constructor
    public MaterialBox(WebElement materialElement) {
        this.materialElement = materialElement;
    }

    // in case one needs to know the id's of materials that are on the page
    public int getMaterialId() {
        String href = materialElement.findElement(materialHref).getAttribute("href");
        String id = href.split("=")[1];
        return Integer.parseInt(id);
    }

}

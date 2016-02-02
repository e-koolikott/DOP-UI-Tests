package ee.hm.dop;

import static ee.hm.dop.page.LandingPage.goToLandingPage;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

import ee.hm.dop.components.MaterialBox;

//Contains all search materials test.
//Materials are searchable by: title, description, author, tags, age group, type
public class SearchMaterialTest extends AbstractTest {

    @Test
    public void simpleSearchMaterialByTitle() throws InterruptedException {
        // go to the landing page
        // search from title "automated"

        List<MaterialBox> searchResults = goToLandingPage() //
                .getHeader() //
                .searchWithSimpleSearch("title:Automated") //
                .getResultsAsMaterialBox();

        boolean foundMaterial10 = false;
        for (MaterialBox materialBox : searchResults) {
            if (materialBox.getMaterialId() == 10) {
                foundMaterial10 = true;
                break;
            }
        }

        assertTrue(foundMaterial10);
    }

    // Finds material by description
    @Test
    public void simpleSearchMaterialByDescription() throws InterruptedException {

        List<MaterialBox> searchResults = goToLandingPage() //
                .getHeader() //
                .searchWithSimpleSearch("material Description") //
                .getResultsAsMaterialBox();

        boolean foundMaterial10 = false;
        for (MaterialBox materialBox : searchResults) {
            if (materialBox.getMaterialId() == 10) {
                foundMaterial10 = true;
                break;
            }
        }

        assertTrue(foundMaterial10);
    }

    @Test
    public void simpleSearchMaterialByAuthor() throws InterruptedException {

        List<MaterialBox> searchResults = goToLandingPage() //
                .getHeader() //
                .searchWithSimpleSearch("author:Automated") //
                .getResultsAsMaterialBox();

        boolean foundMaterial10 = false;
        for (MaterialBox materialBox : searchResults) {
            if (materialBox.getMaterialId() == 10) {
                foundMaterial10 = true;
                break;
            }
        }

        assertTrue(foundMaterial10);
    }

    @Test
    public void simpleSearchMaterialByTags() throws InterruptedException {

        List<MaterialBox> searchResults = goToLandingPage() //
                .getHeader() //
                .searchWithSimpleSearch("abiogenesis") //
                .getResultsAsMaterialBox();

        boolean foundMaterial10 = false;
        for (MaterialBox materialBox : searchResults) {
            if (materialBox.getMaterialId() == 10) {
                foundMaterial10 = true;
                break;
            }
        }

        assertTrue(foundMaterial10);
    }

    @Test
    public void simpleSearchMaterialByType() throws InterruptedException {

        List<MaterialBox> searchResults = goToLandingPage() //
                .getHeader() //
                .searchWithSimpleSearch("Audio") //
                .getResultsAsMaterialBox();

        boolean foundMaterial36 = false;
        for (MaterialBox materialBox : searchResults) {
            if (materialBox.getMaterialId() == 36) {
                foundMaterial36 = true;
                break;
            }
        }

        assertTrue(foundMaterial36);
    }

    // Search portfolio tests. Portfolios are searchable by title

    @Test
    public void simpleSearchPortfolioByTitle() throws InterruptedException {

        List<MaterialBox> searchResults = goToLandingPage() //
                .getHeader() //
                .searchWithSimpleSearch("title:Automated") //
                .getResultsAsMaterialBox();

        boolean foundMaterial36 = false;
        for (MaterialBox materialBox : searchResults) {
            if (materialBox.getMaterialId() == 36) {
                foundMaterial36 = true;
                break;
            }
        }

        assertTrue(foundMaterial36);
    }

}

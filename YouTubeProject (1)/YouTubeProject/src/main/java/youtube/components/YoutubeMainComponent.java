package youtube.components;

import org.openqa.selenium.WebDriver;
import youtube.pageobjects.mainpageobjects.*;

public class YoutubeMainComponent {
    MainHomeResultsPageObject mainHomeResultsPageObject;
    MainTrendingResultsPageObject mainTrendingResultsPageObject;
    MainSignInPageObject mainSignInPageObject;
    MainSearchResultsPageObject mainSearchResultsPageObject;
    MainHistoryResultsPageObject mainHistoryResultsPageObject;

    public YoutubeMainComponent(WebDriver driver){
        this.mainHomeResultsPageObject = new MainHomeResultsPageObject(driver, driver.getCurrentUrl());
        this.mainHistoryResultsPageObject = new MainHistoryResultsPageObject(driver, driver.getCurrentUrl());
        this.mainTrendingResultsPageObject = new MainTrendingResultsPageObject(driver, driver.getCurrentUrl());
        this.mainSearchResultsPageObject = new MainSearchResultsPageObject(driver, driver.getCurrentUrl());
    }

    public MainHomeResultsPageObject getMainHomeResultsPageObject() {
        return mainHomeResultsPageObject;
    }

    public MainTrendingResultsPageObject getMainTrendingResultsPageObject() {
        return mainTrendingResultsPageObject;
    }

    public MainSignInPageObject getMainSignInPageObject() {
        return mainSignInPageObject;
    }

    public MainSearchResultsPageObject getMainSearchResultsPageObject() {
        return mainSearchResultsPageObject;
    }

    public MainHistoryResultsPageObject getMainHistoryResultsPageObject() {
        return mainHistoryResultsPageObject;
    }
}

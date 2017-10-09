package page
import geb.Page
import geb.Browser
import Modules.*



class OmgHome extends Page {
    static url = "https://www.omygoshh.com/"
    static at = { title == "Fancy Dresses For Kids | Accessories For Girls and boys | Masks online omygoshh.com"}
    static content = {
        logoLink {$("a.logo")}
        logoImg {$("a.logo img", 0)}
        defaultcurrencytext{$("#select-currency option", 1).text()}
        currencies{index -> $("#select-currency option", index).text()}
        mainMenu {module(Menu)}
        footerLink {module(Footerlinks)}
                     }

}

package Modules
import geb.Module
import geb.Browser

class Footerlinks extends Module {

    static content = {
        ShoppingCategories{$(".footer-top").find("div.footer-column",1).find("ul li")}
        ShoppingCategoriesEdibles{ShoppingCategories[0].find('a')}
        //ShoppingCategoriesAnimals(wait:true) {$("div.footer-content ul li", 1).find("a")}

VerifyAllFooterLinks {
    true
    //ShoppingCategoriesEdibles.attr("href") //&& ShoppingCategoriesAnimals.attr("href")
}
    }
}

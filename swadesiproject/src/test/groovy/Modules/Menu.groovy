package Modules

import geb.Module
import geb.Browser

class Menu extends Module{
static content ={
                    Home {$("#nav ul li a")}
    Edibles_Locator {$("#nav").find("li")}
    Edibles_ViewAllEdibles{Edibles_Locator[1].find("a")}

                    VerifyAllMenuLinks {
                         def result = Home.attr("href") == 'https://www.omygoshh.com/'
                        result = result  && Edibles_ViewAllEdibles.attr("href").contains("edible")
                        return result
                   }
}

}
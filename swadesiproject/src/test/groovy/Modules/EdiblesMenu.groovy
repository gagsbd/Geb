package Modules

import geb.Module

class EdiblesMenu  extends  Module{

    static content={
        Locator =$("#nav ul li",1).find("a")
        Fruits={Locator.find("ul li", 1).find("a")}
        Vegetables={Locator.find("ul li", 2).find("a")}
        JunkFood={Locator.find("ul li", 3).find("a")}
        Drinks={Locator.find("ul li", 4).find("a")}

    }
}

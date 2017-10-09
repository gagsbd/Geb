package steps

import cucumber.api.PendingException
import page.*
import static cucumber.api.groovy.EN.*
import Modules.*


this.metaClass.mixin(cucumber.api.groovy.Hooks)
this.metaClass.mixin(cucumber.api.groovy.EN)



Given(~/^user navigates to omg homepage$/) { ->
    // Write code here that turns the phrase above into concrete actions
    to OmgHome
    at OmgHome
}
When(~/^user verifies header elements and navigation bar$/) { ->
    // Write code here that turns the phrase above into concrete actions


    assert  page.logoImg.attr('src').contains('logo.png')
    page.logoLink.click()
    assert page.defaultcurrencytext == '            Indian Rupee - INR        '
    assert page.currencies(0) == '            Euro - EUR        '
    assert  page.currencies(2) == '            US Dollar - USD        '
    assert page.mainMenu.VerifyAllMenuLinks()
    assert page.footerLink.ShoppingCategoriesEdibles.attr("href") == 'https://www.omygoshh.com/edible'

}
And(~/^user verifies footer elements$/) { ->
    // Write code here that turns the phrase above into concrete actions

}
Then(~/^validation is done$/) { ->
    // Write code here that turns the phrase above into concrete actions

}
Feature: Product page

Scenario Outline:validate promocode alert is visible when clicking on the special offers link
Given user goes to the "<url>" webdriveruniversity
When user clicks on "<button>"
Then user presented with a promo alert

Examples:
|          url                                                     |         button                  |
|http://webdriveruniversity.com/Page-Object-Model/products.html#   |    div#container-special-offers |
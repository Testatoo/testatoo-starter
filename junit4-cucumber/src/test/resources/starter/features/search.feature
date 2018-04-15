Feature: Make a search on QWant

  Scenario: As developer I need to search about the groovy language
    Given I visit the search engine QWant at 'https://www.qwant.com/'
    When I search for 'groovy language'
    Then I can see the Groovy website available in the ribbon panel
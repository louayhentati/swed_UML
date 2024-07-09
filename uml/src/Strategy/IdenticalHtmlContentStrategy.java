package Strategy;

import model.Website;

public class IdenticalHtmlContentStrategy implements WebsiteComparisonStrategy {
    @Override
    public boolean compare(Website website1, Website website2) {
        // Logic to compare HTML content
        return website1.getHtmlContent().equals(website2.getHtmlContent());
    }
}
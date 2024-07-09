package Strategy;

import model.Website;

public class IdenticalTextContentStrategy implements WebsiteComparisonStrategy {
    @Override
    public boolean compare(Website website1, Website website2) {
        // Logic to compare text content
        return website1.getTextContent().equals(website2.getTextContent());
    }
}



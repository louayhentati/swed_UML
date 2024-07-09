
package Strategy;

import model.Website;

public class IdenticalContentSizeStrategy implements WebsiteComparisonStrategy {
    @Override
    public boolean compare(Website website1, Website website2) {
        // Logic to compare content size
        return website1.getContentSize() == website2.getContentSize();
    }
}

package com.ernieyu.feedparser;

import java.util.Date;
import java.util.List;

/**
 * An item in the feed.  This represents an RSS item or an Atom entry.
 */
public interface Item extends Element {

    /**
     * Returns the feed type.
     */
    public FeedType getType();
    
    /**
     * Convenience method to retrieve the title.
     */
    public String getTitle();

    /**
     * Convenience method to retrieve the link.
     */
    public String getLink();

    /**
     * Convenience method to retrieve the description.
     */
    public String getDescription();

    /**
     * Convenience method to retrieve the author.
     */
    public String getAuthor();

    /**
     * Convenience method to retrieve the guid.
     */
    public String getGuid();

    /**
     * Convenience method to retrieve the published date.
     */
    public Date getPubDate();

    /**
     * Convenience method to retrieve a list of categories.
     */
    public List<String> getCategories();


    /**
     * Returns enclosure
     */
    public Enclosure getEnclosure();
    
    /**
     * Indicates whether the specified object is equal to this Item based on
     * its unique identifier.
     */
    public boolean equals(Object obj);
    
    /**
     * Returns a hash code based on the unique identifier referenced in the
     * equals() method.
     */
    public int hashCode();
}

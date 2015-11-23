package com.github.cybortronik.registry.repository;

/**
 * Created by stanislav on 11/23/15.
 */
public class UserFilter {
    public static final int MAX_ITEMS_PER_PAGE = 100;
    public static final int MIN_ITEMS_PER_PAGE = 10;
    private String displayName;
    private String email;
    private String sortBy;
    private int page;
    private int itemsPerPage = 50;

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSortBy() {
        return sortBy;
    }

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getItemsPerPage() {
        return itemsPerPage;
    }

    public void setItemsPerPage(int itemsPerPage) {
        if (itemsPerPage > MAX_ITEMS_PER_PAGE)
            itemsPerPage = MAX_ITEMS_PER_PAGE;
        if (itemsPerPage < MIN_ITEMS_PER_PAGE)
            itemsPerPage = MIN_ITEMS_PER_PAGE;
        this.itemsPerPage = itemsPerPage;
    }
}
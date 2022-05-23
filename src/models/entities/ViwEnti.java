package models.entities;

public class ViwEnti {
    private String searchQuery;private int pageCount;
    public String getSearchQuery() {return searchQuery;}
    public ViwEnti setSearchQuery(String searchQuery) {this.searchQuery = searchQuery;return this;}
    public int getPageCount() {return pageCount;}
    public ViwEnti setPageCount(int pageCount) {this.pageCount = pageCount;return this;}
}

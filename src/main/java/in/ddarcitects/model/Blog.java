package in.ddarcitects.model;


public class Blog {
    private Long id;
    private String blogTitle;
    private String shortText;
    private String blogDescription;
    private String featureImageUrl;
    private Long userId;
    private boolean isPublished;

    public Blog() {

    }

    public Blog(Long id, String blogTitle, String shortText, String blogDescription, String featureImageUrl, Long userId, boolean isPublished) {
        this.id = id;
        this.blogTitle = blogTitle;
        this.shortText = shortText;
        this.blogDescription = blogDescription;
        this.featureImageUrl = featureImageUrl;
        this.userId = userId;
        this.isPublished = isPublished;
    }

    public Blog( String blogTitle, String shortText, String blogDescription, String featureImageUrl, boolean isPublished) {
        this.id = id;
        this.blogTitle = blogTitle;
        this.shortText = shortText;
        this.blogDescription = blogDescription;
        this.featureImageUrl = featureImageUrl;
        this.isPublished = isPublished;
    }

    public Blog(String blogTitle, String shortText, String blogDescription, String featureImageUrl, Long userId, boolean isPublished) {
        this.blogTitle = blogTitle;
        this.shortText = shortText;
        this.blogDescription = blogDescription;
        this.featureImageUrl = featureImageUrl;
        this.userId = userId;
        this.isPublished = isPublished;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBlogTitle() {
        return blogTitle;
    }

    public void setBlogTitle(String blogTitle) {
        this.blogTitle = blogTitle;
    }

    public String getShortText() {
        return shortText;
    }

    public void setShortText(String shortText) {
        this.shortText = shortText;
    }

    public String getBlogDescription() {
        return blogDescription;
    }

    public void setBlogDescription(String blogDescription) {
        this.blogDescription = blogDescription;
    }

    public String getFeatureImageUrl() {
        return featureImageUrl;
    }

    public void setFeatureImageUrl(String featureImageUrl) {
        this.featureImageUrl = featureImageUrl;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public boolean isPublished() {
        return isPublished;
    }

    public void setPublished(boolean published) {
        isPublished = published;
    }
}

package model;

public class Website {
    private String url;
    private String textContent;
    private String htmlContent;
    private int contentSize;

    public Website(String url) {
        this.url = url;
        this.textContent = "this is only an exampel";
        this.htmlContent = "htmlof any of this booth siteweb";
        this.contentSize = this.htmlContent.length();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTextContent() {
        return textContent;
    }

    public void setTextContent(String textContent) {
        this.textContent = textContent;
    }

    public String getHtmlContent() {
        return htmlContent;
    }

    public void setHtmlContent(String htmlContent) {
        this.htmlContent = htmlContent;
    }

    public int getContentSize() {
        return contentSize;
    }

    public void setContentSize(int contentSize) {
        this.contentSize = contentSize;
    }
}

package druyaned.designpatterns.behavioral.chain.src;

public class Box extends Container {
    
    private String wikiPage;
    
    public Box(Container parent) {
        super("Box", parent);
    }
    
    public String getWikiPage() {
        return wikiPage;
    }
    
    public void setWikiPage(String wikiPage) {
        this.wikiPage = wikiPage;
    }
    
    @Override public void appendHelp(StringBuilder builder) {
        if (wikiPage != null) {
            builder
                    .append("WikiPage \"")
                    .append(wikiPage)
                    .append("\" of \"")
                    .append(super.getName())
                    .append("\"\n");
        }
        super.appendHelp(builder);
    }
    
}

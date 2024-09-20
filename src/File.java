import java.util.Date;

public class File extends Managable {
    private int id;
    private String name;
    private Date creationDate;
    private String content;
    private Folder parent;

    public File(int id, String name, Date creationDate, String content, Folder parent) {
        this.id = id;
        this.name = name;
        this.creationDate = creationDate;
        this.content = content;
        this.parent = parent;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Folder getParent() {
        return parent;
    }

    public boolean hasParent() {
        return parent != null;
    }
}

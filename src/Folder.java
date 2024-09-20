import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Folder extends Managable {
    private int id;
    private String name;
    private Date creationDate;
    private Folder parent;
    private List<Managable> children;

    public Folder(int id, String name, Date creationDate, Folder parent, List<Managable> children) {
        this.id = id;
        this.name = name;
        this.creationDate = creationDate;
        this.parent = parent;
        this.children = children;
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

    public Folder getParent() {
        return parent;
    }

    public List<Managable> getChildren() {
        return children;
    }

    public void addChild(Managable child) {
        if (children == null) {
            children = new ArrayList<>();
        }

        children.add(child);
    }

    public boolean hasParent() {
        return parent != null;
    }
}

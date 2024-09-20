import java.util.Date;

/**
 * Parent class for all objects which can be managed in VFS (folders, files)
 */
public abstract class Managable {
    private int id;
    private String name;
    private Date creationDate;
    //private int sizeInBytes;

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

    /*public int getSizeInBytes() {
        return sizeInBytes;
    }

    public void setSizeInBytes(int sizeInBytes) {
        this.sizeInBytes = sizeInBytes;
    }*/
}

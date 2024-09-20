import java.util.Date;

/**
 * Parent class for all objects which can be managed in VFS (folders, files)
 */
public abstract class Managable {
    private int id;
    private String name;
    private Date creationDate;
    private int sizeInBytes;
}

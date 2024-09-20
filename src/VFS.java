import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class VFS {
    private static Folder currentFolder;
    private static Folder root = new Folder(1, "root", new Date(), null, null);


    public static void main(String[] args) {
        VFS vfs = new VFS();
        vfs.run();
    }

    private void run() {
        currentFolder = root;

        final Scanner SCAN = new Scanner(System.in);


        while (true) {
            System.out.println();
            System.out.println(getCurrentPath());
            System.out.print("$ ");
            String command = SCAN.nextLine();

            if (InputParser.parse(command) == -1) {
                System.out.println("Could not parse input '" + command + "'. Try again.");
            }
        }
    }

    private String getCurrentPath() {
        String path = "/";
        List<Folder> hierarchy = new ArrayList<>();
        while (currentFolder.hasParent()) {
            hierarchy.add(currentFolder);
        }
        hierarchy.add(root);

        for (int i = hierarchy.size() - 1; i > 0; i--) {
            path += hierarchy.get(i).getName() + "/";
        }

        path += hierarchy.get(0).getName();
        return path;
    }
}

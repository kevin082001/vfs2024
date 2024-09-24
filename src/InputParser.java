import java.util.List;

public class InputParser {
    public static int parse(String input, Folder currentFolder, List<Managable> createdObjects) {
        if (!isValid(input)) {
            return -1;
        }

        String[] split = input.split(" ");
        boolean success;

        switch (split[0]) {
            case "cd":
                //handle "cd"
                System.out.println("Detected 'cd' command");
                break;
            case "ls":
                //handle "ls"
                System.out.println("Detected 'ls' command");
                break;
            case "md":
                success = md(split, currentFolder, createdObjects);
                if (!success) {
                    System.out.println("Sorry, but I could not run your command.");
                }
                break;
            case "mf":
                //handle "mf"
                System.out.println("Detected 'mf' command");
                break;
            case "rm":
                //handle "rm"
                System.out.println("Detected 'rm' command");
                break;
            case "edit":
                //handle "edit"
                System.out.println("Detected 'edit' command");
                break;
            case "echo":
                success = echo(split);
                if (!success) {
                    System.out.println("Sorry, but I could not run your command.");
                }
                break;
            case "help":
                //handle "help"
                System.out.println("Detected 'help' command");
                break;
            default:
                System.out.println("'" + input + "' is not a known command");
        }

        //available flags: rm -R (delete all folders and subfolders in selected folder)
        //special cases: cd .. (switch to parent directory)
        //               cd root (switch to root directory)
        return 0;
    }

    private static boolean echo(String[] args) {
        if (args.length < 2 || args.length > 3) {
            return false;
        }

        if (args.length == 2) {
            System.out.println(args[1]);
            return true;
        }

        if (!Util.isNumber(args[2])) {
            return false;
        }

        String output = args[1];
        int times = Integer.parseInt(args[2]);

        for (int i = 0; i < times; i++) {
            System.out.println(output);
        }

        return true;
    }

    private static boolean md(String[] args, Folder currentFolder, List<Managable> createdObjects) {
        if (args.length != 2 || Util.isNumber(args[1])) { //Directory name must not contain only numbers
            return false;
        }

        //TODO replace 'objectType' with enum
        Folder newFolder = (Folder) Util.createObject('d', args[1], currentFolder);
        return true;
    }

    private static boolean isValid(String s) {
        return s != null && !s.trim().isEmpty();
    }
}

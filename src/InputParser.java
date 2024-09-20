public class InputParser {
    public static int parse(String input) {
        if (!isValid(input)) {
            return -1;
        }

        String[] split = input.split(" ");
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
                //handle "md"
                System.out.println("Detected 'md' command");
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
                //handle "echo"
                System.out.println("Detected 'echo' command");
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

    private static boolean isValid(String s) {
        return s != null && !s.trim().isEmpty();
    }
}

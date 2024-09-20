public class InputParser {
    public static int parse(String input) {
        if (!isValid(input)) {
            return -1;
        }

        //do parsing stuff

        //available commands: cd, ls, md, mf, rm, cat, echo
        //available flags: rm -R (delete all folders and subfolders in selected folder)
        //special cases: cd .. (switch to parent directory)
        //               cd root (switch to root directory)
        return 0;
    }

    private static boolean isValid(String s) {
        return s != null && !s.trim().isEmpty();
    }
}

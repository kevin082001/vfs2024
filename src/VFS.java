import java.util.Scanner;

public class VFS {
    public static void main(String[] args) {
        VFS vfs = new VFS();
        vfs.run();
    }

    private void run() {
        final Scanner SCAN = new Scanner(System.in);

        while (true) {
            //1. wait for input (print current path,
            // f.e.
            // c/user/user1/desktop
            // $
            // )

            //2. parse input
            if (InputParser.parse(inputstring) == -1) {
                System.out.println("Could not parse input '" + inputstring + "'. Try again.");
            }
        }
    }
}

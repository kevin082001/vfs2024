import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Util {
    private static int lastObjectId;


    public static boolean isNumber(String s) {
        if (s == null || s.trim().isEmpty()) {
            return false;
        }

        for (char c : s.toCharArray()) {
            if (c < 48 || c > 57) {
                return false;
            }
        }

        return true;
    }

    public static Managable createObject(char objectType, String name, Folder parent) { //objectType: 'd' for directory, 'f' for file
        if ((objectType != 'd' && objectType != 'f') || name == null || name.trim().isEmpty() || parent == null) {
            return null;
        }

        Managable newObject = null;

        switch (objectType) {
            case 'd':
                newObject = new Folder(++lastObjectId, name, new Date(), parent, new ArrayList<>());
                break;
            case 'f':
                newObject = new File(++lastObjectId, name, new Date(), "", parent);
                break;
        }

        parent.addChild(newObject);
        return newObject;
    }
}

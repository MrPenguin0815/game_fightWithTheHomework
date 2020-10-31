import java.util.Scanner;

public class Utility {
    private static Scanner scanner = new Scanner(System.in);



    /**
     从键盘读取一个长度不超过limit的字符串，并将其作为方法的返回值。
     */
    public static String readString(int limit) {
        return readKeyBoard(limit, false);
    }



    /**
     从键盘读取一个长度不超过3位的整数，并将其作为方法的返回值。
     */
    public static int readInt1() {
        int n;
        for (; ; ) {
            String str = readKeyBoard(3, false);
            try {
                n = Integer.parseInt(str);
                break;
            } catch (NumberFormatException e) {
                System.out.print("数字输入错误，请重新输入：");
            }
        }
        return n;
    }


    /**
     从键盘读取一个长度不超过2位的整数，并将其作为方法的返回值。
     */
    public static int readInt2() {
        int n;
        for (; ; ) {
            String str = readKeyBoard(2, false);
            try {
                n = Integer.parseInt(str);
                break;
            } catch (NumberFormatException e) {
                System.out.print("数字输入错误，请重新输入：");
            }
        }
        return n;
    }












    /**
     用于界面菜单的选择。该方法读取键盘，如果用户键入’1’-’3’中的任意字符，则方法返回。返回值为用户键入字符。
     */
    public static char readSkillSelection() {
        char c;
        for (; ; ) {
            String str = readKeyBoard(1, false);
            c = str.charAt(0);
            if (c != '1' && c != '2' && c != '3' ) {
                System.out.print("选择错误，请重新输入：");
            } else break;
        }
        return c;
    }





    /**
     用于确认选择的输入。该方法从键盘读取‘Y’或’N’，并将其作为方法的返回值。
     */
    public static char readConfirmSelection() {
        char c;
        for (; ; ) {
            String str = readKeyBoard(1, false).toUpperCase();
            c = str.charAt(0);
            if (c == 'Y' || c == 'N') {
                break;
            } else {
                System.out.print("选择错误，请重新输入：");
            }
        }
        return c;
    }








    private static String readKeyBoard(int limit, boolean blankReturn) {
        String line = "";
        while (scanner.hasNextLine()) {
            line = scanner.nextLine();
            if (line.length() == 0) {
                if (blankReturn) return line;
                else continue;
            }

            if (line.length() < 1 || line.length() > limit) {
                System.out.print("输入长度（不大于" + limit + "）错误，请重新输入：");
                continue;
            }
            break;
        }

        return line;
    }



}

package comehere.problems.leetcode.thoughtworks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class TextProcessor {

    private List<String> stringList = new ArrayList<>();
    private StringBuilder res = new StringBuilder();
    private String pattern = "^[ A-Za-z]*$";
    private static final int MIN = 10;
    private static final int MAM = 80;
    private static final String OUTOFRANGE = "ERROR: Width out of range!";
    private static final String INVALIDCHAR = "ERROR: Invalid character detected!";


    public String processor(String text, int width) {

        if (width < MIN || width > MAM) {
            return OUTOFRANGE;
        }

        if (!Pattern.matches(pattern, text)) {
            return INVALIDCHAR;
        }

        splitTextWithWidth(text, width, stringList);

        for (int i = 0; i < stringList.size(); i++) {
            String currentLine = stringList.get(i);
            String nextLine = "";
            StringBuilder temp = new StringBuilder();
            boolean isAWord = false;

            if (i < stringList.size() - 1) {
                nextLine = stringList.get(i + 1);
                isAWord = isAWord(currentLine, nextLine);
            }
            formatSingleLine(i, currentLine, nextLine, temp, isAWord);
            res.append(temp);
        }
        return res.toString();
    }

    private void formatSingleLine(int i, String currentLine, String nextLine, StringBuilder temp, boolean isAWord) {
        for (int j = 0; j < currentLine.length(); ) {
            if (currentLine.charAt(j) != ' ') {
                temp.append(currentLine.charAt(j++));
                if (j == currentLine.length()) {
                    if (isAWord) {
                        getNextPartAndUpdateList(stringList, i, nextLine, temp);
                    }
                    temp.append("(").append(i + 1);
                    if (isAWord) {
                        temp.append(",").append(i + 2).append(");");
                    } else {
                        temp.append(");");
                    }
                } else if (currentLine.charAt(j) == ' ') {
                    temp.append("(").append(i + 1).append(");");
                }
            } else {
                temp.append(" ");
                while (++j < currentLine.length() && currentLine.charAt(j) == ' ') {
                    temp.append(" ");
                }
                temp.append("(").append(i + 1).append(");");
            }
        }
    }


    private void splitTextWithWidth(String text, int width, List<String> stringList) {
        int lines = text.length() / width;
        int s = 0;
        for (int i = 0; i < lines; i++) {
            stringList.add(text.substring(s, s + width));
            s = s + width;
        }
        String lastStr = text.substring(s);
        if (!"".equals(lastStr)) {
            stringList.add(text.substring(s));
        }
    }

    private boolean isAWord(String currentLine, String nextLine) {
        return currentLine.charAt(currentLine.length() - 1) != ' ' && nextLine.charAt(0) != ' ';
    }

    private void getNextPartAndUpdateList(List<String> stringList, int i, String nextLine, StringBuilder temp) {
        String nextPart = nextLine.split(" ")[0];
        int len = nextPart.length();
        stringList.set(i + 1, nextLine.substring(len));
        temp.append(nextPart);
    }

    public static void main(String[] args) throws IOException {
        System.out.println("输入待处理的字符和排版宽度，以回车分隔：");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String text = br.readLine();
        int width = br.read();
        System.out.println("处理后的文本为：");
        System.out.println(new TextProcessor().processor(text, width));
    }
}

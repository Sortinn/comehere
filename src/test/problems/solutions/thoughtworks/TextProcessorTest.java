package test.problems.solutions.thoughtworks;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import problems.thoughtworks.TextProcessor;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TextProcessorTest {


    private TextProcessor textProcessor;
    private String text;
    private int width;

    @Before
    public void before() {
        textProcessor = new TextProcessor();
    }


    @Test
    public void width_out_of_range_smaller_than_10() {
        text = "hello good morning everyone";
        width = 9;
        String res = textProcessor.processor(text, width);
        String expect = "ERROR: Width out of range!";
        Assert.assertEquals(expect, res);
    }

    @Test
    public void width_out_of_range_greater_than_80() {
        text = "hello everyone good morning ";
        width = 81;
        String res = textProcessor.processor(text, width);
        String expect = "ERROR: Width out of range!";
        Assert.assertEquals(expect, res);
    }

    @Test
    public void is_not_a_word_because_of_the_current_line() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, ClassNotFoundException, InstantiationException {
        String currentLine = "hello world ";
        String nextLine = "I am from China";
        Class clazz = TextProcessor.class;
        Method isAWord = clazz.getDeclaredMethod("isAWord", String.class, String.class);
        isAWord.setAccessible(true);
        TextProcessor textProcessor1 = (TextProcessor) clazz.newInstance();
        Boolean res = (Boolean) isAWord.invoke(textProcessor1, currentLine, nextLine);
        Assert.assertEquals(false, res);
    }

    @Test
    public void is_not_a_word_because_of_the_next_line() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, ClassNotFoundException, InstantiationException {
        String currentLine = "hello world";
        String nextLine = " I am from C";
        Class clazz = TextProcessor.class;
        Method isAWord = clazz.getDeclaredMethod("isAWord", String.class, String.class);
        isAWord.setAccessible(true);
        TextProcessor textProcessor1 = (TextProcessor) clazz.newInstance();
        Boolean res = (Boolean) isAWord.invoke(textProcessor1, currentLine, nextLine);
        Assert.assertEquals(false, res);
    }

    @Test
    public void is_a_word() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, ClassNotFoundException, InstantiationException {
        String currentLine = "hello worl";
        String nextLine = "d I am from";
        Class clazz = TextProcessor.class;
        Method isAWord = clazz.getDeclaredMethod("isAWord", String.class, String.class);
        isAWord.setAccessible(true);
        TextProcessor textProcessor1 = (TextProcessor) clazz.newInstance();
        Boolean res = (Boolean) isAWord.invoke(textProcessor1, currentLine, nextLine);
        Assert.assertEquals(true, res);
    }

    @Test
    public void string_with_exception_character_number() {
        text = "hello world2018 everyone";
        width = 12;
        String res = textProcessor.processor(text, width);
        String expect = "ERROR: Invalid character detected!";
        Assert.assertEquals(expect, res);
    }

    @Test
    public void string_with_exception_character_汉字() {
        text = "hello 中国 你好  everyone";
        width = 12;
        String res = textProcessor.processor(text, width);
        String expect = "ERROR: Invalid character detected!";
        Assert.assertEquals(expect, res);
    }

    @Test
    public void string_with_exception_character_operator() {
        text = "hello world+ *everyone";
        width = 12;
        String res = textProcessor.processor(text, width);
        String expect = "ERROR: Invalid character detected!";
        Assert.assertEquals(expect, res);
    }

    @Test
    public void width_greater_than_length_of_string() {
        text = "hello world";
        width = 12;
        String res = textProcessor.processor(text, width);
        String expect = "hello(1); (1);world(1);";
        Assert.assertEquals(expect, res);
    }

    @Test
    public void string_with_many_whitespaces_not_split_word() {
        text = "So   many whitespace";
        width = 10;
        String res = textProcessor.processor(text, width);
        String expect = "So(1);   (1);many(1); (1);whitespace(2);";
        Assert.assertEquals(expect, res);
    }


    @Test
    public void string_with_many_whitespaces_split_word() {
        text = "So   many whitespaces";
        width = 10;
        String res = textProcessor.processor(text, width);
        String expect = "So(1);   (1);many(1); (1);whitespaces(2,3);";
        Assert.assertEquals(expect, res);
    }


    @Test
    public void string_with_words_between_one_whitespace_split_word() {
        text = "The main theme of education in engineering school is learning to teach yourself";
        width = 30;
        String res = textProcessor.processor(text, width);
        String expect = "The(1); (1);main(1); (1);theme(1); (1);of(1); (1);education(1); (1);in(1);" +
                " (2);engineering(2); (2);school(2); (2);is(2); (2);learning(2,3);" +
                " (3);to(3); (3);teach(3); (3);yourself(3);";
        Assert.assertEquals(expect, res);
    }

}

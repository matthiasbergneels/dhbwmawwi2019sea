package lecture.datastructures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TreeTest {

    Tree<String> testTree = null;

    @BeforeEach
    void setup(){
        testTree = new Tree<String>();
    }

    @Test
    void addAndContains() {
        testTree.add("eins");
        testTree.add("zwei");
        testTree.add("drei");

        Assertions.assertTrue(testTree.contains("zwei"));
    }

    @Test
    void containsNotExistingElement(){
        testTree.add("eins");
        testTree.add("zwei");
        testTree.add("drei");

        Assertions.assertFalse(testTree.contains("empty"));
    }

    @Test
    void containsOnEmptyTree(){
        Assertions.assertFalse(testTree.contains("empty"));
    }

    @Test
    void find() {
        String testString = "zwei";

        testTree.add("eins");
        testTree.add(testString);
        testTree.add("drei");

        Assertions.assertEquals(testString, testTree.find(testString));
    }

    @Test
    void size() {
        testTree.add("eins");
        testTree.add("zwei");
        testTree.add("drei");

        Assertions.assertEquals(3, testTree.size());
    }
}
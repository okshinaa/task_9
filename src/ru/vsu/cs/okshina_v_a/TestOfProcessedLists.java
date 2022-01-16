package ru.vsu.cs.okshina_v_a;

import org.junit.Test;
import org.junit.Assert;
import java.util.List;
import ru.vsu.cs.okshina_v_a.utils.ArrayUtils;

public class TestOfProcessedLists {
    @Test
    public void testListWithoutNegativeNumbers() {
        List<Integer> testingInputList = ArrayUtils.readListFromFile("testSrc/testCase/testingListWithoutNegativeNumbers.txt");
        List<Integer> actualList = SortNumbersOfList.process(testingInputList);
        List<Integer> correctOutputList = ArrayUtils.readListFromFile("testSrc/testResult/answerListWithoutNegativeNumbers.txt");

        Assert.assertEquals(correctOutputList, actualList);
    }

    @Test
    public void testListWithAllZeroes() {
        List<Integer> testingInputList = ArrayUtils.readListFromFile("testSrc/testCase/testingListWithAllZeroes.txt");
        List<Integer> actualList = SortNumbersOfList.process(testingInputList);
        List<Integer> correctOutputList = ArrayUtils.readListFromFile("testSrc/testResult/answerListWithAllZeroes.txt");

        Assert.assertEquals(correctOutputList, actualList);
    }

    @Test
    public void testListWithPositiveAndNegativeNumbers() {
        List<Integer> testingInputList = ArrayUtils.readListFromFile("testSrc/testCase/testingListWithPositiveAndNegativeNumbers.txt");
        List<Integer> actualList = SortNumbersOfList.process(testingInputList);
        List<Integer> correctOutputList = ArrayUtils.readListFromFile("testSrc/testResult/answerListWithPositiveAndNegativeNumbers.txt");

        Assert.assertEquals(correctOutputList, actualList);
    }

    @Test
    public void testRandomList() {
        List<Integer> testingInputList = ArrayUtils.readListFromFile("testSrc/testCase/testingRandomList.txt");
        List<Integer> actualList = SortNumbersOfList.process(testingInputList);
        List<Integer> correctOutputList = ArrayUtils.readListFromFile("testSrc/testResult/answerRandomList.txt");

        Assert.assertEquals(correctOutputList, actualList);
    }

    @Test
    public void testListOfThreeNumbers() {
        List<Integer> testingInputList = ArrayUtils.readListFromFile("testSrc/testCase/testingListOfThreeNumbers.txt");
        List<Integer> actualList = SortNumbersOfList.process(testingInputList);
        List<Integer> correctOutputList = ArrayUtils.readListFromFile("testSrc/testResult/answerListOfThreeNumbers.txt");

        Assert.assertEquals(correctOutputList, actualList);
    }
}
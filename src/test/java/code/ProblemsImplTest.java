package code;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ProblemsImplTest  {

    public Problems p ;

    public ProblemsImplTest(){
        p = new ProblemsImpl();
    }

    @Test
    @DisplayName("Test for valid text")
    public void checkPalindromTest(){
        char []text = "hhikihh".toCharArray();
        Assertions.assertEquals(p.checkPalindrom(text),true);
    }

    @Test
    @DisplayName("Test for non valid text")
    public void checkPalindromTest2(){
        char []text = "jk".toCharArray();
        Assertions.assertEquals(p.checkPalindrom(text),false);
    }

    @Test
    @DisplayName("Test for null text")
    public void checkPalindromTest3(){
        char []text = null;
        Assertions.assertEquals(p.checkPalindrom(text),false);
    }

    @Test
    @DisplayName("Test for empty text")
    public void checkPalindromTest4(){
        char []text = "".toCharArray();
        Assertions.assertEquals(p.checkPalindrom(text),true);
    }

    @Test
    @DisplayName("Test for one lettre text")
    public void checkPalindromTest5(){
        char []text = "k".toCharArray();
        Assertions.assertEquals(p.checkPalindrom(text),true);
    }



}
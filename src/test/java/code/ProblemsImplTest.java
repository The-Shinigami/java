package code;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

 class ProblemsImplTest  {

     Problems p ;

     ProblemsImplTest(){
        p = new ProblemsImpl();
    }

    @Test
    @DisplayName("Test for valid text")
    void checkPalindromTest(){
        char []text = "hhikihh".toCharArray();
        Assertions.assertEquals(true,p.checkPalindrom(text));
    }

    @Test
    @DisplayName("Test for non valid text")
    void checkPalindromTest2(){
        char []text = "jk".toCharArray();
        Assertions.assertEquals(false,p.checkPalindrom(text));
    }

    @Test
    @DisplayName("Test for null text")
    void checkPalindromTest3(){
        char []text = null;
        Assertions.assertThrows(NullPointerException.class,
                () ->{
                    p.checkPalindrom(text);
                }
        );
    }

    @Test
    @DisplayName("Test for empty text")
    void checkPalindromTest4(){
        char []text = "".toCharArray();
        Assertions.assertEquals(true,p.checkPalindrom(text));
    }

    @Test
    @DisplayName("Test for one lettre text")
    void checkPalindromTest5(){
        char []text = "k".toCharArray();
        Assertions.assertEquals(true,p.checkPalindrom(text));
    }



}
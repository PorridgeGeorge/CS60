package com.gradescope.hw5;

import static org.junit.Assert.*;

import org.junit.Test;


public class CookieTest {
    /********************************
	 * Constructor Tests
	 ********************************/
    @Test 
    public void testCookie() {
        new Cookie(); //Checks for Nullpointer errors
    }

    @Test 
    public void testSugarCookie() {
        new Cookie("sugar"); //Checks for Nullpointer errors
    }

    @Test
    public void testChocolateChipCookie() {
        new Cookie("chocolate chip"); //Checks for Nullpointer errors
    }

    @Test 
    public void testGlutenFreeCookie() {
        new Cookie("gluten free"); //Checks for Nullpointer errors
    }

    @Test 
    public void testOtherCookie() {
        new Cookie("Ginger Bread"); //Checks for Nullpointer errors
    }

	/********************************
	 * Non-static Methods
	 ********************************/
    @Test 
    public void testgetTypeGF() {
        Cookie glutenfreeCookie = new Cookie ("gluten free");
        assertEquals("gluten free", glutenfreeCookie.getType());
    }
    @Test 
    public void testgetTypeCC() {
        Cookie chocChipCookie = new Cookie ("chocolate chip");
        assertEquals("chocolate chip", chocChipCookie.getType());
    }
    @Test 
    public void testgetTypeS() {
        Cookie sugarCookie = new Cookie ("sugar");
        assertEquals("sugar", sugarCookie.getType());
    }

    @Test 
    public void testgetCalories() {
        Cookie glutenfreeCookie = new Cookie ("gluten free");
        assertEquals(400, glutenfreeCookie.getCalories());
    }

    @Test 
    public void testlistIngredients() {
        Cookie glutenfreeCookie = new Cookie ("gluten free"); 
        assertEquals("[eggs, sugar, peanut butter, chocolate chips]", 
                    glutenfreeCookie.listIngredients());
    }
    @Test 
    public void testaddIngredient() {
        Cookie glutenfreeCookie = new Cookie ("gluten free"); //"[eggs, sugar, peanut butter,chocolate chips]"
        glutenfreeCookie.addIngredient("potatoes");
        assertEquals("[eggs, sugar, peanut butter, chocolate chips, potatoes]", 
                    glutenfreeCookie.listIngredients());
    }

    /********************************
	 * Static Methods
	 ********************************/

    @Test //provided
    public void testCookieCountFrom0to1() {
        Cookie.resetCookieCount();
        assertEquals(0, Cookie.getCookieCount());
        Cookie c = new Cookie();
        assertEquals(1, Cookie.getCookieCount());
    }

    @Test
    public void testresetCookieCount() {
        Cookie.resetCookieCount();
        Cookie c = new Cookie();
        Cookie.resetCookieCount();
        assertEquals(0,Cookie.getCookieCount());
    }

    @Test
    public void testrightNumberofCookies() {
        assertEquals(6, Cookie.rightNumberOfCookies());
    }

    @Test
    public void testisDeliciousF() {
        assertFalse(Cookie.isDeliciousCookieType("gluten free"));
    } 

    @Test
    public void testisDeliciousT(){
        assertTrue(Cookie.isDeliciousCookieType("chocolate chip"));
    } 
    
    // COOKIEBOX TESTS //

    /********************************
	 * Constructors
	 ********************************/

     @Test
     public void testCookieBox() {
        new CookieBox();
     }

     @Test
     public void testaddCookie() {
        Cookie chocChip = new Cookie("chocolate chip");
        Cookie sugar = new Cookie("sugar");
        CookieBox batch = new CookieBox();
        batch.addCookie(chocChip);
        batch.addCookie(sugar);
        assertEquals(900, batch.totalCaloriesInBox());
     }
     @Test
     public void testtotalCaloriesInBox0() {
        CookieBox batch = new CookieBox();
        assertEquals(0, batch.totalCaloriesInBox());
     }
     @Test
     public void testtotalCaloriesInBox1300() {
        Cookie chocChip = new Cookie("chocolate chip");
        Cookie sugar1 = new Cookie("sugar");
        Cookie sugar2 = new Cookie("sugar");
        CookieBox batch = new CookieBox();
        batch.addCookie(chocChip);
        batch.addCookie(sugar1);
        batch.addCookie(sugar2);
        assertEquals(1300, batch.totalCaloriesInBox());
     }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akudrin.exceptions_assertions_6;

/**
 *
 * @author andreikudrin
 */
public class Assertions_3 {

    void noReturn() {
    }

    int aReturn() {
        return 1;
    }

    void go() {
        int x = 1;
        boolean b = true;
// the following six are legal assert statements
        assert (x == 1);
        assert (b);
        assert true;
        assert (x == 1) : x;
        assert (x == 1) : aReturn();
        assert (x == 1) : new ValidAssert();
// the following six are ILLEGAL assert statements
        assert (x = 1); // none of these are booleans
        assert (x);
        assert 0;
        assert (x == 1) : ; // none of these return a value
        assert (x == 1) : noReturn();
        assert (x == 1) : ValidAssert va;
    }
}

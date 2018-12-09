/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akudrin.lambda_functional_interfaces_4;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Predicate_3 {

    public String getNamesSatisfyingCondition(
            Predicate<String> condition, String... names) {
        return Arrays.stream(names)
                .filter(condition)
                .collect(Collectors.joining(", "));
    }
}

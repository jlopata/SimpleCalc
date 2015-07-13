package com.comarch.training;

import org.testng.annotations.DataProvider;

public class DataProviderExample {

 @DataProvider(name = "TwoArgs")
 public static Object[][] getClient1Data() {
  return new Object[][] { { 10, 5 }, { 2, 5 }, { 7, 6 }, { 7, 6 }, { -2, 11 }, { 17, 222 }, { -7, 14 }, { -7, 2 },
    { 1, -4 }, { 0, -5 } };
 }

 @DataProvider(name = "OneArg")
 public static Object[][] getClient2Data() {
  return new Object[][] { {10}, {10}, {10}, {10}, {10}, {10}, {10}, {10}, {10}, {10}};
 } 
 
 
}
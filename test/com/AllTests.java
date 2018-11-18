package com;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.huangsreservationsystem.business.AllBusinessTests;

@RunWith(Suite.class)
@SuiteClasses({AllBusinessTests.class})
public class AllTests {

}

package com;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.huangsreservationsystem.business.AllBusinessTests;
import com.huangsreservationsystem.service.Customer.AllServiceTests;

@RunWith(Suite.class)
@SuiteClasses({AllBusinessTests.class,AllServiceTests.class})
public class AllTests {

}

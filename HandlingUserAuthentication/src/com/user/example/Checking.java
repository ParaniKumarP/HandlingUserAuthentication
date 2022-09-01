package com.user.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Checking {
   

private User login;

@BeforeEach
public void setup() {
login= new User();
System.out.println("Login Initiated");
}

@AfterEach
public void tearDown() {
login=null;
System.out.println("Login Closed");
}
@Test
public void bothcorrect() {
assertEquals(true,login.auth("abc","pwd"));
}

@Test
public void WrongUsername() {
assertEquals(false,login.auth("my","pwd"));

}

@Test
public void WrongPassword() {
assertEquals(false,login.auth("abc","pass"));
}

@Test
public void bothIncorrect() {
assertEquals(false,login.auth("admin","pass"));
}

@Test
public void trueAssert() {
assertTrue(login.auth("abc","pwd"));
}
@Test
public void falseAssert() {
assertFalse(login.auth("abc","passwrd"));
}

}
package de.hpi.javaide.unittest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ MyMathTest.class, TestOddnessTester.class })

// Die Klasse selbst ist leer und nur vorhanden, 
// damit eine valide Java Klasse vorliegt, welche die Annotationen aufnehmen kann
public class AllTests { }

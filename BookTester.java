package bookTest;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import junit.framework.TestCase;

@RunWith(Parameterized.class)
public class BookTester {
	String input,output;

	@Parameters
	public static Collection prepareData(){
		Object[][] obj = {{"a","a"},{"b","b"},{"c","c"}};
		return Arrays.asList(obj);
	}
	
	public BookTester(String s1,String s2){
		input = s1;
		output = s2;
	}
	
	@Test
	public void test() {
		Book book = new Book(input);
		TestCase.assertEquals(output, book.getName());
	}

}

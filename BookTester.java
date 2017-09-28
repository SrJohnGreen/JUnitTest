package bookTest;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import junit.framework.TestCase;

/**
 * @author joker
 * 参数化测试的类
 * 必须由@RunWith(Parameterized.class)修饰
 */

@RunWith(Parameterized.class)
public class BookTester {
	private String input,output;//存储用于操作预置参数的变量
	
	/**
	 * 参数化测试类的构造函数用于将参数赋值
	 * @param s1
	 * @param s2
	 */
	public BookTester(String s1,String s2){
		input = s1;
		output = s2;
	}
	
	/**
	 * 用于准备数据的函数
	 * 要求：公有，静态，无参，返回Collection
	 * @return
	 */
	@Parameters
	public static Collection prepareData(){
		Object[][] obj = {{"a","a"},{"b","b"},{"c","c"}};
		return Arrays.asList(obj);
	}
	

	/**
	 * 测试函数
	 * 必须用@Test标记
	 * 返回void
	 */
	@Test
	public void test() {
		Book book = new Book(input);
		TestCase.assertEquals(output, book.getName());
		return;
	}

}

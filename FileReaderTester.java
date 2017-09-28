package fileReaderTest;

import java.io.FileReader;
import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import javafx.scene.chart.Chart;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * @author joker
 * 
 * 
 */

public class FileReaderTester extends TestCase {
	FileReader _input;
	
	/**
	 * 构造函数
	 * 允许通过函数名的方式将测试函数添加到suite
	 * @param name
	 */
	public FileReaderTester(String name){
		super(name);
	}
	
	/**
	 * Before / After 每个test之前/之后运行一次
	 */
	
	@Before
	protected void setUp() throws Exception {
		_input = new FileReader("data.txt");
	}

	@After
	protected void tearDown() throws Exception {
		_input.close();
	}

	/**
	 * 测试函数
	 * 要求被@Test修饰
	 * 要求返回值为void
	 * 
	 */
	
	@Test
	public void testRead1() throws IOException {
		char ch = '&';
		for(int i = 0; i < 1; i++){
			ch = (char)_input.read();
		}
		assert('B'==ch);
	}
	
	@Test
	public void testRead2() throws IOException {
		char ch = '&';
		for(int i = 0; i < 2; i++){
			ch = (char)_input.read();
		}
		assert('R'==ch);
	}
	
	@Test
	public void testRead3() throws IOException {
		char ch = '&';
		for(int i = 0; i < 3; i++){
			ch = (char)_input.read();
		}
		assert('a'==ch);
		assert('b'==ch);
		
	}
	
	
	@Test
	public void testRead4() throws IOException {
		char ch = '&';
		for(int i = 0; i < 4; i++){
			ch = (char)_input.read();
		}
		assert('d'==ch);
	}
	
	/**
	 * 静态的TestSuit通过addTest()将test加入到运行的suite
	 * 也可以通过addTestSuite()将另一个suite加入到运行的suite
	 */
	
	static TestSuite suite = new TestSuite();
	
	public static void fun1(){
		for(int i = 1;i<=4;i++){
			//通过函数名的方式将测试函数添加到suite
			suite.addTest(new FileReaderTester("testRead" + i));
		}
	}
	
	public static TestSuite suite(){
		
		
		suite.addTestSuite(FileReaderTester.class);
		
		return suite;
	}
	
	
	/**
	 * 这里可有可无，有main函数就可以以java project 的方式运行，否则就只能以测试方式运行
	 */
//	public static void main(String[] args){
//		junit.textui.TestRunner.run(suite());
//	}
}

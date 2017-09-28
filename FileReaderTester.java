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
	 * ���캯��
	 * ����ͨ���������ķ�ʽ�����Ժ�����ӵ�suite
	 * @param name
	 */
	public FileReaderTester(String name){
		super(name);
	}
	
	/**
	 * Before / After ÿ��test֮ǰ/֮������һ��
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
	 * ���Ժ���
	 * Ҫ��@Test����
	 * Ҫ�󷵻�ֵΪvoid
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
	 * ��̬��TestSuitͨ��addTest()��test���뵽���е�suite
	 * Ҳ����ͨ��addTestSuite()����һ��suite���뵽���е�suite
	 */
	
	static TestSuite suite = new TestSuite();
	
	public static void fun1(){
		for(int i = 1;i<=4;i++){
			//ͨ���������ķ�ʽ�����Ժ�����ӵ�suite
			suite.addTest(new FileReaderTester("testRead" + i));
		}
	}
	
	public static TestSuite suite(){
		
		
		suite.addTestSuite(FileReaderTester.class);
		
		return suite;
	}
	
	
	/**
	 * ������п��ޣ���main�����Ϳ�����java project �ķ�ʽ���У������ֻ���Բ��Է�ʽ����
	 */
//	public static void main(String[] args){
//		junit.textui.TestRunner.run(suite());
//	}
}

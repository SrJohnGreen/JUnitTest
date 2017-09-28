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
 * ���������Ե���
 * ������@RunWith(Parameterized.class)����
 */

@RunWith(Parameterized.class)
public class BookTester {
	private String input,output;//�洢���ڲ���Ԥ�ò����ı���
	
	/**
	 * ������������Ĺ��캯�����ڽ�������ֵ
	 * @param s1
	 * @param s2
	 */
	public BookTester(String s1,String s2){
		input = s1;
		output = s2;
	}
	
	/**
	 * ����׼�����ݵĺ���
	 * Ҫ�󣺹��У���̬���޲Σ�����Collection
	 * @return
	 */
	@Parameters
	public static Collection prepareData(){
		Object[][] obj = {{"a","a"},{"b","b"},{"c","c"}};
		return Arrays.asList(obj);
	}
	

	/**
	 * ���Ժ���
	 * ������@Test���
	 * ����void
	 */
	@Test
	public void test() {
		Book book = new Book(input);
		TestCase.assertEquals(output, book.getName());
		return;
	}

}

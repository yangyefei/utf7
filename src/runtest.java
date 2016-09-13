import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiSelector;


public class runtest {

	/**
	 * @param args
	 * @throws UiObjectNotFoundException 
	 */
	public static void main(String[] args) throws UiObjectNotFoundException {
		// TODO Auto-generated method stub
		
		
		String jarName, testClass, testName, androidId;
		jarName="demo";
		testClass="testpress";
		testName="";
		androidId="1";
		new UiAutomatorHelper(jarName, testClass, testName, androidId);
//		UiObject Zhanghu=new UiObject(new UiSelector().resourceId("com.easyrongchuangye:id/mine_user_name"));
//		System.out.print("!!!!!!!!!!!!!!!!!!!!"+Zhanghu.getClassName().toString());
	}

}

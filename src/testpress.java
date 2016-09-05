import java.io.File;
import java.io.IOException;

import android.content.res.Configuration;
import android.os.Bundle;

import com.android.uiautomator.core.Configurator;
import com.android.uiautomator.core.UiCollection;
import com.android.uiautomator.core.UiDevice;
import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiScrollable;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.core.UiWatcher;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;


public class testpress extends UiAutomatorTestCase {
     String telephone ;
	 public void testinput() throws UiObjectNotFoundException, IOException {
		 testReport  report =new testReport();
		
//		UiCollection collect=new UiCollection(new UiSelector().className("android.widget.FrameLayout"));
//		UiSelector   childPattern = new UiSelector().className("android.widget.TextView");
//		int i=collect.getChildCount(new UiSelector().className("android.widget.RelativeLayout"));
//		int j=collect.getChildCount(new UiSelector().className("android.widget.TextView"));
//		System.out.println("RelativeLayout的数量"+i);
//		System.out.println("TextView的数量"+j);
//		UiObject zhuce=collect.getChildByText(childPattern, "《一融网用户使用协议》");
//		zhuce.click();
//		String storePath ="/data/local/tmp/shot.png";
//		UiDevice.getInstance().takeScreenshot(new File(storePath));
//		UiObject obj =new UiObject(new UiSelector().focused(true));
//		obj.setText("你好啊");
		 report.report(1,true);
		 UiDevice.getInstance().pressBack();
		 UiDevice.getInstance().pressBack();
		 UiDevice.getInstance().pressBack();
		 UiDevice.getInstance().pressHome();
		 report.report(2,false);
	 }
//       Bundle  getphone =getParams();
//       telephone=getphone.getString("getphone");
//       UiObject input1 =new UiObject(new UiSelector().resourceId("com.easyrongchuangye:id/register_mobile_edit_tv"));
//       input1.clearTextField();
//       input1.setText(telephone);
//		UiScrollable scroll =new UiScrollable(new UiSelector().scrollable(true));
//		scroll.scrollTextIntoView("上海日臻资产管理有限公司");
		// TODO Auto-generated catch block
//	UiCollection collect = new UiCollection(new UiSelector().className("android.widget.FrameLayout"));
//	int i= collect.getChildCount(new UiSelector().className("android.widget.LinearLayout"));
//	System.out.println("输入Uicollection"+"  "+i);
//	
//	UiCollection collect = new UiCollection(new UiSelector().className("android.widget.FrameLayout"));
//	UiSelector   childPattern = new UiSelector().className("android.widget.Button");
//	String text = "立即注册";
//	UiObject zhuce=collect.getChildByText(childPattern, text);
//	zhuce.click();
//	long  i = Configurator.getInstance().getActionAcknowledgmentTimeout();
//	System.out.println("默认点击事件"+ i);
//		
//	}
//	 public  void testjiantingqi1(){
//		 UiDevice.getInstance().registerWatcher("huangupPhone", new UiWatcher() {
//			
//			public boolean checkForCondition() {
//				// TODO Auto-generated method stub
//				
//				
//				return false;
//			}
//		});
//	 }

		
	}


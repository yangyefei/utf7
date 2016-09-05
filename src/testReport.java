
public class testReport {
	public  void report (int key ,boolean flag){
		String i ="Pass";
		String j ="Fail";
		switch (key) {
		case 1:
			if(flag== true){
				System.out.println("1.第一个测试用例："+i);
			}
			else{
				System.out.println("1.第一个测试用例："+j);}
			break;
		case 2:
			if(flag== true){
				System.out.println("2.第二个测试用例："+i);
			}
			else{
				System.out.println("2.第二个测试用例："+j);}
			break;
		default:
			break;
		}
	
		
		
	}
}

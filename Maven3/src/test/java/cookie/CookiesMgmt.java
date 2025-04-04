package cookie;

import org.openqa.selenium.Cookie;

public class CookiesMgmt extends Utilities.common_methods{
	
	public static void addCookie(String cname,String cvalue) {
		Cookie c=new Cookie(cname,cvalue);
		dr.manage().addCookie(c);
		
	}
	public static void displayCookie() {
		for(Cookie i : dr.manage().getCookies()) {
			System.out.println(i.getName()+" "+i.getValue());
		}
	}
	public static void deleteCookie(String cname) {
		dr.manage().deleteCookieNamed(cname);		
	}
	public static void main(String[] args) {
		String name = "sds",u = "sfsfd";
		launch_chrome("https://www.flipkart.com/");
		addCookie(name,u);
		addCookie("krishna","raju");		
		displayCookie();
		deleteCookie("krishna");
		displayCookie();
		if(dr.manage().getCookieNamed("krishna")==null){
						System.out.println("deleteed");
		}else {
			System.out.println("not delted");
		}
		
		
		
	}
	

}

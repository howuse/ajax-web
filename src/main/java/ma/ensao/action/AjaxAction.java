package ma.ensao.action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

public class AjaxAction extends ActionSupport{

	private static final long serialVersionUID = 1L;
	
	private String name ;
	private List<String> countryList;
	private String greeting ;
	
	public String ok() {
		
		countryList=new ArrayList<String>(10);
		countryList.add("US");
		countryList.add("UK");
		greeting = "Hi "+name;
		
		return ActionSupport.SUCCESS;
	}
	public String getGreeting() {
		return greeting;
	}
	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getCountryList() {
		return countryList;
	}
	public void setCountryList(List<String> countryList) {
		this.countryList = countryList;
	}

}

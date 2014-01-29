package ma.ensao.AjaxAction;

import java.io.InputStream;
import java.io.StringBufferInputStream;

import com.opensymphony.xwork2.ActionSupport;

public class TestAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	
	private String intValue;
	 
    private InputStream inputStream;

    public InputStream getInputStream() {
           return inputStream;
     }

   public String ajaxMethod() {
       System.out.println("Hello i m ajax Methods");
       System.out.println("intValue "+intValue);

       int myVal = 0;
       try{
           myVal=Integer.parseInt(intValue);
           if(myVal<=5)
           inputStream=new StringBufferInputStream("<<<<<<<<<<<<<<<5");
           else   inputStream=new StringBufferInputStream(">>>>>>>>>>>>>>>>5");
       }catch (Exception e) {
        inputStream=new StringBufferInputStream("Value Should be Numberic");
       }
       return SUCCESS;
   }

   public String execute() {
       return SUCCESS;
   }

   public String getIntValue() {
       return intValue;
   }

   public void setIntValue(String intValue) {
       this.intValue = intValue;
   }

}

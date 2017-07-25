package result;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import net.sf.json.JSONObject;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.Result;
import com.opensymphony.xwork2.util.ValueStack;

public class SomeResult implements Result{

	private String root;
	public String getRoot() {
		return root;
	}

	public void setRoot(String root) {
		this.root = root;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void execute(ActionInvocation arg0) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("SomeResult.execute()...");
		
		ValueStack vs = arg0.getStack();
		
		Object top = null;
		if(root == null)
			top = vs.findValue("top");
		else
		{
			top = vs.findValue(root);
			System.out.println(top);
		}
		
		JSONObject json = JSONObject.fromObject(top);
		String jsonStr = json.toString();
		
		HttpServletResponse response = ServletActionContext.getResponse();
		
		PrintWriter out = response.getWriter();
		out.println(jsonStr);
	}

}

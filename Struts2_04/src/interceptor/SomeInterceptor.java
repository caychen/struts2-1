package interceptor;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
import com.opensymphony.xwork2.util.ValueStack;

public class SomeInterceptor implements Interceptor {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("SomeInterceptor.destroy()...");
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		System.out.println("SomeInterceptor.inti()...");
	}

	@Override
	public String intercept(ActionInvocation arg0) throws Exception {
		// TODO Auto-generated method stub
		
		//一般会用到request response session servletcontext
		ActionContext ac = arg0.getInvocationContext();
		ValueStack vs = ac.getValueStack();
		vs.setValue("name", "Cam");
		
		//ActionInvocation封装了Action和Result的整个调用流程
		
		//在调用action之前的操作
		System.out.println("SomeInterceptor.intercept()...before");
		
		//调用Action，已经确定了Result
		arg0.invoke();
		
		//只调用Action，Result还未确定
		//String result = arg0.invokeActionOnly();
		
		//在调用action之后的操作
		System.out.println("SomeInterceptor.intercept()...after");
		
		
		return "success";
	}
}

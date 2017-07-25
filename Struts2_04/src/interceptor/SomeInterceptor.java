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
		
		//һ����õ�request response session servletcontext
		ActionContext ac = arg0.getInvocationContext();
		ValueStack vs = ac.getValueStack();
		vs.setValue("name", "Cam");
		
		//ActionInvocation��װ��Action��Result��������������
		
		//�ڵ���action֮ǰ�Ĳ���
		System.out.println("SomeInterceptor.intercept()...before");
		
		//����Action���Ѿ�ȷ����Result
		arg0.invoke();
		
		//ֻ����Action��Result��δȷ��
		//String result = arg0.invokeActionOnly();
		
		//�ڵ���action֮��Ĳ���
		System.out.println("SomeInterceptor.intercept()...after");
		
		
		return "success";
	}
}

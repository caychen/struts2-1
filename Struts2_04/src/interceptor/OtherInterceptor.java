package interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class OtherInterceptor implements Interceptor {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("OtherInterceptor.destroy()...");
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		System.out.println("OtherInterceptor.inti()...");
	}

	@Override
	public String intercept(ActionInvocation arg0) throws Exception {
		// TODO Auto-generated method stub
		//ActionInvocation��װ��Action��Result��������������
		
		//�ڵ���action֮ǰ�Ĳ���
		System.out.println("OtherInterceptor.intercept()...before");
		
		//����Action���Ѿ�ȷ����Result
		arg0.invokeActionOnly();
		
		//ֻ����Action��Result��δȷ��
		//String result = arg0.invokeActionOnly();
		
		//�ڵ���action֮��Ĳ���
		System.out.println("OtherInterceptor.intercept()...after");
		
		return "success";
	}

}

package Action;

public class LoginAction {
	private String user;
	private String pwd;
	
	private String errMsg;
	
	public String getErrMsg() {
		return errMsg;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String execute(){
		if("cay".equals(user) && "12345".equals(pwd))
			return "success";
		else
		{
			errMsg = "用户名或密码错误";
			return "error";
		}
	}
}

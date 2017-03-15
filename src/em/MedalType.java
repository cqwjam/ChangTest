package em;
// 官方认证相关的勋章
public enum MedalType {
	NULL("无认证"), COWBOY_V("牛仔网认证");
	
	private String description;
	
	private MedalType(String des) {
		this.description = des;
	}
	
	public String getDescription() {
		return this.description;
	}
}

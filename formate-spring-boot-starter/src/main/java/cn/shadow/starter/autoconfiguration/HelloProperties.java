package cn.shadow.starter.autoconfiguration;

import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = HelloProperties.HELLO_FORMATE_PREFIX)
public class HelloProperties {
	public static final String HELLO_FORMATE_PREFIX="cn.shadow.starter.formate";
	private Map<String,Object>info;
	public Map<String, Object> getInfo() {
		return info;
	}
	public void setInfo(Map<String, Object> info) {
		this.info = info;
	}
	
}

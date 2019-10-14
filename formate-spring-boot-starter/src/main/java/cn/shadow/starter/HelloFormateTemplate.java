package cn.shadow.starter;

import cn.shadow.starter.autoconfiguration.HelloProperties;
import cn.shadow.starter.formate.FormateProcessor;

public class HelloFormateTemplate {

	private FormateProcessor formateProcessor;
	private HelloProperties helloProperties;
	public HelloFormateTemplate(FormateProcessor formateProcessor,HelloProperties helloProperties) {
		this.formateProcessor=formateProcessor;
		this.helloProperties=helloProperties;
	}
	public <T>String doFormate(T obj){
		StringBuilder builder=new StringBuilder();
		builder.append("execute formate:").append("<br/>");
		builder.append("HelloProperties:").append(formateProcessor.formate(helloProperties.getInfo())).append("<br/>");
		builder.append("Obj formate result:").append(formateProcessor.formate(obj)).append("<br/>");
		return builder.toString();
	}
}

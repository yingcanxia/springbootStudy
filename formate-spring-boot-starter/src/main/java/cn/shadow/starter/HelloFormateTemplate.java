package cn.shadow.starter;

import cn.shadow.starter.formate.FormateProcessor;

public class HelloFormateTemplate {

	private FormateProcessor formateProcessor;
	public HelloFormateTemplate(FormateProcessor formateProcessor) {
		this.formateProcessor=formateProcessor;
	}
	public <T>String doFormate(T obj){
		StringBuilder builder=new StringBuilder();
		builder.append("execute formate:").append("\n");
		builder.append("Obj formate result:").append(formateProcessor.formate(obj)).append("\n");
		return builder.toString();
	}
}

package com.by.util;

import java.io.File;
import java.util.List;
import java.util.Map;

import javax.mail.internet.MimeMessage;

import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;

import freemarker.template.Configuration;
import freemarker.template.Template;

/**
 * 采用 spring API 的邮件类
 * @author JINGE
 */
public class Mail {

	
	private  String form;  //发件人
	private  String to;    //收件人
	private  String cc;    //抄送
	private  String subject; //邮件标题
	private  String text;    //邮件内容
	private  File files[];   //附件的数组
	private  String filesFileName[];   //附件的文件名称
	private  String filesContentType[];//附件的文件类型
	
	private  Configuration  freeMarketerConfiguration; //邮件模板对象
	
	
	
	
	public Mail(){}
	public Mail(Mail  mail,List<File>  flist) {
		super();
		this.to = mail.to;
		this.cc = mail.cc;
		this.subject = mail.subject;
		this.text = mail.text;
		this.setFilesFileName(mail.getFilesFileName());
		this.setFilesContentType(mail.getFilesContentType());
		this.files = flist.toArray(new  File[flist.size()]);
	}


	/**
	 * 使用freeMarkete读取邮件模板
	 * @param url 邮件模板的路径
	 * @param replaceMap 替换邮件模板的占位符的值
	 * @return 模板的内容
	 */
	public  String  getMailTempLateContent(String url,Map replaceMap){
		String content="";
		try {
			Template  template=freeMarketerConfiguration.getTemplate(url);
			content=FreeMarkerTemplateUtils.processTemplateIntoString(template, replaceMap);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return content;
	}
	
	
	/**
	 * 发送邮件
	 * @param javaMailSender  是spring提供的API  JavaMailSenderImpl类
	 * @param files 附件的数组
	 * @return true发送成功 false失败
	 */
	public  boolean  send(JavaMailSenderImpl javaMailSender){
		try {
			//MimeMessage 可带含有附件 还支持html邮件
			MimeMessage mimeMessage= javaMailSender.createMimeMessage();
			MimeMessageHelper  messageHelper=new MimeMessageHelper(mimeMessage,true,"UTF-8");
			if(form==null||"".equals(form)){
				form=javaMailSender.getUsername();
			}
			messageHelper.setFrom(form);
			messageHelper.setTo(to.split(";"));
			
			if(cc!=null&&!"".equals(cc))
			messageHelper.setCc(cc.split(";"));
			
			messageHelper.setSubject(subject);
			
			messageHelper.setText(text,true);
			
			//添加附件
			if(files!=null){
				for (int i=0;i<files.length;i++) {
					messageHelper.addAttachment(filesFileName[i], files[i]);
				}
			}
			javaMailSender.send(mimeMessage);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return  false;
	}
	
	
	public String getForm() {
		return form;
	}
	public void setForm(String form) {
		this.form = form;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getCc() {
		return cc;
	}
	public void setCc(String cc) {
		this.cc = cc;
	}
	public File[] getFiles() {
		return files;
	}
	public void setFiles(File[] files) {
		this.files = files;
	}
	public String[] getFilesFileName() {
		return filesFileName;
	}
	public void setFilesFileName(String[] filesFileName) {
		this.filesFileName = filesFileName;
	}
	public String[] getFilesContentType() {
		return filesContentType;
	}
	public void setFilesContentType(String[] filesContentType) {
		this.filesContentType = filesContentType;
	}
	public Configuration getFreeMarketerConfiguration() {
		return freeMarketerConfiguration;
	}
	public void setFreeMarketerConfiguration(Configuration freeMarketerConfiguration) {
		this.freeMarketerConfiguration = freeMarketerConfiguration;
	}
	
	
}

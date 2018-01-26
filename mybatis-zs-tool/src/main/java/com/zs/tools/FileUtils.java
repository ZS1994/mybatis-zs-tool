package com.zs.tools;

public class FileUtils {

	/**
	 * 得到项目根路径
	 * 比如：E:/Workspaces/eclipse/mybatis-zs-tool/
	 * @return
	 */
	public static String getRootPath(){
		String str=FileUtils.class.getResource("/").getFile().toString().substring(1);
		String rootPath=str.replaceAll("target/classes/", "");
		System.out.println(str);
		System.out.println(rootPath);
		return rootPath;
	}
	
	
}

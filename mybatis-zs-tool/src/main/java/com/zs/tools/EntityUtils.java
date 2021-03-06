package com.zs.tools;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import com.zs.entity.As;

/**
 * 2018-1-25
 * 该类的作用是将一个生成的类的setget方法中的set方法改为：返回值为该类
 * 比如：
 * public As setB(String b) {
		this.b = b;
        return this;
	}
 * @author it023
 *
 */
public class EntityUtils {

	
	public static String handleSetTransVoidToClass(File file) throws IOException{
		if (!file.isDirectory()) {
			String tmp="";
			FileReader fr=new FileReader(file);
			BufferedReader br=new BufferedReader(fr);
			String str;
			while ((str = br.readLine()) != null) {               
				tmp=tmp+str+"\r\n";
			}
			//找到类名
			String className=tmp.substring(tmp.indexOf("class")+5+1, tmp.indexOf("{")-1);
			System.out.println(className);
			//先切开
			String ss[]=tmp.split("set");
			List<String> litmp=new ArrayList<String>();//容器备用，之所用用它是因为它是变长的
			//如果不满足这个条件，说明找错了，那么就将相邻的两个合并
			for (int i=0;i<ss.length-1;i++) {
				/*条件1：切了之后最后一个字符是空格
				 *条件2：最后一个字符之前的四个字符是“void”
				 *如果满足上面两个条件，说明我们找到了，将其处理好,然后放入容器
				 *如果不满足上面两个条件，就将它与之后的一个合并，并放入容器，并跳过下一个
				 */
				String s=ss[i];
				String snext=ss[i+1];
				if (s.substring(s.length()-1, s.length()).equals(" ") && s.substring(s.length()-1-4, s.length()-1).equals("void")) {
					//开始处理
					String a1=s.substring(0, s.length()-5)+className+" ";
					ss[i+1]=snext.substring(0, snext.indexOf(";"))+";\r\n        return this;"+snext.substring(snext.indexOf(";")+1, snext.length());
					litmp.add(a1);
				}else{
					litmp.add(s);
				}
			}
			litmp.add(ss[ss.length-1]);
			String result="";
			for (String s : litmp) {
				result=result+s+"set";
			}
			result=result.substring(0, result.length()-3);
			PrintWriter out=new PrintWriter(file);
			out.write(result);
			//-关闭流-
			fr.close();
			br.close();
			out.flush();
			out.close();
		}
		return "修改成功";
	}
	
}

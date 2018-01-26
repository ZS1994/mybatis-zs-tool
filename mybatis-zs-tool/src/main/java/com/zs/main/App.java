package com.zs.main;

import java.io.File;
import java.io.IOException;
import org.mybatis.generator.api.ShellRunner;
import com.zs.tools.EntityUtils;
import com.zs.tools.FileUtils;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException{
        App.work();
    }
    
    public static void work() throws IOException {
    	String[] args = new String[] { "-configfile", "resources\\generatorConfig.xml", "-overwrite" };
        ShellRunner.main(args);
        String beanPath=FileUtils.getRootPath()+"resources/com/zs/entity";
        File filedir=new File(beanPath);
        File files[]=filedir.listFiles();
        for (File file : files) {
			EntityUtils.handleSetTransVoidToClass(file);
		}
	}
}

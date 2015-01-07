package com.chinabank.wyrcm;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.ho.yaml.Yaml;
import org.ho.yaml.YamlDecoder;
import org.ho.yaml.YamlStream;

public class testLoadYaml {

	public static void main(String[] args) throws IOException {
		List<RuleVariable> rules = new ArrayList<RuleVariable>();
		RuleVariable rule = new RuleVariable();
		rule.setName("after_prefr_amount");
		rule.setType("range");
		List<String> values = new ArrayList<String>();
		values.add("0-1");
		values.add("1-2");
		values.add("3-");
		rule.setValue(values);
		rules.add(rule);
		
		RuleVariable rule1 = new RuleVariable();
		rule1.setName("ordsum");
		rule1.setType("raw");
		values = new ArrayList<String>();
		values.clear();
		values.add("50");
		values.add("100");
		values.add("150");
		rule1.setValue(values);
		rules.add(rule1);

		 /* Export data to a YAML file. */  
        File dumpFile = new File("testYaml.yaml");  
        try {  
            Yaml.dump(rules, dumpFile);
        } catch (FileNotFoundException e) {  
            e.printStackTrace();  
        }
        YamlStream<RuleVariable> streams =
        		Yaml.loadStreamOfType(testLoadYaml.class.getResourceAsStream("/rule.yaml"), RuleVariable.class);
		for (Object o : streams) {
			System.out.println(((RuleVariable)o).toString());
		}
	}

}

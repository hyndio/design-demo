/**
 * @date 2012-10-10 上午10:06:49 
 * @version V1.0   
 */
package com.renda.etc.concurrent.collection;

import java.text.CollationKey;
import java.text.Collator;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

import org.junit.Test;

/**
 * <p>
 * Description: 集合类线程安全测试
 * </p>
 * 
 * @author yuandong.huang@gmail.com
 * @date 2012-10-10 上午10:06:49
 * 
 */
public class Collection {
	
	@Test
	public void map() {
		Map<String, String> map = new TreeMap<String, String>(new Comparator<Object>(){
            Collator collator = Collator.getInstance(); 
            public int compare(Object o1, Object o2) {
                CollationKey key1 = collator.getCollationKey(o1.toString());
                CollationKey key2 = collator.getCollationKey(o2.toString());
                return key1.compareTo(key2);
            }});
        map.put("a3", "aa");
        map.put("a2", "bb");
        map.put("b1", "cc");
        for (Iterator iterator = map.values().iterator(); iterator.hasNext();) {
            String name = (String) iterator.next();
            System.out.println(name);
        }
	}

}

package problems.tinytest.xmltest;

import com.alibaba.fastjson.JSONObject;
import net.sf.json.xml.XMLSerializer;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;
import java.io.File;
import java.util.Iterator;

/**
 * @author tian.gao
 * @create 2019.01.02 10:32 PM
 **/
public class XmlReader {

    public static JSONObject parseXml(String filename) {
        new XMLSerializer().readFromFile()
    }

    public static void main(String[] args) {
        SAXReader reader = new SAXReader();
        try {
            final Document doc = reader.read(new File("/Users/sortinn/Desktop/test.xml"));
            Iterator<Node> iterator = doc.nodeIterator();
            while (iterator.hasNext()) {
                final Node node = iterator.next();
                final String nodeName = node.getName();
                System.out.println(nodeName);

                if (node instanceof Element) {
                    final Element element = (Element) node;
                    final Iterator<Node> elementIterator = element.nodeIterator();
                    while (elementIterator.hasNext()) {
                        final Node elementNext = elementIterator.next();
                        final String elementNextName = elementNext.getName();
                        if (elementNextName == null) {
                            continue;
                        }
                        System.out.println(elementNextName);
                    }
                }
            }

        } catch (DocumentException e) {
            System.out.println("read file error.");
        }
    }
}

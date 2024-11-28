package asn1jvm.compiler;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.IOException;

public abstract class BaseSerializeTest<T> {

    private final static XmlMapper xmlMapper = new XmlMapper();
    private final static ObjectMapper jsonMapper = new ObjectMapper();
    private final Class<T> clazz;

    public BaseSerializeTest(Class<T> clazz) {
        this.clazz = clazz;
    }

    protected String toXml(T object) throws JsonProcessingException {
        String str = xmlMapper.writeValueAsString(object);
        System.out.println(str);
        return str;
    }

    protected String toJson(T object) throws JsonProcessingException {
        String str = jsonMapper.writeValueAsString(object);
        System.out.println(str);
        return str;
    }

    protected T fromXml(String xml) throws IOException {
        T object = xmlMapper.readValue(xml, clazz);
        System.out.println(object.toString());
        return object;
    }

    protected T fromJson(String json) throws IOException {
        T object = jsonMapper.readValue(json, clazz);
        System.out.println(object.toString());
        return object;
    }

}

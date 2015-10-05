package inheritance;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

//
// class Meta{
//
//	private String metaId;
//
//	public String getMetaId()
//	{
//		return metaId;
//	}
//
//	public void setMetaId(String metaId)
//	{
//		this.metaId = metaId;
//	}
//
//	
//
//}
//
// class UBMeta extends Meta{
//	private String UBMetaId;
//
//	public String getUBMetaId()
//	{
//		return UBMetaId;
//	}
//
//	public void setUBMetaId(String uBMetaId)
//	{
//		UBMetaId = uBMetaId;
//	}
//
//}
//
//class ExpData{
//	String prsId= "123";
//	
//	Meta meta;
//	
//	public String getPrsId()
//	{
//		return prsId;
//	}
//
//	public void setPrsId(String prsId)
//	{
//		this.prsId = prsId;
//	}
//
//	public Meta getMeta()
//	{
//		return meta;
//	}
//
//	public void setMeta(Meta meta)
//	{
//		this.meta = meta;
//	}
//	
//}
//
//public class Inherit
//{
//	public static void main(String s[]){
//	UBMeta m = new UBMeta();
//	
//
//	m.setMetaId("Meta 9999");
//	m.setUBMetaId("UBMeta 999");
//	
//	ExpData ex = new ExpData();
//	ex.setMeta(m);
//	
//	
//	String j = JSONUtil.toJSON(ex);
//	System.out.println(j);
//	
//	ExpData q = JSONUtil.unserialize(j, ExpData.class);
//
//	System.out.println(JSONUtil.toJSON(q));
//		
//	ClassPathScanningCandidateComponentProvider provider = new ClassPathScanningCandidateComponentProvider(true);
//	provider.addIncludeFilter(new AssignableTypeFilter(Meta.class));
//
//	// scan in org.example.package
//	Set<BeanDefinition> components = provider.findCandidateComponents("com/json");
//	for (BeanDefinition component : components)
//	{
//	    try {
//			Class cls = Class.forName(component.getBeanClassName());
//			System.out.println("cls name"+cls.getCanonicalName());
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	    // use class cls found
//	}
//	
//	}
//	
	
	
	
//	 public class Inherit  
//	 {  
//	   static String jsonInput =   
//	       "{\"type\":\"dog\",\"name\":\"Spike\"}";  
//	   
//	  /* public static void main(String[] args) throws Exception  
//	   {  
//	     ObjectMapper mapper = new ObjectMapper();  
//	     Animal animal = mapper.readValue(jsonInput, Animal.class);  
//	     System.out.println(mapper.writeValueAsString(animal));  
//	   }  */
//	 }  
//	   
//	 class Animal  
//	 {  
//	   public String type;  
//	   public String name;  
//	 }  
//	
//
//
//
//public class JSONUtil
//{
//   
//    private static JsonFactory jsonFactory = null;
//    
//    // -------------------------------------------------------------------------
//    
//    private JSONUtil() {}
//    
//    // -------------------------------------------------------------------------
//   
//    
//    /**
//     *  <p>Encodes the specified object as a JSON string.</p>
//     */
//    public static String toJSON(final Object obj)
//    {
//        try
//        {
//            final StringWriter writer = new StringWriter();
//            serialize(writer, obj);
//            return writer.toString();
//        }
//        catch(IOException e)
//        {
//            e.printStackTrace();
//        }
//        
//        return null;
//    }
//    
//    
//    public static void serialize(final Writer out,
//            final Object obj)
//throws IOException
//{
//JsonGenerator g = null;
//
//g = createJsonGenerator(out);
//g.useDefaultPrettyPrinter();
//g.writeObject(obj);
//}
//
//
//    public static JsonGenerator createJsonGenerator(final Writer out)
//    	    throws IOException
//    	    {
//    	        return getJsonFactory().createJsonGenerator(out);
//    	    }
//    	    
//
//private static JsonFactory getJsonFactory()
//{
//    if(jsonFactory == null)
//    {
//    	ObjectMapper objectMapper = new ObjectMapper();
//    	objectMapper.configure(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);
//        jsonFactory = new JsonFactory(objectMapper);
//    }
//    
//    return jsonFactory;
//}
//public static JsonParser createJsonParser(final String content)
//	    throws IOException
//	    {
//	        return getJsonFactory().createJsonParser(content);
//	    }
//public static <T> T unserialize(final String str,
//        final Class<T> type)
//{
//JsonParser p = null;
//try
//{
//p = createJsonParser(str);
//return p.readValueAs(type);
//}
//catch(IOException e)
//{
//}
//finally
//{
//}
//
//return null;
//}

//}
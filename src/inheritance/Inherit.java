package inheritance;

//import java.util.Set;
//
//import org.codehaus.jackson.map.ObjectMapper;
//import org.springframework.beans.factory.config.BeanDefinition;
//import org.springframework.context.annotation.ClassPathScanningCandidateComponentProvider;
//import org.springframework.core.type.filter.AssignableTypeFilter;
//
//import mme.foundation.util.AppUtil.JsonUtil;
//
//import com.json.JSONUtil;

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
	   
//	 class Animal  
//	 {  
//	   public String type;  
//	   public String name;  
//	 }  
	


package d0808.junit;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
	
public static void main(String[] args) {
	DemoTest dt = new DemoTest();
	
	Class<?> cls = dt.getClass();
	
	Method beforeMethod = getMethodByAnnotation(cls,Before.class);
	Method afterMethod = getMethodByAnnotation(cls,After.class);
	for(Method m: cls.getMethods()) {
		if(m.getAnnotation(Test.class)!=null) {
			try {
				if(beforeMethod !=null) {
					beforeMethod.invoke(dt);
				}
				m.invoke(dt);
				if(afterMethod!=null) {
					afterMethod.invoke(dt);
				}
			}catch (IllegalAccessException|IllegalArgumentException e) {
				e.printStackTrace();
			}catch (InvocationTargetException e) {
				System.out.println("测试异常：失败");
				e.printStackTrace();
			}
			
		}
	}
}
@SuppressWarnings("unchecked")
public static Method getMethodByAnnotation(Class<?>testCls,
		@SuppressWarnings("rawtypes")Class annoCls) {
	for(Method m: testCls.getMethods()) {
		if(m.getAnnotation(annoCls)!=null) {
			return m;
		}
	}
	return null;
}
}

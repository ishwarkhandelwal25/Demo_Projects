import java.lang.reflect.Field;

public class Annotationn {

	public static void main(String[] args) {
		CustomDTO customDTO = new CustomDTO();
		Class<? extends CustomDTO> c = customDTO.getClass();
		Field [] g = c.getDeclaredFields();
		/*System.out.println(g[0].isAnnotationPresent(JsonField.class));
		System.out.println(g[1].isAnnotationPresent(JsonField.class));
		System.out.println(g[2].isAnnotationPresent(JsonField.class));*/

		for(Field element : g) {
			if(element.isAnnotationPresent(JsonField.class)) {
				System.out.println(element);
			}
		}
	}
}

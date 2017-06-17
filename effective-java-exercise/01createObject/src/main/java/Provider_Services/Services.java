package Provider_Services;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 服务注册
 * 
 * @author Yo
 *
 */
public class Services {
	private Services() {
		// 构造器
	}

	private static final Map<String, Provider> providers = new ConcurrentHashMap<>();

	public static final String DEFAULT_PROVIDER_NAME = "def";

	// 提供者注册API
	public static void registerDefaultProvider(Provider p) {
		registerProvider(DEFAULT_PROVIDER_NAME, p);
	}

	private static void registerProvider(String name, Provider p) {
		providers.put(name, p);
	}

	// 服务访问API
	public static Service newInstance() {
		return newInstance(DEFAULT_PROVIDER_NAME);
	}

	public static Service newInstance(String name) {
		Provider p = providers.get(name);
		if (p == null)
			throw new IllegalAccessError("err" + name);
		return p.newService();
	}
}

class test {
	public static void main(String[] args) {
		Services.newInstance("test");
	}
}
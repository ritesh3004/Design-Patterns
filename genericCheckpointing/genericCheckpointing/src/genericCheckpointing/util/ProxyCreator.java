package genericCheckpointing.util;

import genericCheckpointing.server.StoreRestoreI;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class ProxyCreator
{
	/**
	 * Method to create proxy reference
	 * @param interfaceArray
	 * @param handler = instance of StoreRestoreHandler
	 * @return
	 */
	public StoreRestoreI createProxy(Class<?>[] interfaceArray, InvocationHandler handler){
		StoreRestoreI storeRestoreRef =
				(StoreRestoreI)
						Proxy.newProxyInstance(
								getClass().getClassLoader(),
								interfaceArray,
								handler
						);

		return storeRestoreRef;
	}
}
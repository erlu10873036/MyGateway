package com.ws.router;

import org.springframework.context.annotation.Configuration;

/**
 * @author: wangshao
 * @date:2019年11月10日 下午12:38:36
 * @version :
 * 
 */
@Configuration
public class MyGateWayRouter {


	/**
	 * 使用代码方式配置路由 
	 * 也可以在配置页配置
	 */
	/*@Bean
	public RouteLocator routeLocator(RouteLocatorBuilder build) {

		return build.routes()
				.route(r ->
				r.path("/achun/**")
				.filters(
						f -> f.stripPrefix(1)
						)
				.uri("http://localhost:8090/")).build();
	}*/

}

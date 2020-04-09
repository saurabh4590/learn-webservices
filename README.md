# Learning
This module focuses only on REST APIs creation and Authentication.

Using this application, I want to implement the below:
1) CRUD operations using REST APIs.
2) Used H2 database and Spring JPA.



**Features implemented:**
- @ResponseStatus for responding with a particular HttpStatus code. (Commits on Apr 8, 2020)
- Field validation. (Commits on Apr 8, 2020)
- Swagger Documentation. (Commits on Apr 8, 2020)
- Custom Exception. (Commits on Apr 8, 2020)
- Actuator for getting the health of the service. (Commits on Apr 8, 2020)
- Static and Dynamic Filtering.

	**Static filtering** filters fixed values and these values are managed in Bean using @JsonIgnore and @JsonIgnoreProperties.
	
	**Dynamic filtering** filters using SimpleFilterProvider class as mentioned in FilteringController.

-------------------------------------------------------------------------------------------------------
Actuator generates below URLs which can be useful for monitoring the application:
- We need to add below in our code
  1) <dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-actuator</artifactId>
		</dependency>
    
  2) In application.properties, add below:
    management.endpoints.web.exposure.include=*
    
 >  As a result we get below URLs.
   
{
  "_links": {
    "self": {
      "href": "http://localhost:8080/actuator",
      "templated": false
    },
    "beans": {
      "href": "http://localhost:8080/actuator/beans",
      "templated": false
    },
    "caches-cache": {
      "href": "http://localhost:8080/actuator/caches/{cache}",
      "templated": true
    },
    "caches": {
      "href": "http://localhost:8080/actuator/caches",
      "templated": false
    },
    "health": {
      "href": "http://localhost:8080/actuator/health",
      "templated": false
    },
    "health-path": {
      "href": "http://localhost:8080/actuator/health/{*path}",
      "templated": true
    },
    "info": {
      "href": "http://localhost:8080/actuator/info",
      "templated": false
    },
    "conditions": {
      "href": "http://localhost:8080/actuator/conditions",
      "templated": false
    },
    "configprops": {
      "href": "http://localhost:8080/actuator/configprops",
      "templated": false
    },
    "env": {
      "href": "http://localhost:8080/actuator/env",
      "templated": false
    },
    "env-toMatch": {
      "href": "http://localhost:8080/actuator/env/{toMatch}",
      "templated": true
    },
    "loggers": {
      "href": "http://localhost:8080/actuator/loggers",
      "templated": false
    },
    "loggers-name": {
      "href": "http://localhost:8080/actuator/loggers/{name}",
      "templated": true
    },
    "heapdump": {
      "href": "http://localhost:8080/actuator/heapdump",
      "templated": false
    },
    "threaddump": {
      "href": "http://localhost:8080/actuator/threaddump",
      "templated": false
    },
    "metrics": {
      "href": "http://localhost:8080/actuator/metrics",
      "templated": false
    },
    "metrics-requiredMetricName": {
      "href": "http://localhost:8080/actuator/metrics/{requiredMetricName}",
      "templated": true
    },
    "scheduledtasks": {
      "href": "http://localhost:8080/actuator/scheduledtasks",
      "templated": false
    },
    "mappings": {
      "href": "http://localhost:8080/actuator/mappings",
      "templated": false
    }
  }
}

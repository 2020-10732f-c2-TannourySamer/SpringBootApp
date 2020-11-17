# Currency Exchange Simulator
This is a SpringBoot Project with microservices using Java, Restful webservices, Ribbon Load Balancing, H2 Database and Eureka server.

# Microservices implemented 
1. limits-service 
2. Spring-cloud-config-server
3. Currency-exchange-service 
4. Currency-conversion-Service 
5. Nexflix Eureka Naming Server 

# Port Configuration
limits-service	8080,8081..
Spring-cloud-config-server	8888
Currency-exchange-service	8000,8001,8002..
Currency-calculation-Service	8100,8101,8102…
Nexflix Eureka Naming Server	8761

# Microservices URLS
http://localhost:8000/h2/login.jsp?jsessionid=73f29a903343b8cafc51ebbd9989555b

http://lochttp://localhost:8000/currency-exchange/from/EUR/to/USDalhost:8000/currency-exchange/from/EUR/to/USD

http://localhost:8100/currency-converter/from/EUR/to/USD/quantity/500

http://localhost:8761/

![Screenshot](https://github.com/2020-10732f-c2-TannourySamer/SpringBootApp/blob/master/screenshot.PNG)

FROM amazoncorretto

EXPOSE 8080:8080
ADD build/libs/traffic-congestion-detector-0.0.1-SNAPSHOT.jar traffic-congestion-detector-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/traffic-congestion-detector-0.0.1-SNAPSHOT.jar"]
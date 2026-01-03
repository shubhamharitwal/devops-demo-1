# Use official Tomcat base image with Java 17
FROM tomcat:9.0-jdk17

# Remove default webapps
RUN rm -rf /usr/local/tomcat/webapps/*

# Copy your WAR file into Tomcat ROOT
COPY target/devops-java-app.war /usr/local/tomcat/webapps/ROOT.war
EXPOSE 8081
# Expose Tomcat port
EXPOSE 8080

# Start Tomcat
CMD ["catalina.sh", "run"]


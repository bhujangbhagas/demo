### spring-boot-demo-jpa-liqibase
This is the demo application of spring boot with jpa and liquibase configuration.
It uses the MySQL database in the backend

### Generate the liqibase change log file
liquibase --driver=com.mysql.jdbc.Driver --classpath=mysql-connector-java-5.1.35.jar --changeLogFile=db.changelog.yaml --url="jdbc:mysql://localhost:3306/test?currentSchema=test" --username=root --password=root generateChangeLog
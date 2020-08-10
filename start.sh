#!/bin/bash
echo 'Start the program : gradle-spring-boot-project-0.1.0-SNAPSHOT.jar' 
chmod 777 /root/development/github/gradle-spring-boot-project/build/libs/gradle-spring-boot-project-0.1.0-SNAPSHOT.jar
echo '--------Starting--------' 
cd /root/development/github/gradle-spring-boot-project/build/libs/
nohup java -jar gradle-spring-boot-project-0.1.0-SNAPSHOT.jar &
echo 'start success'
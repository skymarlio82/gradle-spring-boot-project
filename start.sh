#!/bin/bash
echo 'Start the program : gradle-spring-boot-project-0.1.0-SNAPSHOT.jar'
echo '--------Starting--------'
nohup java -jar /root/development/github/gradle-spring-boot-project/build/libs/gradle-spring-boot-project-0.1.0-SNAPSHOT.jar &
sleep 100
echo 'start success'
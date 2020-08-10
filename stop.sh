#!/bin/bash
echo "Stop Procedure : gradle-spring-boot-project-0.1.0-SNAPSHOT.jar"
pid=`ps -ef | grep java | grep gradle-spring-boot-project-0.1.0-SNAPSHOT.jar | awk '{print $2}'`
echo 'old Procedure pid:'$pid
if [ -n "$pid" ]
then
kill -9 $pid
fi
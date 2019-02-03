#!/bin/bash

java -jar -Dspring.config.location=/app/config/application.properties /app/app/*.jar -Xms1024m -Xmx2048m -XX:PermSize=512M -XX:MaxNewSize=768m -XX:MaxPermSize=512m

echo start service!
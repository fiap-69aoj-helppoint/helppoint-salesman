#!/bin/sh

echo 'Sleeping 60s...'
sleep 60

echo 'Starting...'
java -jar -Dspring.profiles.active=prod /salesman.jar
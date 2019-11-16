#!/bin/sh

echo 'Sleeping 20s...'
sleep 20

echo 'Starting...'
java -jar -Dspring.profiles.active=prod /salesman.jar
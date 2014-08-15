#!/bin/sh
mkdir -p $CATALINA_HOME/webapps/Practice-the-ServletTest

cp -r src/main/webapp/* $CATALINA_HOME/webapps/Practice-the-ServletTest
cp -r target/classes/* $CATALINA_HOME/webapps/Practice-the-ServletTest/WEB-INF


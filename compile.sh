#!/bin/sh
mkdir -p target/classes
mkdir -p target/test-classes
javac -classpath "$CATALINA_HOME/lib/servlet-api.jar" -d target/classes/ src/main/java/com/baldurtech/*.java 
javac -classpath "$CATALINA_HOME/lib/servlet-api.jar;lib/reflections-0.9.9-RC2.jar;target/classes/" -d target/test-classes/ src/test/java/com/baldurtech/*.java src/test/java/com/baldurtech/util/*.java

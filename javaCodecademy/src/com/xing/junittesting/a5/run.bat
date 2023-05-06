export JUNIT4_CLASSPATH="/usr/share/java/junit4-4.12.jar:/usr/share/java/hamcrest-core-1.3.jar"
javac -cp .:$JUNIT4_CLASSPATH ./*.java
java -cp .:$JUNIT4_CLASSPATH org.junit.runner.JUnitCore TestExample
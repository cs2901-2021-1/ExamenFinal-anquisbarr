compile:
	mvn clean compile
run:
	mvn compile exec:java -Dexec.mainClass="cs.lab.Demo"
clean:
	mvn clean
sonar:
	mvn verify org.sonarsource.scanner.maven:sonar-maven-plugin:sonar
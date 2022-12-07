# Todo list

1. Run the code against the test cases using `mvn test`

2. If the tests pass, compile and package the code using `mvn compile package`

3. Push the compiled jar to Azure Artifacts to be used as a Maven dependency with the artifact version equaling the pipeline build number

4. Author the instructions to use the this artifact as a Maven dependency in `README.md`

    * The README should have the pipeline build status
    * The README should have the latest artifact build version
    * The README should have the instructions to download and consume this artifact in a Java maven project as a Maven dependency.
# Scalatra SBT prototype 

1. Clone this repository:

        git clone git://github.com/scalatra/scalatra-sbt-prototype.git my-app

2. Change directory into your clone:

        cd my-app

3. Launch [SBT](http://code.google.com/p/simple-build-tool).

        ./sbt

4. At SBT prompt, fetch the dependencies.  Do this the first time and also whenever you change the project definition.

        update

5. Run Jetty

        jetty

6. Go to http://localhost:8080/.

7. Learn more at http://www.scalatra.org/.

8. Happy hacking!

## Eclipse support

If you want to import the project into Eclipse, do the following:

1. Generate a Maven pom from the SBT project:

        ./sbt make-pom

2. Copy the generated pom-file into place:

        cp target/scala_2.8.0/myproject_2.8.0-0.1.0-SNAPSHOT.pom pom.xml        

3. Generate eclipse metadata:

        mvn eclipse:eclipse

4. Import the project into Eclipse as an Existing Java Project.

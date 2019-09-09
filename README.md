# Java/Spring/JUnit/Spock Integration tests example

This is an example Java application that uses Spring and Tomcat to run.
It is compiled using Codefresh.

## Running the app 

To compile and package using Docker 

```bash
docker build . -t my-app
docker run -p 8080:8080 my-app
```

Then enter http://localhost:8080/wizard/ on your browser

## Running the integration tests locally

To compile and package using Docker compose

```bash
docker-compose up
```

This will launch two containers, one of the applications and one for the unit tests. All unit tests will run automatically.

## To use this project in Codefresh

There is also a [codefresh.yml](codefresh.yml) for easy usage with the [Codefresh](codefresh.io) CI/CD platform.

More details can be found in [Codefresh documentation](https://codefresh.io/docs/docs/yaml-examples/examples/run-integration-tests/)


Sure, here's a basic `README.md` file for your project. You can add more details as per your project's requirements.

```markdown
# Workshop Gateway API

This project is a gateway API for a workshop system. It is developed using Java and Maven.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

- Java
- Maven
- Docker

### Installing

A step by step series of examples that tell you how to get a development environment running.

1. Clone the repository
2. Navigate to the project directory
3. Run `mvn clean install` to build the project
4. Run `docker-compose up` to start the services

## Running the tests

Explain how to run the automated tests for this system.

## Deployment

Add additional notes about how to deploy this on a live system.

## Built With

- [Java](https://www.java.com/) - The programming language used
- [Maven](https://maven.apache.org/) - Dependency Management
- [Spring Boot](https://spring.io/projects/spring-boot) - The framework used
## API Endpoints

This project provides the following API endpoints:

### Discovery Endpoints

- `GET /discovery/{serviceName}`: This endpoint returns a list of instances for a given service name. The response is a list of strings, where each string is a host and port combination for an instance of the service.

- `GET /discovery/services`: This endpoint returns a list of all services registered with the discovery client. The response is a list of strings, where each string is a service name.

Please replace `{serviceName}` with the actual name of the service you want to discover.


## Contributing

Please read `CONTRIBUTING.md` for details on our code of conduct, and the process for submitting pull requests to us.

## Versioning

We use [SemVer](http://semver.org/) for versioning.

## Authors

- **Your Name** - *Initial work* - [YourGithubUsername](https://github.com/YourGithubUsername)

See also the list of [contributors](https://github.com/YourGithubUsername/YourRepository/contributors) who participated in this project.

## License

This project is licensed under the MIT License - see the `LICENSE.md` file for details

## Acknowledgments

- Hat tip to anyone whose code was used
- Inspiration
- etc
```

Please replace the placeholders with the actual values.
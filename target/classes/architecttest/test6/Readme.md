# Description

The aim of this item is to assess the ability to design efficient, scalable and secure web systems, as well as the understanding of Agile Scrum methodology.

1. Scenario: Imagine that you have been appointed as the architect for a project to upgrade an existing e-commerce web system. The current system is over 5 years old and needs significant improvements to meet growing customer demands. The development team follows the Agile Scrum methodology. 
2. Tasks: 
   1. Current System Analysis: 
      1. Briefly describe the main challenges and problems identified in the current web system that justifies an upgrade; 
      2. List the main features and functionalities that the system must maintain or improve during the upgrade.
   2. System Architecture: 
      1. Design a high-level architecture for the updated web system. Consider scalability, security, performance and the ability to handle a large volume of customer traffic; 
      2. Specify the technologies and frameworks you would recommend to implement the architecture. 
   3. Security: 
      1. Describe the security practices and measures you would implement to protect the system against common threats.
   4. Project Scope: 
      1. Propose a set of priority features for the first iteration of the Scrum project, highlighting those that will bring the greatest value to customers; 
      2. Describe how you would deal with the constantly changing requirements that are common in Agile Scrum projects.
   5. Continuous Integration and Continuous Delivery (CI/CD): 
      1. Explain how you would implement a CI/CD pipeline to automate the building, testing and deployment of the updated web system.
   6. Data Management: 
      1. Suggest a data management strategy, including storage and access to system data.
   7. Test and Quality: 
      1. Describe how you would ensure code quality and test coverage throughout the development of the project.
   8. Team Management: 
      1. Discuss how you would lead the development team in the context of Agile Scrum, including roles and responsibilities.
   9. Documentation: 
      1. Explain the importance of system documentation and how you would ensure that the team keeps the documentation up to date.

# Solution

## Current System Analysis:

As a five years old project, we can start see some challenges to maintain the software. The first one is the architecture chose on project definition and how does it affects all the process since developing new features and until the deployment and the technology used to do it, using the same idea the programming language can start having support problems, at least with for features that can be useful for users with newer browsers.

Even if the we maintain the language, an upgrade for the version is necessary, because we need to think about the performance, security, no of workers available for the maintenance and other aspects that could start be difficult along the time.

Thinking on a simple process of upgrade, we should consider upgrading smaller modules, make coworkers comfortable with the technology and explore the first challenges of test, monitor and deploy the new solution. Some or other module can be kept in older versions but it is not the best choice.

## System Architecture

To implement a solution that will be useful we need to plan every piece of this work, starting by main technologies that will run the code and the services the code will consume. The best options is starting using cloud with microservices model and split the processing over the small blocks, that will talk one each order in async mode and using a high throughput data message system.

Thinking only in the code, also split the actions in small pieces as S from SOLID concept told us, this will also help us building unit tests to take more care of this solution all over the time.

## Security

Think about security by design is important but not enough to keep the system securely, also it is important to plan using a SAST or DAST software to scan the project, also it's important once a time hire some hours of security specialist to make some tries and find any type of vulnerability.

## Project Scope

The first steps will be make a setup of a project in case we are re-creating the system, and try to figure out first challenges we can have on bare flows. For code we need to think about the dependencies, authentication/authorization, security filters, static files handler, CORS and another important details.

If the project specified is only upgrade pieces of modular system, we need to setup the first and simple module and also have sure that the modules will be integrated if any problems, is some risk appears, before as possible is important to review the project steps to prevent any type of problem in future versions.

Separate the project in doable steps and well written is the best way to prevent a lot of changes while we're developing the solution, but it's wrong think that this will not happen. The project managers, tech leader and architect needs to have an approach while taking care of final product, and make sure if any changes is needed, to do it more smooth as possible, and using a strategy that will not stop the developers work.

## Continuous Integration and Continuous Delivery (CI/CD)

A simple way to start an maintain a good CI/CD is using the software responsible to the code versioning and starting pipelines depending the type of modification. A way to do it is using small jobs for every branches only using test and eslint jobs, for QA code preparing tags to separate the code and building/deploying on right env, and the same for production but using different suffixes for tags and also using more steps to validate the deployment process.

This pipelines also should consider a minimum number of approvals, best windows time to deploy and for some cases do an integration with another softwares to check security and  best practices in the code (as mentioned SAST/DAST and SonarQube for instance)

For projects using cloud infrastructure, may be important setup Terraform or Serverless process to plan and execute the changes in the cloud more easily.

## Data Management

Also an important step for the software develop planning, this time we need to choose between relational/non-relational databases, the needed resources, location, infrastructure an even the provider for this database.

The best option in my opinion is using a mix of them, for instance, using DynamoDB in AWS to store some details of users, configurations, details of items and other massive data that could be correlated only using an UUID in a relational database, this will bring a high performance for the software.

For relational databases, we may need different links to read/write and prevent lack of resources while exporting a report or making a massive data import.

For accessing the data, the software need to have a high performance link to the database an also configure a good pool of data sources to make sure you'll not have problems querying the data.

## Test and Quality

In the beginning we can start only with Unit/Component tests using common frameworks for the chose language, after some time we can review the success rate and also think about developing integration tests if we have a lot of blocks to integrate and data contracts to check.

Also a QA team is important to take care of end-to-end tests before the releases, and help the team to track the changes, making the release notes and help when a bug in production will be noticed.

## Team Management

The best option is making macromanagement to make sure developers is following the tasks and the release date will not need changes. Each task will be need a code review and more senior developers can help with that. An important point is to check every team member and know the best technology they like or prefer to develop, this will help to get better code developed.

Also it's important schedule daily meetings and all other groomings that scrum asks to keep the team engaged with the purpose of project and the responsibilities.

## Documentation

Documentation can be a pain depending the culture of the team are working in. We can propose create/update the documentation every time a code is merged in main branch of the project. This will help to keep the documentation up to date without losing one person only to do that.
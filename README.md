## JDBC project with migrations

This project uses JDBC tools to handle with SQL data, but initializing of tables goes throw migrations.

For migrations used liquibase.

SQL in this project represents by PostgreeSQL, so to start it be sure Postgree is installed on your host.

This project doesn't use SQL sript for request and methods of reading external scripts except table creating and data filling.

Project would start on port 8081 by default so if it is necessary please change application.properties settings.

Controller has one GET mapping, example of request to test: "http://localhost:8081/products/fetch-product?name=alexey"
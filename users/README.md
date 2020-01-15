
###H2 console
`http://localhost:8080/h2-console`



###Get User
`http://localhost:8080/users/10001`


###Post User
`http://localhost:8080/users/`
######Body
`{  "id": 10003,  "name": "Test"}`



### Build and Run:
`mvn package && java -jar target/users-0.0.1-SNAPSHOT.jar`

### Run Docker

- `sudo docker-compose up --build`

##### OR
- `sudo docker build -t users .`
- `sudo docker run -p 8080:8080 users`
# levels-beyond-note-service
Levels Beyond coding assessment

# Running Locally (run the following commands in your terminal)
 - `git clone https://github.com/drew6432/levels-beyond-note-service.git`
 - `cd levels-beyond-note-service`
 - `mvn clean install`
 - `mvn spring-boot:run`
 
 This will start the note service on http://localhost:8080
 
 - Access the H2 embedded DB by navigating to http://localhost:8080/h2-console
   - username: `sa`
   - password: leave password blank
   
 - Note service is running at http://localhost:8080/api/notes
 
 - example POST `curl -i -H "Content-Type: application/json" -X POST -d '{"body" : "Pick up milk!"}' http://localhost:8080/api/notes`

# Things I would improve 
- add more unit tests 
- add functional tests

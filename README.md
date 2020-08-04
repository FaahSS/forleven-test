#Markdown Application.Properties MySQL Default

spring.jpa.properties.hibernate.jdbc.lob.non_contextual_creation=true

#banco de dados local apirest

spring.datasource.url=jdbc:mysql://localhost:3306/aluno_apirest?useTimezone=true&serverTimezone=America/Sao_Paulo
spring.datasource.username= usernamehere
spring.datasource.password= passwordhere
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
server.port=8080
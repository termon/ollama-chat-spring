# SpringAI Chat Client

This Spring application uses the following stack

1. [Spring Boot](https://spring.io/projects/spring-boot)
2. [Spring AI](https://spring.io/projects/spring-ai)
2. [Ollama](https://ollama.com/) 
3. [Tailwind](https://tailwindcss.com/)
4. [HTMX](https://htmx.org/)

## Description

By using `Ollama` we can install and run free LLMs locally. In this project we are using the `phi4` LLM which is a `14b` parameter `9.1Gb` model.

In the project

- The `@PostMapping("/chat")` route calls the LLM. 

- The `/chat` route component provides the basic chat UI.

> If you wish to use a different LLM within Ollama, then update the `application.properties` key `spring.ai.ollama.chat.options.model`.

- HTMX is used to provide simple UI enhancements (without the need for custom Javascript or a front-end library such as React). 

> Note: TBC - The application UI could be improved via the use of a streaming response


## Running the Application

1. Install Ollama and a selected LLM  
2. Clone the repository 
4. Then run using shell command `./mvnw spring-boot:run`

Go to a browser `http://localhost:8080/` and enter messages.

### Reference Documentation
For further reference, please consider the following sections:

* [Spring Web](https://docs.spring.io/spring-boot/3.4.1/reference/web/servlet.html)
* [Spring Data JPA](https://docs.spring.io/spring-boot/3.4.1/reference/data/sql.html#data.sql.jpa-and-spring-data)
* [Ollama](https://docs.spring.io/spring-ai/reference/api/chat/ollama-chat.html)
* [htmx](https://github.com/wimdeblauwe/htmx-spring-boot)




# Java NLP Chatbot

## Overview
This project is a simple AI chatbot built in Java using Natural Language Processing (NLP) techniques with **Apache OpenNLP** and **Spring Boot**. The chatbot can tokenize user input, detect basic sentences, and respond based on predefined logic.

## Features
- Tokenizes user input using Apache OpenNLP
- Basic chatbot logic to handle conversations
- REST API endpoint using Spring Boot
- Dependency management with Maven

## Technologies Used
- Java (JDK 8 or higher)
- Apache OpenNLP (for NLP processing)
- Spring Boot (for REST API)
- Maven (for dependency management)

## Project Structure
```
JavachatNLP/
│── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── com/chatbot/
│   │   │   │   ├── SimpleChatbot.java
│   │   │   │   ├── ChatbotController.java
│   │   ├── resources/
│── pom.xml
```

## Installation & Setup
### 1. Clone the Repository
```sh
git clone https://github.com/RohanCyberOps/JavachatNLP.git
cd JavachatNLP
```

### 2. Build the Project with Maven
```sh
mvn clean install
```

### 3. Run the Chatbot
To start the chatbot in command-line mode:
```sh
java -cp target/JavaNLPChatbot-1.0-SNAPSHOT.jar com.chatbot.SimpleChatbot
```

To run the Spring Boot API:
```sh
mvn spring-boot:run
```

## API Usage
### Endpoint: `/chatbot/respond`
#### Request (POST):
```sh
curl -X POST "http://localhost:8080/chatbot/respond" -d "message=Hello!"
```
#### Response:
```json
{
  "response": "Chatbot: You said: Hello!"
}
```

## Future Enhancements
- Implement intent recognition with machine learning
- Enhance response handling with a knowledge base
- Integrate with external APIs (e.g., weather, news, etc.)

## License
This project is open-source and available under the MIT License.

---
For contributions, feel free to submit a pull request! 🚀


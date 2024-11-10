# Llama API

A powerful web service built with Spring Boot that provides access to the Llama 3.1 language model for generating dynamic text responses and enabling advanced AI capabilities.

## 🚀 Features

- **Conversational Agents**: Create sophisticated chatbots capable of natural dialogue
- **Content Generation**: Automatically generate articles and summaries
- **Creative Assistant**: AI-powered brainstorming and concept development
- **Interactive Learning**: Educational tools with AI-driven responses

## 📋 Prerequisites

- Windows Subsystem for Linux (WSL) or Linux OS
- Terminal or command prompt
- SSH client (for Windows/WSL users only)

## 🛠️ Installation

### 1. Install Ollama

```bash
# Open terminal and run:
curl -fsSL https://ollama.com/install.sh | sh

# Verify installation
ollama --version
```

### 2. Install Llama 3.1 Model

```bash
ollama pull llama3.1
```

### 3. Network Configuration (Windows/WSL Users Only)

1. Find your WSL IP address:
```bash
hostname -I
```

2. Find your WSL username:
```bash
whoami
```

3. Note: Ollama listens on port 11434 by default

### 4. Configure SSH Forwarding (Windows/WSL Users Only)

> 📝 **Note**: Linux users can skip this step and proceed directly to running the Spring Boot application.

1. Create the SSH forwarding script:
```bash
nano ~/enable-ssh-forwarding.sh
```

2. Add the following content (replace USERNAME and IP_ADDRESS with your values):
```bash
#!/bin/bash
ssh -N -L 11434:localhost:11434 USERNAME@IP_ADDRESS

# Example:
# If your username is "john" and IP is "172.24.100.150"
# ssh -N -L 11434:localhost:11434 john@172.24.100.150
```

3. Make the script executable:
```bash
chmod +x ~/enable-ssh-forwarding.sh
```

4. Enable SSH forwarding:
```bash
~/enable-ssh-forwarding.sh
```

### 5. Run Spring Boot Application

Once you've completed the above setup, you can start your Spring Boot application:

```bash
./mvnw spring-boot:run
```

Your application will be available at `http://localhost:8000`

## 🔧 Usage

To interact with the Llama API, send HTTP requests to the appropriate endpoints:

http://localhost:8000/generate

## 🌟 Example Applications

1. **Customer Service Bot**
   - Automated response generation
   - Context-aware conversations
   - Multi-turn dialogue support

2. **Content Creation Platform**
   - Article generation
   - Text summarization
   - Creative writing assistance

3. **Educational Tools**
   - Interactive tutoring
   - Question answering
   - Concept explanation

## 🔒 Security Considerations

- Always use secure connections (HTTPS) in production
- Implement proper authentication mechanisms
- Monitor and rate limit API usage
- Regularly update dependencies

---

Built with ❤️ using Spring Boot and Llama 3.1

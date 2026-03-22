# Sistema de Cadastro e Login

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![Thymeleaf](https://img.shields.io/badge/Thymeleaf-%23005C0F.svg?style=for-the-badge&logo=Thymeleaf&logoColor=white)
![MySQL](https://img.shields.io/badge/mysql-4479A1.svg?style=for-the-badge&logo=mysql&logoColor=white)
![HTML5](https://img.shields.io/badge/html5-%23E34F26.svg?style=for-the-badge&logo=html5&logoColor=white)
![CSS3](https://img.shields.io/badge/css3-%231572B6.svg?style=for-the-badge&logo=css3&logoColor=white)
![JavaScript](https://img.shields.io/badge/javascript-%23323330.svg?style=for-the-badge&logo=javascript&logoColor=%23F7DF1E)

Este é um projeto de autenticação de usuários, desenvolvido com o objetivo de praticar conceitos de desenvolvimento web, como criação de contas, login e gerenciamento de sessões, utilizando Spring Security, Thymeleaf e tecnologias de frontend (HTML, CSS e JavaScript).

## Funcionalidades
- Cadastro de usuário
- Login com autenticação
- Validação de dados
- Home simples com botão de logout
- Mensagens de erro
- Funcionalidade "Remember Me"
- Logout
- Responsividade do frontend

## Endpoints
| Método | Rota               | Descrição                  |
|--------|--------------------|----------------------------|
| POST   | /register  | Cadastra um usuário  |
| POST   | /login  | Realiza login  |
| GET    | /home | Após login |

> Observação: O GET /home só pode ser acessado por usuários autenticados.

## Tecnologias Utilizadas
- **Java 17**
- **Spring Boot**
- **Spring Security**
- **Thymeleaf**
- **Spring Data JPA**
- **Banco de Dados: MySQL**
- **Bean Validation**
- **Lombok**
- **Frontend: HTML, CSS e JavaScript (integrado com Thymeleaf)**

## Demonstração
**Tela de Registro:**
![Tela de registro](devlink/imagens/cadastro.png)

**Tela de Login:**
![Tela de login](devlink/imagens/login.png)


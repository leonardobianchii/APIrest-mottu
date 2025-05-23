# Mototrack - Sistema de Rastreamento de Motos com RFID

## Integrantes do Grupo
- Angello Turano da Costa RM556511
- Cauã Sanches de Santana RM558317
- Leonardo Bianchi RM558576

---

## Descrição do Projeto

O Mototrack é uma API REST desenvolvida em Java com Spring Boot que permite o gerenciamento completo de motos, sensores RFID, localizações e filiais/departamentos. A solução foi criada para facilitar o rastreamento preciso de motos em ambientes fechados, como pátios e depósitos, usando a tecnologia RFID.

A API oferece um sistema robusto de CRUD para as entidades principais, além de funcionalidades para registrar a posição exata das motos por meio dos sensores instalados nas filiais.

---

## Principais Funcionalidades

- Cadastro e gerenciamento de motos
- Cadastro e gerenciamento de sensores RFID
- Registro e consulta das localizações das motos com coordenadas espaciais
- Cadastro e gerenciamento de filiais e departamentos
- Tratamento centralizado de erros e validação dos dados de entrada
- Paginação, ordenação e busca por parâmetros (planejado para futuras versões)
- Cache para otimização de performance
- API estruturada segundo boas práticas REST

---

## Tecnologias Utilizadas

- Java 17
- Spring Boot 3.x
- Spring Data JPA (com Oracle)
- Spring Web (API REST)
- Bean Validation (Jakarta Validation)
- Spring Cache (cache simples em memória)
- Banco de dados Oracle
- Lombok (para reduzir boilerplate no código)

---

## Arquitetura do Sistema

O projeto segue arquitetura em camadas, organizada em:

- **Model**: Entidades JPA que representam as tabelas do banco
- **DTO**: Objetos para transferência de dados entre camadas
- **Repository**: Interfaces para acesso ao banco de dados usando Spring Data JPA
- **Service**: Camada de negócios com a lógica de CRUD e validações
- **Controller**: Endpoints REST que expõem a API para consumo
- **Mapper**: Conversão entre entidades e DTOs
- **Config**: Configurações do projeto, como banco e cache

---

## Entidades Principais e Relacionamentos

- **Moto**: Representa as motos cadastradas (contém modelo, placa, status, quilometragem)
- **SensorRFID**: Sensores que fazem a leitura das motos dentro das filiais
- **LocalizacaoMotoRFID**: Registra as localizações das motos, associadas aos sensores e coordenadas `x` e `y`
- **FilialDepartamento**: Representa as filiais e departamentos onde as motos e sensores estão alocados

---

## Endpoints da API

### Motos
- `GET /api/motos` - Listar todas as motos
- `GET /api/motos/{id}` - Obter moto por ID
- `POST /api/motos` - Criar nova moto
- `PUT /api/motos/{id}` - Atualizar moto existente
- `DELETE /api/motos/{id}` - Deletar moto

### Sensores RFID
- `GET /api/sensores` - Listar todos os sensores
- `GET /api/sensores/{id}` - Obter sensor por ID
- `POST /api/sensores` - Criar novo sensor
- `PUT /api/sensores/{id}` - Atualizar sensor existente
- `DELETE /api/sensores/{id}` - Deletar sensor

### Localizações de Motos
- `GET /api/localizacoes` - Listar todas as localizações
- `GET /api/localizacoes/{id}` - Obter localização por ID
- `POST /api/localizacoes` - Adicionar nova localização
- `PUT /api/localizacoes/{id}` - Atualizar localização existente
- `DELETE /api/localizacoes/{id}` - Deletar localização

### Filiais e Departamentos
- `GET /api/filiais` - Listar todas as filiais/departamentos
- `GET /api/filiais/{id}` - Obter filial/departamento por ID
- `POST /api/filiais` - Criar nova filial/departamento
- `PUT /api/filiais/{id}` - Atualizar filial/departamento existente
- `DELETE /api/filiais/{id}` - Deletar filial/departamento

---

## Como Rodar o Projeto

### Pré-requisitos
- Java 17 instalado e configurado
- Gradle ou Maven instalado
- Banco Oracle acessível com as credenciais configuradas no `application.properties`
- Git instalado

### Passos

### 1. Clone o repositório:

git clone https://github.com/leonardobianchii/APIrest-mottu.git
cd APIrest-mottu

### 2. Configure o banco Oracle em src/main/resources/application.properties com suas credenciais.

Rode o projeto:

  a) Com Gradle:

./gradlew bootRun

  b) Ou com Maven:

mvn spring-boot:run

### 3. A API estará rodando em:

http://localhost:8080

### 4. Testando a API

Use o Postman ou Insomnia para fazer requisições REST.
Exemplo para criar uma moto:

    Método: POST

    URL: http://localhost:8080/api/motos

    Body JSON:

{
  "modelo": "Honda CG 160",
  "idFilialDepartamento": 1,
  "placa": "ABC-1234",
  "statusMoto": "Disponível",
  "kmRodado": 15000
}

### Encerramento

Obrigado por acessar o repositório do projeto Mottu!
Esperamos que esta API facilite o rastreamento e gerenciamento das motos com tecnologia RFID de forma prática e eficiente.
Contribuições, dúvidas e sugestões são sempre bem-vindas!
}


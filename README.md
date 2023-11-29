# Spring Boot Rest API

## Compilación del proyecto

Para compilar el proyecto se debe ejecutar el siguiente comando:

```bash
mvn clean install
```

## Ejecución del proyecto

```bash
mvn spring-boot:run
```

## Test operación hello using curl

```bash
curl -X GET http://localhost:8080/hello
```

## Test operación reverse using curl

```bash
curl http://localhost:8080/reverse?input=hello
```

## Test remove-vowels using curl

```bash
curl http://localhost:8080/remove-vowels?input=hello
```

## Ejecuta test unitarios

```bash
mvn test
```

# Conteinerización

## Construir imagen docker

```bash
docker build -t demo2911 .
```

## Ejecutar imagen docker

```bash
docker run -p 8080:8080 demo2911
```


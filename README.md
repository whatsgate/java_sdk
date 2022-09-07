# swagger-java-client

API whatsgate.ru
- API version: 1.0.0
  - Build date: 2022-09-07T09:16:17.666Z[GMT]

Интерфейс для взаимодействия с клиентом Whatsapp

  For more information, please visit [https://whatsgate.ru/](https://whatsgate.ru/)

*Automatically generated by the [Swagger Codegen](https://github.com/swagger-api/swagger-codegen)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>io.swagger</groupId>
  <artifactId>swagger-java-client</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/swagger-java-client-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.DefaultApi;

import java.io.File;
import java.util.*;

public class DefaultApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi();
        CheckBody body = new CheckBody(); // CheckBody | Проверяет, зарегистрирован ли указанный номер в WhatsApp. Номер указывается в формате только цифр, например 79999999999
        try {
            InlineResponse2001 result = apiInstance.checkPost(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#checkPost");
            e.printStackTrace();
        }
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.DefaultApi;

import java.io.File;
import java.util.*;

public class DefaultApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi();
        GetchatsBody body = new GetchatsBody(); // GetchatsBody | Запрашивает и возвращает список активных чатов, включая контакты и группы. В объекте группы находится идентификатор группы, список всех участников группы, права участников (является ли участник администратором группы).
        try {
            InlineResponse2002 result = apiInstance.getChatsPost(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#getChatsPost");
            e.printStackTrace();
        }
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.DefaultApi;

import java.io.File;
import java.util.*;

public class DefaultApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi();
        SeenBody body = new SeenBody(); // SeenBody | Команда устанавливает у всех сообщений в указанном чате статус просмотрены.
        try {
            InlineResponse2004 result = apiInstance.seenPost(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#seenPost");
            e.printStackTrace();
        }
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.DefaultApi;

import java.io.File;
import java.util.*;

public class DefaultApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi();
        SendBody body = new SendBody(); // SendBody | Отправляет текстовое или мультимедийное сообщение контакту либо группе. Может использоваться синхронно (возвращает ответ после отправки сообщения, ответ содержит объект отправленного сообщения с идентификатором), либо асинхронно (ответ содержит результат постановки в очередь, а отправленное сообщение приходит на указанный webhook). По умолчанию используется асинхронная отправка.
        try {
            InlineResponse200 result = apiInstance.sendMessage(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#sendMessage");
            e.printStackTrace();
        }
    }
}
```

## Documentation for API Endpoints

All URIs are relative to *https://whatsgate.ru/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**checkPost**](docs/DefaultApi.md#checkPost) | **POST** /check | Проверка зарегистрирован ли номер в WhatsApp
*DefaultApi* | [**getChatsPost**](docs/DefaultApi.md#getChatsPost) | **POST** /get-chats | Возвращает список активных чатов
*DefaultApi* | [**seenPost**](docs/DefaultApi.md#seenPost) | **POST** /seen | Отправляет команду в чат, что последние сообщения просмотрены
*DefaultApi* | [**sendMessage**](docs/DefaultApi.md#sendMessage) | **POST** /send | Отправка сообщения
*_Api* | [**getMediaPost**](docs/_Api.md#getMediaPost) | **POST** /get-media | Возвращает объект медиафайла, прикрепленного к сообщению

## Documentation for Models

 - [AnyOfseenBodyRecipient](docs/AnyOfseenBodyRecipient.md)
 - [AnyOfsendBodyMessage](docs/AnyOfsendBodyMessage.md)
 - [AnyOfsendBodyRecipient](docs/AnyOfsendBodyRecipient.md)
 - [CheckBody](docs/CheckBody.md)
 - [Error](docs/Error.md)
 - [GetchatsBody](docs/GetchatsBody.md)
 - [GetmediaBody](docs/GetmediaBody.md)
 - [InlineResponse200](docs/InlineResponse200.md)
 - [InlineResponse2001](docs/InlineResponse2001.md)
 - [InlineResponse2002](docs/InlineResponse2002.md)
 - [InlineResponse2003](docs/InlineResponse2003.md)
 - [InlineResponse2004](docs/InlineResponse2004.md)
 - [Media](docs/Media.md)
 - [MessageMedia](docs/MessageMedia.md)
 - [MessageText](docs/MessageText.md)
 - [OneOfinlineResponse200Result](docs/OneOfinlineResponse200Result.md)
 - [RecipientId](docs/RecipientId.md)
 - [RecipientNum](docs/RecipientNum.md)
 - [ResponseChat](docs/ResponseChat.md)
 - [ResponseChatGroupMetadata](docs/ResponseChatGroupMetadata.md)
 - [ResponseChatGroupMetadataParticipants](docs/ResponseChatGroupMetadataParticipants.md)
 - [ResponseMessage](docs/ResponseMessage.md)
 - [SeenBody](docs/SeenBody.md)
 - [SendBody](docs/SendBody.md)

## Documentation for Authorization

Authentication schemes defined for the API:
### ApiKeyAuth

- **Type**: API key
- **API key parameter name**: X-API-Key
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author


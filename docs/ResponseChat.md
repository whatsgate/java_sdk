# ResponseChat

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Идентификатор контакта или группы в формате WhatsApp |  [optional]
**name** | **String** | Имя контакта или группы |  [optional]
**isGroup** | **Boolean** | Является ли чат контактом или группой |  [optional]
**isReadOnly** | **Boolean** | Является ли чат ReadOnly |  [optional]
**unreadCount** | **Integer** | Количество непрочитанных сообщений в чате |  [optional]
**timestamp** | **Integer** | Время последней активночти в чате |  [optional]
**pinned** | **Boolean** | Является ли чат закрепленным |  [optional]
**isMuted** | **Boolean** | Выключен ли у чата звук |  [optional]
**muteExpiration** | **Boolean** | Время, оставшееся до включения звука |  [optional]
**groupMetadata** | [**ResponseChatGroupMetadata**](ResponseChatGroupMetadata.md) |  |  [optional]

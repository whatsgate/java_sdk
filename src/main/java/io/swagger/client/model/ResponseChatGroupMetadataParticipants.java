/*
 * API whatsgate.ru
 * Интерфейс для взаимодействия с клиентом Whatsapp
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * ResponseChatGroupMetadataParticipants
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-09-07T09:16:17.666Z[GMT]")
public class ResponseChatGroupMetadataParticipants {
  @SerializedName("id")
  private String id = null;

  @SerializedName("isAdmin")
  private Boolean isAdmin = null;

  @SerializedName("isSuperAdmin")
  private Boolean isSuperAdmin = null;

  public ResponseChatGroupMetadataParticipants id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Идентификатор контакта в формате WhatsApp
   * @return id
  **/
  @Schema(description = "Идентификатор контакта в формате WhatsApp")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ResponseChatGroupMetadataParticipants isAdmin(Boolean isAdmin) {
    this.isAdmin = isAdmin;
    return this;
  }

   /**
   * Является ли участник администратором
   * @return isAdmin
  **/
  @Schema(description = "Является ли участник администратором")
  public Boolean isIsAdmin() {
    return isAdmin;
  }

  public void setIsAdmin(Boolean isAdmin) {
    this.isAdmin = isAdmin;
  }

  public ResponseChatGroupMetadataParticipants isSuperAdmin(Boolean isSuperAdmin) {
    this.isSuperAdmin = isSuperAdmin;
    return this;
  }

   /**
   * Является ли участник суперадминистратором
   * @return isSuperAdmin
  **/
  @Schema(description = "Является ли участник суперадминистратором")
  public Boolean isIsSuperAdmin() {
    return isSuperAdmin;
  }

  public void setIsSuperAdmin(Boolean isSuperAdmin) {
    this.isSuperAdmin = isSuperAdmin;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseChatGroupMetadataParticipants responseChatGroupMetadataParticipants = (ResponseChatGroupMetadataParticipants) o;
    return Objects.equals(this.id, responseChatGroupMetadataParticipants.id) &&
        Objects.equals(this.isAdmin, responseChatGroupMetadataParticipants.isAdmin) &&
        Objects.equals(this.isSuperAdmin, responseChatGroupMetadataParticipants.isSuperAdmin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, isAdmin, isSuperAdmin);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseChatGroupMetadataParticipants {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isAdmin: ").append(toIndentedString(isAdmin)).append("\n");
    sb.append("    isSuperAdmin: ").append(toIndentedString(isSuperAdmin)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

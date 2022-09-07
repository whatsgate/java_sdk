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
 * GetchatsBody
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-09-07T09:16:17.666Z[GMT]")
public class GetchatsBody {
  @SerializedName("WhatsappID")
  private String whatsappID = null;

  public GetchatsBody whatsappID(String whatsappID) {
    this.whatsappID = whatsappID;
    return this;
  }

   /**
   * Идентификатор Whatsapp ID
   * @return whatsappID
  **/
  @Schema(description = "Идентификатор Whatsapp ID")
  public String getWhatsappID() {
    return whatsappID;
  }

  public void setWhatsappID(String whatsappID) {
    this.whatsappID = whatsappID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetchatsBody getchatsBody = (GetchatsBody) o;
    return Objects.equals(this.whatsappID, getchatsBody.whatsappID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(whatsappID);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetchatsBody {\n");
    
    sb.append("    whatsappID: ").append(toIndentedString(whatsappID)).append("\n");
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